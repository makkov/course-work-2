package com.skypro.coursework2.servicies;

import com.skypro.coursework2.entities.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestions(int amount);
}
