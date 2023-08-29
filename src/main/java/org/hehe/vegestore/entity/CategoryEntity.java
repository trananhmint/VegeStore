package org.hehe.vegestore.entity;


import javax.persistence.*;
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

    @OneToMany(mappedBy = "categoryID")
    private Set<ProductsEntity> categoryProduct;

    public CategoryEntity(int id, String name, UsersEntity creationUserID, Date creationTimestamp, UsersEntity lastUpdateUserID, Date lastUpdateTimestamp, StatusEntity statusID, Set<ProductsEntity> categoryProduct) {
        this.id = id;
        this.name = name;
        this.creationUserID = creationUserID;
        this.creationTimestamp = creationTimestamp;
        this.lastUpdateUserID = lastUpdateUserID;
        this.lastUpdateTimestamp = lastUpdateTimestamp;
        this.statusID = statusID;
        this.categoryProduct = categoryProduct;
    }

    public CategoryEntity() {
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

    public Set<ProductsEntity> getCategoryProduct() {
        return categoryProduct;
    }

    public void setCategoryProduct(Set<ProductsEntity> categoryProduct) {
        this.categoryProduct = categoryProduct;
    }
}
