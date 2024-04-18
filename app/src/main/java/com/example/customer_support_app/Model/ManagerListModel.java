package com.example.customer_support_app.Model;

public class ManagerListModel {
    String user_id, email, picture, name;
    public ManagerListModel(String userId, String email, String picture, String name) {
        this.user_id = userId;
        this.email = email;
        this.picture = picture;
        this.name = name;
    }

    public String getUserId() {
        return user_id;
    }

    public void setUserId(String userId) {
        this.user_id = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


/**
 * {
 *         "user_id": "auth0|660ea2118d372761f34f235e",
 *         "email": "ritik+manager@gmail.com",
 *         "picture": "https://s.gravatar.com/avatar/6a8eda73ed5459311c224df243517f44?s=480&r=pg&d=https%3A%2F%2Fcdn.auth0.com%2Favatars%2Fri.png",
 *         "name": "ritik+manager@gmail.com"
 *     },
 */