package org.example.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class AppUser {
    @Id
    @GeneratedValue()
    private Integer appuser_id;

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private String password;


    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    @Column
    private LocalDateTime dateRegistered;

    @OneToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;


    public AppUser() {
    }

    public Integer getAppuser_id() {
        return appuser_id;
    }

    public void setAppuser_id(Integer appuser_id) {
        this.appuser_id = appuser_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public LocalDateTime getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(LocalDateTime dateRegistered) {
        this.dateRegistered = dateRegistered;
    }
}
