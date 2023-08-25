package org.hehe.vegestore.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Payment")
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentID;

    @ManyToOne
    @JoinColumn(name = "OrderID")
    private OrdersEntity orderID;

    @Column(name = "PaymentAmount")
    private int paymentAmount;

    @Column(name = "PaymentDate")
    private Date paymentDate;

    @Column(name = "PaymentMethod")
    private String paymentMethod;

    @ManyToOne
    @JoinColumn(name = "PaymentStatusID")
    private PaymentStatusEntity paymentStatusID;

    public PaymentEntity() {
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
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
