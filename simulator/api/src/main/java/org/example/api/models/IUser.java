package org.example.api.models;

public interface IUser {
    Long getId();
    String getName();
    String getPassword();
    String getEmail();
    UserRole getRole();
}
