package com.github.chicken963.numberguesser.domain;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private boolean isAdmin;
    private int numberOfAttempts;
    public int currentAttemptNumber;

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User() {
        this.numberOfAttempts = 0;
    }

    public void increaseAttempts() {
        this.numberOfAttempts++;
    }
}
