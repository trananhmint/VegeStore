package org.hehe.vegestore.entity;


import javax.persistence.*;
import java.util.Set;

@Entity(name = "cart")
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsersEntity userID;

    @OneToMany(mappedBy = "cartID")
    private Set<CartItemsEntity> cartCartItem;

    public CartEntity() {
    }

    public CartEntity(int id, UsersEntity userID, Set<CartItemsEntity> cartCartItem) {
        this.id = id;
        this.userID = userID;
        this.cartCartItem = cartCartItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
