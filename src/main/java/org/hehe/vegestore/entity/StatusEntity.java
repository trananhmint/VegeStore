package org.hehe.vegestore.entity;

import javax.persistence.*;
import java.util.Set;
@Entity(name = "Status")
public class StatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int statusID;

    @Column(name = "Description")
    private String description;

    @OneToMany(mappedBy = "statusID")
    private Set<UsersEntity> statusUser;

    @OneToMany(mappedBy = "statusID")
    private Set<ProductsEntity> statusProduct;

    @OneToMany(mappedBy = "statusID")
    private Set<CategoryEntity> statusCategory;

    public StatusEntity() {
    }

    public StatusEntity(int statusID, String description, Set<UsersEntity> statusUser, Set<ProductsEntity> statusProduct, Set<CategoryEntity> statusCategory) {
        this.statusID = statusID;
        this.description = description;
        this.statusUser = statusUser;
        this.statusProduct = statusProduct;
        this.statusCategory = statusCategory;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<UsersEntity> getStatusUser() {
        return statusUser;
    }

    public void setStatusUser(Set<UsersEntity> statusUser) {
        this.statusUser = statusUser;
    }

    public Set<ProductsEntity> getStatusProduct() {
        return statusProduct;
    }

    public void setStatusProduct(Set<ProductsEntity> statusProduct) {
        this.statusProduct = statusProduct;
    }

    public Set<CategoryEntity> getStatusCategory() {
        return statusCategory;
    }

    public void setStatusCategory(Set<CategoryEntity> statusCategory) {
        this.statusCategory = statusCategory;
    }
}
