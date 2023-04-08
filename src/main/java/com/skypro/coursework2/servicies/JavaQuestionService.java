package com.skypro.coursework2.servicies;

import com.skypro.coursework2.entities.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {

    private Set<Question> questions = new LinkedHashSet<>();

    private final Random random;

    public JavaQuestionService(Random random) {
        this.random = random;
    }

    @Override
    public Question add(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        return add(newQuestion);
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(String question, String answer) {
        Question questionForDelete = new Question(question, answer);
        questions.remove(questionForDelete);
        return questionForDelete;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }

    @Override
    public Question getRandomQuestion() {
        List<Question> questionList = new ArrayList<>(questions);
        return questionList.get(random.nextInt(questionList.size()));
    }
}
