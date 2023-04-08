package com.skypro.coursework2.controllers;

import com.skypro.coursework2.entities.Question;
import com.skypro.coursework2.servicies.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam/get")
public class ExamController {

    //todo обработчик для QuestionAmountException

    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/{amount}")
    public Collection<Question> getAll(@PathVariable("amount") int amount) {
        return examinerService.getQuestions(amount);
    }
}
