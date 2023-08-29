package org.hehe.vegestore.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "orders")
public class OrdersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsersEntity userID;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "total_amount")
    private float totalAmount;

    @ManyToOne
    @JoinColumn(name = "order_status_id")
    private OrderStatusEntity orderStatusID;

    @OneToMany(mappedBy = "orderID")
    private Set<OrderItemsEntity> orderOrderItem;

    @OneToMany(mappedBy = "orderID")
    private Set<PaymentEntity> orderPayment;

    public OrdersEntity() {
    }

    public OrdersEntity(int id, UsersEntity userID, Date orderDate, float totalAmount, OrderStatusEntity orderStatusID, Set<OrderItemsEntity> orderOrderItem, Set<PaymentEntity> orderPayment) {
        this.id = id;
        this.userID = userID;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.orderStatusID = orderStatusID;
        this.orderOrderItem = orderOrderItem;
        this.orderPayment = orderPayment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Set<PaymentEntity> getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(Set<PaymentEntity> orderPayment) {
        this.orderPayment = orderPayment;
    }
}
