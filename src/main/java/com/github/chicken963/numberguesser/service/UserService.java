package com.github.chicken963.numberguesser.service;


import com.github.chicken963.numberguesser.domain.Answer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<Answer> lastAnswers = new ArrayList<>();

    public void addAnswer(Answer answer){
        lastAnswers.add(answer);
    }

}
