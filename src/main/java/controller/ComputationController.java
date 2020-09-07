package controller;

import com.github.chicken963.numberguesser.domain.Answer;
import com.github.chicken963.numberguesser.service.NumberEvaluator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static com.github.chicken963.numberguesser.service.NumberGenerator.generateNumber;


@RestController
public class ComputationController {
    public static final int rightAnswer = generateNumber();

    @GetMapping("/")
    public String greeting(Model model){
        return null;
    }

    @GetMapping("/compute")
    public static String returnAnswer(@RequestParam(value = "guess", defaultValue = "1234") String guess){
        NumberEvaluator evaluator = new NumberEvaluator(Integer.parseInt(guess), rightAnswer);
        Answer answer = evaluator.giveAnswer();
        String resultToShow = String.format("Your result: %dК%dБ", answer.getCows(), answer.getBulls());
        return resultToShow;
    }
}
