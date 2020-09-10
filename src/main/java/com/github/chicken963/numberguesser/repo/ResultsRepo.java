package com.github.chicken963.numberguesser.repo;

import com.github.chicken963.numberguesser.domain.Result;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ResultsRepo extends CrudRepository<Result, Long> {
    List<Result> findByUserId(int userId);
}
