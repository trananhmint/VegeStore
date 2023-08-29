package org.hehe.vegestore.entity;


import jakarta.persistence.*;

@Entity(name = "cartitems")
public class CartItemsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "cart_id", insertable = false,updatable = false)
    private CartEntity cart;

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false,updatable = false)
    private ProductsEntity product;

    @Column(name = "quantity")
    private int quantity;

    public CartItemsEntity() {
    }

    public CartItemsEntity(int id, CartEntity cart, ProductsEntity product, int quantity) {
        this.id = id;
        this.cart = cart;
        this.product = product;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CartEntity getCart() {
        return cart;
    }

    public void setCart(CartEntity cart) {
        this.cart = cart;
    }

    public ProductsEntity getProduct() {
        return product;
    }

    public void setProduct(ProductsEntity product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
