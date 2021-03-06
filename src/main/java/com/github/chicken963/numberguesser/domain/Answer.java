package com.github.chicken963.numberguesser.domain;

public class Answer {
    private int cows;
    private int bulls;

    public Answer(int numberOfBulls, int numberOfCows) {
        this.cows = numberOfCows;
        this.bulls = numberOfBulls;
    }

    public boolean isRight() {
        return this.getBulls() == 4 && this.getCows() == 0;
    }

    public int getCows() {
        return cows;
    }

    public int getBulls() {
        return bulls;
    }

}
