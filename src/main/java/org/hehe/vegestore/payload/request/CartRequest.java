package org.hehe.vegestore.payload.request;

import org.hehe.vegestore.payload.response.UsersResponse;

import java.util.List;

public class CartRequest {
    private UserRequest userRequest;
    private List<CartItemRequest> listCartItem;
    private PaymentRequest paymentRequest;
    private ShippingAddressRequest shippingAddressRequest;

    public CartRequest() {
    }

    public CartRequest(UserRequest userRequest, List<CartItemRequest> listCartItem, PaymentRequest paymentRequest, ShippingAddressRequest shippingAddressRequest) {
        this.userRequest = userRequest;
        this.listCartItem = listCartItem;
        this.paymentRequest = paymentRequest;
        this.shippingAddressRequest = shippingAddressRequest;
    }

    public UserRequest getUserRequest() {
        return userRequest;
    }

    public void setUserRequest(UserRequest userRequest) {
        this.userRequest = userRequest;
    }

    public List<CartItemRequest> getListCartItem() {
        return listCartItem;
    }

    public void setListCartItem(List<CartItemRequest> listCartItem) {
        this.listCartItem = listCartItem;
    }

    public PaymentRequest getPaymentRequest() {
        return paymentRequest;
    }

    public void setPaymentRequest(PaymentRequest paymentRequest) {
        this.paymentRequest = paymentRequest;
    }

    public ShippingAddressRequest getShippingAddressRequest() {
        return shippingAddressRequest;
    }

    public void setShippingAddressRequest(ShippingAddressRequest shippingAddressRequest) {
        this.shippingAddressRequest = shippingAddressRequest;
    }
}
