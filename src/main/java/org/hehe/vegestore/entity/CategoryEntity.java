package org.hehe.vegestore.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity(name = "Category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryID;

    @Column(name = "Name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "CreationUserID")
    private UsersEntity creationUserID;

    @Column(name = "CreationTimestamp")
    private Date creationTimestamp;

    @ManyToOne
    @JoinColumn(name = "LastUpdateUserID")
    private UsersEntity lastUpdateUserID;

    @Column(name = "LastUpdateTimestamp")
    private Date lastUpdateTimestamp;

    @ManyToOne
    @JoinColumn(name = "StatusID")
    private StatusEntity statusID;

    @OneToMany(mappedBy = "categoryID")
    private Set<ProductsEntity> categoryProduct;

    public CategoryEntity() {
    }

    public CategoryEntity(int categoryID, String name, UsersEntity creationUserID, Date creationTimestamp, UsersEntity lastUpdateUserID, Date lastUpdateTimestamp, StatusEntity statusID, Set<ProductsEntity> categoryProduct) {
        this.categoryID = categoryID;
        this.name = name;
        this.creationUserID = creationUserID;
        this.creationTimestamp = creationTimestamp;
        this.lastUpdateUserID = lastUpdateUserID;
        this.lastUpdateTimestamp = lastUpdateTimestamp;
        this.statusID = statusID;
        this.categoryProduct = categoryProduct;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
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
