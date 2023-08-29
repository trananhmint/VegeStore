package org.hehe.vegestore.entity;



import javax.persistence.*;
import java.util.Set;

@Entity(name = "orderstatus")
public class OrderStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "orderStatusID")
    private Set<OrdersEntity> orderStatusOrder;

    public OrderStatusEntity() {
    }

    public OrderStatusEntity(int id, String description, Set<OrdersEntity> orderStatusOrder) {
        this.id = id;
        this.description = description;
        this.orderStatusOrder = orderStatusOrder;
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

    public Set<OrdersEntity> getOrderStatusOrder() {
        return orderStatusOrder;
    }

    public void setOrderStatusOrder(Set<OrdersEntity> orderStatusOrder) {
        this.orderStatusOrder = orderStatusOrder;
    }
}
