package com.quiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quiz.entity.Answer;

//Type of the entity(Answer) and data type of Entity's primary key(Integer)
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
	

}
