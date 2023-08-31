package org.hehe.vegestore.payload.response;

import java.util.Date;

public class OrderResponse {
    private int id;
    private UsersResponse usersResponse;
    private Date orderDate;
    private float totalAmount;
    private ShippingAdressResponse shippingAdressResponse;
    private OrderStatusResponse orderStatusResponse;

    private PaymentResponse paymentResponse;

    public OrderResponse() {
    }

    public OrderResponse(int id, UsersResponse usersResponse, Date orderDate, float totalAmount, ShippingAdressResponse shippingAdressResponse, OrderStatusResponse orderStatusResponse, PaymentResponse paymentResponse) {
        this.id = id;
        this.usersResponse = usersResponse;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.shippingAdressResponse = shippingAdressResponse;
        this.orderStatusResponse = orderStatusResponse;
        this.paymentResponse = paymentResponse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UsersResponse getUsersResponse() {
        return usersResponse;
    }

    public void setUsersResponse(UsersResponse usersResponse) {
        this.usersResponse = usersResponse;
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

    public ShippingAdressResponse getShippingAdressResponse() {
        return shippingAdressResponse;
    }

    public void setShippingAdressResponse(ShippingAdressResponse shippingAdressResponse) {
        this.shippingAdressResponse = shippingAdressResponse;
    }

    public OrderStatusResponse getOrderStatusResponse() {
        return orderStatusResponse;
    }

    public void setOrderStatusResponse(OrderStatusResponse orderStatusResponse) {
        this.orderStatusResponse = orderStatusResponse;
    }

    public PaymentResponse getPaymentResponse() {
        return paymentResponse;
    }

    public void setPaymentResponse(PaymentResponse paymentResponse) {
        this.paymentResponse = paymentResponse;
    }
}
