package com.github.chicken963.numberguesser.service;

public class NumberValidator {
    public int number;

    public NumberValidator(int number) {
        this.number = number;
    }


    public boolean areDigitsDistinct(){
        int[] numberDigits = NumberDealer.getInstance().decompose(number);
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (numberDigits[i] == numberDigits[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isRangeFour(){
        return number >= 1000 && number < 10000;
    }
}
