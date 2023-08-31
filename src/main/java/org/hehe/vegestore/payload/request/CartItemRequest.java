package org.hehe.vegestore.payload.request;

public class CartItemRequest {
    private ProductsResquest productsResquest;
    private int quantity;
    private float total = productsResquest.getPrice() * quantity;

    public CartItemRequest() {
    }

    public CartItemRequest(ProductsResquest productsResquest, int quantity) {
        this.productsResquest = productsResquest;
        this.quantity = quantity;
    }

    public ProductsResquest getProductsResquest() {
        return productsResquest;
    }

    public void setProductsResquest(ProductsResquest productsResquest) {
        this.productsResquest = productsResquest;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
