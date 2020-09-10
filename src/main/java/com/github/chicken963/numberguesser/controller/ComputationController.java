package com.github.chicken963.numberguesser.controller;

import com.github.chicken963.numberguesser.domain.Answer;
import com.github.chicken963.numberguesser.domain.User;
import com.github.chicken963.numberguesser.service.NumberEvaluator;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static com.github.chicken963.numberguesser.service.NumberGenerator.generateNumber;


@RestController
public class ComputationController {
    public static final int rightAnswer = generateNumber();
    private static final User user = new User();
//    @GetMapping("/")
//    public String greeting(Model model){
//        return null;
//    }

    @GetMapping("/compute")
    public static Answer returnAnswer(@RequestParam(value = "guess", defaultValue = "1234") String guess){
        NumberEvaluator evaluator = new NumberEvaluator(Integer.parseInt(guess), rightAnswer);
        Answer answer = evaluator.giveAnswer();
        user.increaseAttempts();
        return answer;
    }

//    @GetMapping("/compute")
//    public static int increaseAttempts(){
//        user.increaseAttempts();
//        return user.getNumberOfAttempts();
//    }
}
