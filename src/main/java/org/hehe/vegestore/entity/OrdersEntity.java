package org.hehe.vegestore.entity;


import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "orders")
public class OrdersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsersEntity user;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "total_amount")
    private float totalAmount;

    @ManyToOne
    @JoinColumn(name = "shipping_address_id")
    private ShippingAddressEntity shippingAddress;

    @ManyToOne
    @JoinColumn(name = "order_status_id")
    private OrderStatusEntity orderStatus;

    @OneToMany(mappedBy = "order")
    private Set<OrderItemsEntity> orderItems;

    @OneToMany(mappedBy = "order")
    private Set<PaymentEntity> payments;

    public OrdersEntity() {
    }

    public OrdersEntity(int id, UsersEntity user, Date orderDate, float totalAmount, ShippingAddressEntity shippingAddress, OrderStatusEntity orderStatus, Set<OrderItemsEntity> orderItems, Set<PaymentEntity> payments) {
        this.id = id;
        this.user = user;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.shippingAddress = shippingAddress;
        this.orderStatus = orderStatus;
        this.orderItems = orderItems;
        this.payments = payments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
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

    public ShippingAddressEntity getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddressEntity shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public OrderStatusEntity getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatusEntity orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Set<OrderItemsEntity> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItemsEntity> orderItems) {
        this.orderItems = orderItems;
    }

    public Set<PaymentEntity> getPayments() {
        return payments;
    }

    public void setPayments(Set<PaymentEntity> payments) {
        this.payments = payments;
    }

    @Override
    public String toString() {
        return "OrdersEntity{" +
                "id=" + id +
                ", user=" + user +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                ", shippingAddress=" + shippingAddress +
                ", orderStatus=" + orderStatus +
                ", orderItems=" + orderItems +
                ", payments=" + payments +
                '}';
    }
}
