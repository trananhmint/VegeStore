package org.hehe.vegestore.entity;


import javax.persistence.*;
import java.util.Set;

@Entity(name = "Cart")
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartID;

    @ManyToOne
    @JoinColumn(name = "UserID")
    private UsersEntity userID;

    @OneToMany(mappedBy = "cartID")
    private Set<CartItemsEntity> cartCartItem;

    public CartEntity() {
    }

    public CartEntity(int cartID, UsersEntity userID, Set<CartItemsEntity> cartCartItem) {
        this.cartID = cartID;
        this.userID = userID;
        this.cartCartItem = cartCartItem;
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public UsersEntity getUserID() {
        return userID;
    }

    public void setUserID(UsersEntity userID) {
        this.userID = userID;
    }

    public Set<CartItemsEntity> getCartCartItem() {
        return cartCartItem;
    }

    public void setCartCartItem(Set<CartItemsEntity> cartCartItem) {
        this.cartCartItem = cartCartItem;
    }
}
