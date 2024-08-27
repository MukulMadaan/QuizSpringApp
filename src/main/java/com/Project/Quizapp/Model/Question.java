package com.Project.Quizapp.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Quiz")
public class Question {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String category_name;
    private String question_text;
    private String option_1;
    private String option_2;
    private String option_3;
    private String option_4;
    private String correct_option;

}
