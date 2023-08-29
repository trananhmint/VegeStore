package org.hehe.vegestore.entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity(name = "paymentstatus")
public class PaymentStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "paymentStatus")
    private Set<PaymentEntity> payments;

    public PaymentStatusEntity() {
    }

    public PaymentStatusEntity(int id, String description, Set<PaymentEntity> payments) {
        this.id = id;
        this.description = description;
        this.payments = payments;
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

    public Set<PaymentEntity> getPayments() {
        return payments;
    }

    public void setPayments(Set<PaymentEntity> payments) {
        this.payments = payments;
    }
}
