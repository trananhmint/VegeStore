package org.hehe.vegestore.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity(name = "payment")
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrdersEntity order;

    @Column(name = "payment_amount")
    private float paymentAmount;

    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(name = "payment_method")
    private String paymentMethod;

    @ManyToOne
    @JoinColumn(name = "payment_status_id")
    private PaymentStatusEntity paymentStatus;

    public PaymentEntity() {
    }

    public PaymentEntity(int id, OrdersEntity order, float paymentAmount, Date paymentDate, String paymentMethod, PaymentStatusEntity paymentStatus) {
        this.id = id;
        this.order = order;
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrdersEntity getOrder() {
        return order;
    }

    public void setOrder(OrdersEntity order) {
        this.order = order;
    }

    public float getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(float paymentAmount) {
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

    public PaymentStatusEntity getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatusEntity paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
