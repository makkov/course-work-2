package com.skypro.coursework2.servicies;

import com.skypro.coursework2.entities.Question;
import com.skypro.coursework2.exceptions.QuestionAmountException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {

        if(amount < 1) {
            throw new QuestionAmountException("Amount can't be negative");
        }

        if (amount > questionService.getAll().size()) {
            throw new QuestionAmountException("There are less questions then requested in the List");
        }

        Set<Question> result = new HashSet<>();

        while (result.size() < amount) {
            result.add(questionService.getRandomQuestion());
        }

        return result;
    }
}
