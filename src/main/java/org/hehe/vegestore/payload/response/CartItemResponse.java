package org.hehe.vegestore.payload.response;

public class CartItemResponse {
    private int id;
    private ProductsResponse productsResponse;
    private int quantity;

    public CartItemResponse() {
    }

    public CartItemResponse(int id, ProductsResponse productsResponse, int quantity) {
        this.id = id;
        this.productsResponse = productsResponse;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
