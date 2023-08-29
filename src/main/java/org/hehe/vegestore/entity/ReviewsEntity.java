package org.hehe.vegestore.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "reviews")
public class ReviewsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsersEntity userID;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductsEntity productID;

    @ManyToOne
    @JoinColumn(name = "rating_id")
    private RatingEntity ratingID;

    @Column(name = "review_text")
    private String reviewText;

    @Column(name = "review_date")
    private Date reviewDate;

    public ReviewsEntity() {
    }

    public ReviewsEntity(int id, UsersEntity userID, ProductsEntity productID, RatingEntity ratingID, String reviewText, Date reviewDate) {
        this.id = id;
        this.userID = userID;
        this.productID = productID;
        this.ratingID = ratingID;
        this.reviewText = reviewText;
        this.reviewDate = reviewDate;
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

    public ProductsEntity getProductID() {
        return productID;
    }

    public void setProductID(ProductsEntity productID) {
        this.productID = productID;
    }

    public RatingEntity getRatingID() {
        return ratingID;
    }

    public void setRatingID(RatingEntity ratingID) {
        this.ratingID = ratingID;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }
}
