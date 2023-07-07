package com.example.airbnbclone.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private String password;
    private Date userRegistrationDate;

    public User() {

    }
    public User(String name, String email, String password, Date userRegistrationDate) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.userRegistrationDate = userRegistrationDate;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userRegistrationDate=" + userRegistrationDate +
                '}';
    }
}
