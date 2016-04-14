package com.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quiz.entity.Question;

//Type of the entity(Question) and data type of Entity's primary key (Integer)
public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
