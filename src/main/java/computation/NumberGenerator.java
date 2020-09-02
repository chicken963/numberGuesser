package computation;

public class NumberGenerator {
//    public NumberGenerator() {
//        generateNumber();
//    }

    public static int generateNumber() {
        NumberValidator validator;
        int number;
        do {
            number = (int) (1000 + Math.floor(Math.random() * 9000));
            validator = new NumberValidator(number);
        } while (!validator.areDigitsDistinct());
        return number;
    }

}
