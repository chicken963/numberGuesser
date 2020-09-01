package main;

public class NumberGenerator {
    public static final NumberDealer dealer = new NumberDealer();

    public static int generateNumber() {
        int[] digits = new int[4];
        for (int index = 0; index < 4; index++) {
            digits[index] = setDigit(digits, index);
        }
        return dealer.compose(digits);
    }

    private static int setDigit(int[] arrayToPutValueIn, int index) {
        if (index == 0) {
            return (int) (1 + Math.floor(Math.random() * 9));
        } else {
            int newDigit;
            int[] existingNumbers = getFilledNumbers(arrayToPutValueIn, index);
            do {
                newDigit = (int) Math.floor(Math.random() * 10);
            } while (digitIsEqualToAnyOf(newDigit, existingNumbers));
            return newDigit;
        }
    }

    private static int[] getFilledNumbers(int[] arrayToPutValueIn, int index) {
        int[] existingNumbers = new int[index];
        for (int innerIndex = 0; innerIndex < index; innerIndex++) {
            existingNumbers[innerIndex] = arrayToPutValueIn[innerIndex];
        }
        return existingNumbers;
    }

    private static boolean digitIsEqualToAnyOf(int digit, int[] arrayToCheck) {
        for (int arrayDigit : arrayToCheck) {
            if (arrayDigit == digit) {
                return true;
            }
        }
        return false;
    }
}
