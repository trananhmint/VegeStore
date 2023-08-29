package org.hehe.vegestore.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "paymentstatus")
public class PaymentStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "paymentStatusID")
    private Set<PaymentEntity> statusPayment;

    public PaymentStatusEntity() {
    }

    public PaymentStatusEntity(int id, String description, Set<PaymentEntity> statusPayment) {
        this.id = id;
        this.description = description;
        this.statusPayment = statusPayment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
