package computation;

import restServices.*;

public class NumberEvaluator {
    private final int numberToGuess;
    private final int numberAttempted;
    private int[] digitsToGuess;
    private int[] digitsEntered;
    NumberDealer dealer = new NumberDealer();


    public NumberEvaluator(int numberToGuess, int numberAttempted) {
        this.numberToGuess = numberToGuess;
        this.numberAttempted = numberAttempted;
        System.out.println(numberToGuess);
        System.out.println(numberAttempted);
        this.digitsToGuess = dealer.decompose(numberToGuess);
        this.digitsEntered = dealer.decompose(numberAttempted);
    }

    private int countBulls(){
        int numberOfBulls = 0;
        for (int index = 0; index < 4; index++){
            if(this.digitsEntered[index] == this.digitsToGuess[index]){
                numberOfBulls += 1;
            }
        }
        return numberOfBulls;
    }

    private int countCows(){
        int numberOfCows = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++)
                if(i != j && this.digitsEntered[i] == this.digitsToGuess[j]){
                numberOfCows += 1;
                break;
            }
        }
        return numberOfCows;
    }

    public Answer giveAnswer(){
        int numberOfCows = this.countCows();
        int numberOfBulls = this.countBulls();
        System.out.println(String.format("%dБ%dК", numberOfBulls, numberOfCows));
//        return String.format("%dБ%dК", numberOfBulls, numberOfCows);
        return new Answer(numberOfBulls, numberOfCows);
    }
}
