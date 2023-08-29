package org.hehe.vegestore.entity;


import javax.persistence.*;
import java.util.Set;

@Entity(name = "rating")
public class RatingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "ratingID")
    private Set<ReviewsEntity> ratingReview;

    public RatingEntity() {
    }

    public RatingEntity(int id, String description, Set<ReviewsEntity> ratingReview) {
        this.id = id;
        this.description = description;
        this.ratingReview = ratingReview;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
