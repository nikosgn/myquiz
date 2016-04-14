package com.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entity.Answer;
import com.quiz.entity.Question;
import com.quiz.repository.AnswerRepository;
import com.quiz.repository.QuestionRepository;

@Service
public class QuestionService {
	
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	public List<Question> findAll()
	{
		return questionRepository.findAll();
	}
	

}
