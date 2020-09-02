package restServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import computation.*;
import static computation.NumberGenerator.generateNumber;

@RestController
public class ComputationController {
    @GetMapping("/compute")
    public Answer answer(@RequestParam(value = "guess") String guess){
        int rightAnswer = generateNumber();
        NumberEvaluator evaluator = new NumberEvaluator(Integer.parseInt(guess), rightAnswer);
        return evaluator.giveAnswer();
    }
}
