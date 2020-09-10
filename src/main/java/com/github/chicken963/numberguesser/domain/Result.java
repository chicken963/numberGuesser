package com.github.chicken963.numberguesser.domain;

import javax.persistence.*;

@Entity
@Table(name = "RESULTS")
public class Result {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User user;

    private int attemptId;
    private int numberOfAttempts;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "Attempt_ID", nullable = false)
    public int getAttemptId() {
        return attemptId;
    }

    public void setAttemptId(int attemptId) {
        this.attemptId = attemptId;
    }

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public void setNumberOfAttempts(int numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
    }

}
