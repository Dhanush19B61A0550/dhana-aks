package com.accesshr.emsbackend.response;

import lombok.Data;

//@Data
public class LoginResponse {

    private String message;
    private Boolean status;
    private String role; // Add this field
    private String token;

    public LoginResponse(String message, Boolean status, String role) {
        this.message = message;
        this.status = status;
        this.role = role; // Initialize the role
    }

    public LoginResponse(String message, Boolean status, String role, String token) {
        this.message = message;
        this.status = status;
        this.role = role;
        this.token = token;
    }

    public LoginResponse() {
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "message='" + message + '\'' +
                ", status=" + status +
                ", role='" + role + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
