package org.hehe.vegestore.entity;


import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
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
    private CategoryEntity categoryID;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "image_url")
    private String imageURL;

    @ManyToOne
    @JoinColumn(name = "creation_user_id")
    private UsersEntity creationUserID;

    @Column(name = "creation_timestamp")
    private Date creationTimestamp;

    @ManyToOne
    @JoinColumn(name = "last_update_userid")
    private UsersEntity lastUpdateUserID;

    @Column(name = "last_update_timestamp")
    private Date lastUpdateTimestamp;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private StatusEntity statusID;

    @OneToMany(mappedBy = "productID")
    private Set<ReviewsEntity> productReview;

    @OneToMany(mappedBy = "productID")
    private Set<CartItemsEntity> productCartItem;

    @OneToMany(mappedBy = "productID")
    private Set<OrderItemsEntity> productOrderItem;

    public ProductsEntity() {
    }

    public ProductsEntity(int id, String name, String description, float price, CategoryEntity categoryID, int quantity, String imageURL, UsersEntity creationUserID, Date creationTimestamp, UsersEntity lastUpdateUserID, Date lastUpdateTimestamp, StatusEntity statusID, Set<ReviewsEntity> productReview, Set<CartItemsEntity> productCartItem, Set<OrderItemsEntity> productOrderItem) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryID = categoryID;
        this.quantity = quantity;
        this.imageURL = imageURL;
        this.creationUserID = creationUserID;
        this.creationTimestamp = creationTimestamp;
        this.lastUpdateUserID = lastUpdateUserID;
        this.lastUpdateTimestamp = lastUpdateTimestamp;
        this.statusID = statusID;
        this.productReview = productReview;
        this.productCartItem = productCartItem;
        this.productOrderItem = productOrderItem;
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

    public CategoryEntity getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(CategoryEntity categoryID) {
        this.categoryID = categoryID;
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

    public UsersEntity getCreationUserID() {
        return creationUserID;
    }

    public void setCreationUserID(UsersEntity creationUserID) {
        this.creationUserID = creationUserID;
    }

    public Date getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public UsersEntity getLastUpdateUserID() {
        return lastUpdateUserID;
    }

    public void setLastUpdateUserID(UsersEntity lastUpdateUserID) {
        this.lastUpdateUserID = lastUpdateUserID;
    }

    public Date getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    public void setLastUpdateTimestamp(Date lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    public StatusEntity getStatusID() {
        return statusID;
    }

    public void setStatusID(StatusEntity statusID) {
        this.statusID = statusID;
    }

    public Set<ReviewsEntity> getProductReview() {
        return productReview;
    }

    public void setProductReview(Set<ReviewsEntity> productReview) {
        this.productReview = productReview;
    }

    public Set<CartItemsEntity> getProductCartItem() {
        return productCartItem;
    }

    public void setProductCartItem(Set<CartItemsEntity> productCartItem) {
        this.productCartItem = productCartItem;
    }

    public Set<OrderItemsEntity> getProductOrderItem() {
        return productOrderItem;
    }

    public void setProductOrderItem(Set<OrderItemsEntity> productOrderItem) {
        this.productOrderItem = productOrderItem;
    }
}
