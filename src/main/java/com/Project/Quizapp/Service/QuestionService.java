package com.Project.Quizapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.Quizapp.Model.Question;
import com.Project.Quizapp.Repository.QuestionDAO;

@Service
public class QuestionService {

    @Autowired
    QuestionDAO questionDBFetch;

    public List<Question> getAllQuestions(){
        return questionDBFetch.findAll();
    }
    
}
