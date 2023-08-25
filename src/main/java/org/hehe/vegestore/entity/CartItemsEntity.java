package org.hehe.vegestore.entity;


import javax.persistence.*;

@Entity(name = "CartItems")
public class CartItemsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartItemID;

    @ManyToOne
    @JoinColumn(name = "CartID", insertable = false,updatable = false)
    private CartEntity cartID;

    @ManyToOne
    @JoinColumn(name = "ProductID", insertable = false,updatable = false)
    private ProductsEntity productID;

    @Column(name = "Quantity")
    private int quantity;

    public CartItemsEntity() {
    }

    public CartItemsEntity(int cartItemID, CartEntity cartID, ProductsEntity productID, int quantity) {
        this.cartItemID = cartItemID;
        this.cartID = cartID;
        this.productID = productID;
        this.quantity = quantity;
    }

    public int getCartItemID() {
        return cartItemID;
    }

    public void setCartItemID(int cartItemID) {
        this.cartItemID = cartItemID;
    }

    public CartEntity getCartID() {
        return cartID;
    }

    public void setCartID(CartEntity cartID) {
        this.cartID = cartID;
    }

    public ProductsEntity getProductID() {
        return productID;
    }

    public void setProductID(ProductsEntity productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
