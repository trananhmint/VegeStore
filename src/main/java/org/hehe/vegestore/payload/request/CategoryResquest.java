package org.hehe.vegestore.payload.request;

import org.hehe.vegestore.entity.UsersEntity;

import java.util.Date;

public class CategoryResquest {
    private int categoryID;
    private String name;
    private int creationUserID;
    private Date creationTimestamp;
    private int lastUpdateUserID;
    private Date lastUpdateTimestamp;

    public CategoryResquest(int categoryID) {
        this.categoryID = categoryID;
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

    public int getCreationUserID() {
        return creationUserID;
    }

    public void setCreationUserID(int creationUserID) {
        this.creationUserID = creationUserID;
    }

    public Date getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public int getLastUpdateUserID() {
        return lastUpdateUserID;
    }

    public void setLastUpdateUserID(int lastUpdateUserID) {
        this.lastUpdateUserID = lastUpdateUserID;
    }

    public Date getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    public void setLastUpdateTimestamp(Date lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }
}
