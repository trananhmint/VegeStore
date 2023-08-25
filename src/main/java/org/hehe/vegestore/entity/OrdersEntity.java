package org.hehe.vegestore.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "Orders")
public class OrdersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderID;

    @ManyToOne
    @JoinColumn(name = "UserID")
    private UsersEntity userID;

    @Column(name = "OrderDate")
    private Date orderDate;

    @Column(name = "TotalAmount")
    private float totalAmount;

    @ManyToOne
    @JoinColumn(name = "OrderStatusID")
    private OrderStatusEntity orderStatusID;

    @OneToMany(mappedBy = "orderID")
    private Set<OrderItemsEntity> orderOrderItem;

    @OneToMany(mappedBy = "orderID")
    private Set<PaymentEntity> orderPayment;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public UsersEntity getUserID() {
        return userID;
    }

    public void setUserID(UsersEntity userID) {
        this.userID = userID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public OrderStatusEntity getOrderStatusID() {
        return orderStatusID;
    }

    public void setOrderStatusID(OrderStatusEntity orderStatusID) {
        this.orderStatusID = orderStatusID;
    }

    public Set<OrderItemsEntity> getOrderOrderItem() {
        return orderOrderItem;
    }

    public void setOrderOrderItem(Set<OrderItemsEntity> orderOrderItem) {
        this.orderOrderItem = orderOrderItem;
    }
}
