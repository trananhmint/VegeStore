package org.hehe.vegestore.payload.request;

import org.hehe.vegestore.payload.response.UsersResponse;

import java.util.List;

public class CartRequest {
    private int id;
    private UsersResponse usersResponse;
    private List<CartItemRequest> listCartItem;

    public CartRequest() {
    }

    public CartRequest(int id, UsersResponse usersResponse, List<CartItemRequest> listCartItem) {
        this.id = id;
        this.usersResponse = usersResponse;
        this.listCartItem = listCartItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UsersResponse getUsersResponse() {
        return usersResponse;
    }

    public void setUsersResponse(UsersResponse usersResponse) {
        this.usersResponse = usersResponse;
    }

    public List<CartItemRequest> getListCartItem() {
        return listCartItem;
    }

    public void setListCartItem(List<CartItemRequest> listCartItem) {
        this.listCartItem = listCartItem;
    }
}
