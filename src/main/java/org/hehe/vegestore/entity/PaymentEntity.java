package org.hehe.vegestore.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "payment")
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrdersEntity orderID;

    @Column(name = "payment_amount")
    private int paymentAmount;

    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(name = "payment_method")
    private String paymentMethod;

    @ManyToOne
    @JoinColumn(name = "payment_status_id")
    private PaymentStatusEntity paymentStatusID;

    public PaymentEntity() {
    }

    public PaymentEntity(int id, OrdersEntity orderID, int paymentAmount, Date paymentDate, String paymentMethod, PaymentStatusEntity paymentStatusID) {
        this.id = id;
        this.orderID = orderID;
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.paymentStatusID = paymentStatusID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrdersEntity getOrderID() {
        return orderID;
    }

    public void setOrderID(OrdersEntity orderID) {
        this.orderID = orderID;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentStatusEntity getPaymentStatusID() {
        return paymentStatusID;
    }

    public void setPaymentStatusID(PaymentStatusEntity paymentStatusID) {
        this.paymentStatusID = paymentStatusID;
    }
}
