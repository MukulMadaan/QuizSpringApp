package com.Project.Quizapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.Quizapp.Model.Question;

public interface QuestionDAO extends JpaRepository<Question, Integer>{
    
}
