package com.skypro.coursework2.servicies;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Random;

@ContextConfiguration(classes = {JavaQuestionService.class})
@ExtendWith(SpringExtension.class)
class JavaQuestionServiceTest {

    @Autowired
    private QuestionService questionService;

    @MockBean
    private Random random;

    @Test
    void getRandomQuestion_success() {
//        //входные данные
//        Question q1 = new Question("1", "11");
//        Question q2 = new Question("2", "22");
//
//        //ожидаемый результат
//        when(random.nextInt(2)).thenReturn(0);
//
//        //начало теста
//        questionService.add(q1);
//        questionService.add(q2);
//
//        Question actualQuestion = questionService.getRandomQuestion();
//        assertEquals(q1, actualQuestion);
    }
}
