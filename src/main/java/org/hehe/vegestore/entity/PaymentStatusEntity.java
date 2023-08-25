package org.hehe.vegestore.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "PaymentStatus")
public class PaymentStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentStatusID;

    @Column(name = "Description")
    private String description;

    @OneToMany(mappedBy = "paymentStatusID")
    private Set<PaymentEntity> statusPayment;

    public PaymentStatusEntity() {
    }

    public PaymentStatusEntity(String description, Set<PaymentEntity> statusPayment) {
        this.description = description;
        this.statusPayment = statusPayment;
    }

    public int getPaymentStatusID() {
        return paymentStatusID;
    }

    public void setPaymentStatusID(int paymentStatusID) {
        this.paymentStatusID = paymentStatusID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<PaymentEntity> getStatusPayment() {
        return statusPayment;
    }

    public void setStatusPayment(Set<PaymentEntity> statusPayment) {
        this.statusPayment = statusPayment;
    }
}
