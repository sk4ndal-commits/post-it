package org.example.api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = User.TABLE_NAME)
@Data
public class User implements IUser {

    public static final String TABLE_NAME = "users";

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private UserRole role;
}
