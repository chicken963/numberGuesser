package com.github.chicken963.numberguesser.service;

public class NumberDealer {

    public static final NumberDealer INSTANCE = new NumberDealer();

    public int[] decompose(int number){
        int[] digitsArray = new int[4];
        for (int range = 0; range < 4; range ++){
            digitsArray[range] = Math.floorDiv(number, (int) Math.pow(10, 3-range));
            number = Math.floorMod(number, (int) Math.pow(10, 3-range));
        }
        return digitsArray;
    }

    public int compose (int[] digitsArray){
        int number = 0;
        for (int range = 0; range < 4; range++){
            number += Math.pow(10, range) * digitsArray[3 - range];
        }
        return number;
    }

    public static NumberDealer getInstance() {
        return INSTANCE;
    }
}
