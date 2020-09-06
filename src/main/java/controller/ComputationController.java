package controller;

import com.github.chicken963.numberguesser.domain.Answer;
import com.github.chicken963.numberguesser.service.NumberEvaluator;
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
//        model.addAttribute("message", "Baeldung");
        return "index";
    }

    @GetMapping("/compute")
    public static Answer returnAnswer(@RequestParam(value = "guess") String guess){
        NumberEvaluator evaluator = new NumberEvaluator(Integer.parseInt(guess), rightAnswer);
        return evaluator.giveAnswer();
    }
}
