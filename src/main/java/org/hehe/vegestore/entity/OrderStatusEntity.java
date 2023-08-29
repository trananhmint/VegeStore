package org.hehe.vegestore.entity;



import jakarta.persistence.*;
import java.util.Set;

@Entity(name = "orderstatus")
public class OrderStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "orderStatus")
    private Set<OrdersEntity> orders;

    public OrderStatusEntity() {
    }

    public OrderStatusEntity(int id, String description, Set<OrdersEntity> orders) {
        this.id = id;
        this.description = description;
        this.orders = orders;
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

    public Set<OrdersEntity> getOrders() {
        return orders;
    }

    public void setOrders(Set<OrdersEntity> orders) {
        this.orders = orders;
    }
}
