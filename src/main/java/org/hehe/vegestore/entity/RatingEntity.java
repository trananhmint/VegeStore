package org.hehe.vegestore.entity;


import javax.persistence.*;
import java.util.Set;

@Entity(name = "Rating")
public class RatingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ratingID;

    @Column(name = "Description")
    private String description;

    @OneToMany(mappedBy = "ratingID")
    private Set<ReviewsEntity> ratingReview;

    public RatingEntity() {
    }

    public RatingEntity(int ratingID, String description, Set<ReviewsEntity> ratingReview) {
        this.ratingID = ratingID;
        this.description = description;
        this.ratingReview = ratingReview;
    }

    public int getRatingID() {
        return ratingID;
    }

    public void setRatingID(int ratingID) {
        this.ratingID = ratingID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<ReviewsEntity> getRatingReview() {
        return ratingReview;
    }

    public void setRatingReview(Set<ReviewsEntity> ratingReview) {
        this.ratingReview = ratingReview;
    }
}
