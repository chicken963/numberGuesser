package com.github.chicken963.numberguesser.service;

import com.github.chicken963.numberguesser.domain.Result;
import com.github.chicken963.numberguesser.domain.User;
import com.github.chicken963.numberguesser.repo.ResultsRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ResultService {
    @Autowired
    private ResultsRepo resultsRepo;

    public void addResult(Result result){
        resultsRepo.save(result);
    }



//    public int calculateAverage(User user){
//        List<Result> userResults = resultsRepo
//                .findByUserId(user.getUserId());
//        int totalAttempts = 0;
//        for (Object result : userResults) {
//            totalAttempts += result.getNumberOfAttempts();
//        }
//        return 0;
//    }
}
