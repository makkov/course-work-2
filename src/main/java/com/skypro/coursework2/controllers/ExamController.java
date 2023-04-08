package com.skypro.coursework2.controllers;

import com.skypro.coursework2.entities.Question;
import com.skypro.coursework2.exceptions.QuestionAmountException;
import com.skypro.coursework2.servicies.ExaminerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam/get")
public class ExamController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({QuestionAmountException.class})
    public String handleException(RuntimeException e){
        return String.format("%s %s", HttpStatus.BAD_REQUEST.value(), e.getMessage());
    }

    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/{amount}")
    public Collection<Question> getAll(@PathVariable("amount") int amount) {
        return examinerService.getQuestions(amount);
    }
}
