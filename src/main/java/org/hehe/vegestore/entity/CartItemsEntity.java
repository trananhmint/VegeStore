package org.hehe.vegestore.entity;


import javax.persistence.*;

@Entity(name = "cartitems")
public class CartItemsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "cart_id", insertable = false,updatable = false)
    private CartEntity cartID;

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false,updatable = false)
    private ProductsEntity productID;

    @Column(name = "quantity")
    private int quantity;

    public CartItemsEntity() {
    }

    public CartItemsEntity(int id, CartEntity cartID, ProductsEntity productID, int quantity) {
        this.id = id;
        this.cartID = cartID;
        this.productID = productID;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
