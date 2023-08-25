package org.hehe.vegestore.entity;



import javax.persistence.*;
import java.util.Set;

@Entity(name = "OrderStatus")
public class OrderStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int orderStatusID;

    @Column(name = "Description")
    private String description;

    @OneToMany(mappedBy = "orderStatusID")
    private Set<OrdersEntity> orderStatusOrder;

    public OrderStatusEntity() {
    }

    public OrderStatusEntity(int orderStatusID, String description, Set<OrdersEntity> orderStatusOrder) {
        this.orderStatusID = orderStatusID;
        this.description = description;
        this.orderStatusOrder = orderStatusOrder;
    }

    public int getOrderStatusID() {
        return orderStatusID;
    }

    public void setOrderStatusID(int orderStatusID) {
        this.orderStatusID = orderStatusID;
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
