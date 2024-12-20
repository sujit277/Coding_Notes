package com.question.controllers;

import com.question.entities.Question;
import com.question.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    // create
    @PostMapping
    public Question create(@RequestBody Question question) {
        return questionService.create(question);
    }

    // get all
    @GetMapping
    public List<Question> getAll() {
        return questionService.get();
    }

    //  get specific question
    @GetMapping("/{questionId}")
    public Question getAll(@PathVariable Long questionId) {
        return questionService.getOne(questionId);
    }

    //  get all question of specific quiz
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId) {
        return questionService.getQuestionsOfQuiz(quizId);
    }

}
