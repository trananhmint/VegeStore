package org.hehe.vegestore.payload.request;

import org.hehe.vegestore.entity.UsersEntity;

import java.sql.Timestamp;
import java.util.Date;

public class CategoryResquest {
    private int categoryID;
    private String name;
    private int creationUserID;
    private Timestamp creationTimestamp;
    private int lastUpdateUserID;
    private Timestamp lastUpdateTimestamp;

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

    public Timestamp getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Timestamp creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public int getLastUpdateUserID() {
        return lastUpdateUserID;
    }

    public void setLastUpdateUserID(int lastUpdateUserID) {
        this.lastUpdateUserID = lastUpdateUserID;
    }

    public Timestamp getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    public void setLastUpdateTimestamp(Timestamp lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }
}
