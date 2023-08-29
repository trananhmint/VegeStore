package org.hehe.vegestore.entity;

import jakarta.persistence.*;
import java.util.Set;
@Entity(name = "status")
public class StatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "status")
    private Set<UsersEntity> users;

    @OneToMany(mappedBy = "status")
    private Set<ProductsEntity> products;

    @OneToMany(mappedBy = "status")
    private Set<CategoryEntity> categories;

    public StatusEntity() {
    }

    public StatusEntity(int id, String description, Set<UsersEntity> users, Set<ProductsEntity> products, Set<CategoryEntity> categories) {
        this.id = id;
        this.description = description;
        this.users = users;
        this.products = products;
        this.categories = categories;
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

    public Set<UsersEntity> getUsers() {
        return users;
    }

    public void setUsers(Set<UsersEntity> users) {
        this.users = users;
    }

    public Set<ProductsEntity> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductsEntity> products) {
        this.products = products;
    }

    public Set<CategoryEntity> getCategories() {
        return categories;
    }

    public void setCategories(Set<CategoryEntity> categories) {
        this.categories = categories;
    }
}
