package org.hehe.vegestore.payload.response;

public class OrderItemResponse {
    private ProductsResponse productsResponse;
    private int quantity;
    private float totalPrice = productsResponse.getPrice() * quantity;

    public OrderItemResponse() {
    }

    public OrderItemResponse(ProductsResponse productsResponse, int quantity) {
        this.productsResponse = productsResponse;
        this.quantity = quantity;
    }

    public ProductsResponse getProductsResponse() {
        return productsResponse;
    }

    public void setProductsResponse(ProductsResponse productsResponse) {
        this.productsResponse = productsResponse;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}
