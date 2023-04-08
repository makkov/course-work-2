package com.skypro.coursework2.servicies;

import com.skypro.coursework2.entities.Question;

import java.util.Collection;

public interface QuestionService {

    Question add(String question, String answer);

    Question add(Question question);

    //поменяли сигнатуру из задания, чтобы в контроллере не создавать Question
    Question remove(String question, String answer);

    Collection<Question> getAll();

    Question getRandomQuestion();
}
