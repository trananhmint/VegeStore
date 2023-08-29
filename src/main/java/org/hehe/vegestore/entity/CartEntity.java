package org.hehe.vegestore.entity;


import jakarta.persistence.*;
import java.util.Set;

@Entity(name = "cart")
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsersEntity user;

    @OneToMany(mappedBy = "cart")
    private Set<CartItemsEntity> cartItems;

    public CartEntity() {
    }

    public CartEntity(int id, UsersEntity user, Set<CartItemsEntity> cartItems) {
        this.id = id;
        this.user = user;
        this.cartItems = cartItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
    }

    public Set<CartItemsEntity> getCartItems() {
        return cartItems;
    }

    public void setCartItems(Set<CartItemsEntity> cartItems) {
        this.cartItems = cartItems;
    }
}
