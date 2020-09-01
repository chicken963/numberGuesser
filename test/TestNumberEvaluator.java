import main.NumberEvaluator;
import main.NumberGenerator;
import main.NumberValidator;

import java.io.Console;

public class TestNumberEvaluator {

    public static void main(String[] args) {
        testEvaluation();
    }

    public static void testEvaluation(){
        int numberToBeGuessed = NumberGenerator.generateNumber();
        Console cnsl = System.console();
        int numberEntered;
        NumberValidator validator;
        if (cnsl != null){
            numberEntered = Integer.parseInt(cnsl.readLine("Enter your guess: "));
        } else {
            do {
                numberEntered = (int) (1000 + Math.floor(Math.random() * 9000));
                validator = new NumberValidator(numberEntered);
            } while (!validator.areDigitsDistinct());

        }

        NumberEvaluator evaluator = new NumberEvaluator(numberToBeGuessed, numberEntered);
        evaluator.giveAnswer();
    }

}
