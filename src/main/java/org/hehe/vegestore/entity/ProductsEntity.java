package org.hehe.vegestore.entity;


import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "product")
public class ProductsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private float price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "image_url")
    private String imageURL;

    @ManyToOne
    @JoinColumn(name = "creation_user_id")
    private UsersEntity creationUser;

    @Column(name = "creation_timestamp")
    private Date creationTimestamp;

    @ManyToOne
    @JoinColumn(name = "last_update_userid")
    private UsersEntity lastUpdateUser;

    @Column(name = "last_update_timestamp")
    private Date lastUpdateTimestamp;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private StatusEntity status;

    @OneToMany(mappedBy = "product")
    private Set<ReviewsEntity> reviews;

    @OneToMany(mappedBy = "product")
    private Set<CartItemsEntity> cartItems;

    @OneToMany(mappedBy = "product")
    private Set<OrderItemsEntity> orderItems;

    public ProductsEntity() {
    }

    public ProductsEntity(int id, String name, String description, float price, CategoryEntity category, int quantity, String imageURL, UsersEntity creationUser, Date creationTimestamp, UsersEntity lastUpdateUser, Date lastUpdateTimestamp, StatusEntity status, Set<ReviewsEntity> reviews, Set<CartItemsEntity> cartItems, Set<OrderItemsEntity> orderItems) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.imageURL = imageURL;
        this.creationUser = creationUser;
        this.creationTimestamp = creationTimestamp;
        this.lastUpdateUser = lastUpdateUser;
        this.lastUpdateTimestamp = lastUpdateTimestamp;
        this.status = status;
        this.reviews = reviews;
        this.cartItems = cartItems;
        this.orderItems = orderItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public UsersEntity getCreationUser() {
        return creationUser;
    }

    public void setCreationUser(UsersEntity creationUser) {
        this.creationUser = creationUser;
    }

    public Date getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public UsersEntity getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(UsersEntity lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public Date getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    public void setLastUpdateTimestamp(Date lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    public StatusEntity getStatus() {
        return status;
    }

    public void setStatus(StatusEntity status) {
        this.status = status;
    }

    public Set<ReviewsEntity> getReviews() {
        return reviews;
    }

    public void setReviews(Set<ReviewsEntity> reviews) {
        this.reviews = reviews;
    }

    public Set<CartItemsEntity> getCartItems() {
        return cartItems;
    }

    public void setCartItems(Set<CartItemsEntity> cartItems) {
        this.cartItems = cartItems;
    }

    public Set<OrderItemsEntity> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItemsEntity> orderItems) {
        this.orderItems = orderItems;
    }
}
