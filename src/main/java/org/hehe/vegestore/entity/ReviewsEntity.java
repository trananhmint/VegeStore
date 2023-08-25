package org.hehe.vegestore.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Reviews")
public class ReviewsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewID;

    @ManyToOne
    @JoinColumn(name = "UserID")
    private UsersEntity userID;

    @ManyToOne
    @JoinColumn(name = "ProductID")
    private ProductsEntity productID;

    @ManyToOne
    @JoinColumn(name = "RatingID")
    private RatingEntity ratingID;

    @Column(name = "ReviewText")
    private String reviewText;

    @Column(name = "ReviewDate")
    private Date reviewDate;

    public ReviewsEntity() {
    }

    public ReviewsEntity(int reviewID, UsersEntity userID, ProductsEntity productID, RatingEntity ratingID, String reviewText, Date reviewDate) {
        this.reviewID = reviewID;
        this.userID = userID;
        this.productID = productID;
        this.ratingID = ratingID;
        this.reviewText = reviewText;
        this.reviewDate = reviewDate;
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
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
