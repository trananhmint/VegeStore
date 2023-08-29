package org.hehe.vegestore.entity;


import jakarta.persistence.*;
import java.util.Set;

@Entity(name = "rating")
public class RatingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "rating")
    private Set<ReviewsEntity> reviews;

    public RatingEntity() {
    }

    public RatingEntity(int id, String description, Set<ReviewsEntity> reviews) {
        this.id = id;
        this.description = description;
        this.reviews = reviews;
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

    public Set<ReviewsEntity> getReviews() {
        return reviews;
    }

    public void setReviews(Set<ReviewsEntity> reviews) {
        this.reviews = reviews;
    }
}
