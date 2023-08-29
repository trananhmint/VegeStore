package org.hehe.vegestore.entity;


import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

@Entity(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

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

    @OneToMany(mappedBy = "category")
    private Set<ProductsEntity> products;

    public CategoryEntity() {
    }

    public CategoryEntity(int id, String name, UsersEntity creationUser, Date creationTimestamp, UsersEntity lastUpdateUser, Date lastUpdateTimestamp, StatusEntity status, Set<ProductsEntity> products) {
        this.id = id;
        this.name = name;
        this.creationUser = creationUser;
        this.creationTimestamp = creationTimestamp;
        this.lastUpdateUser = lastUpdateUser;
        this.lastUpdateTimestamp = lastUpdateTimestamp;
        this.status = status;
        this.products = products;
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

    public Set<ProductsEntity> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductsEntity> products) {
        this.products = products;
    }
}
