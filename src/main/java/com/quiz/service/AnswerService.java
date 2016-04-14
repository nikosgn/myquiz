package com.quiz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quiz.entity.Answer;
import com.quiz.repository.AnswerRepository;

import javassist.expr.NewArray;

@Service
public class AnswerService {

	@Autowired
	private AnswerRepository answerRepository;

	public List<Answer> findAll() {
		return answerRepository.findAll();
	}

	public Answer findOne(int id) {

		return answerRepository.findOne(id);
	}

/*	public List<Answer> showTenQuestions() {
		List<Answer> answers = new ArrayList<Answer>();
		return answers;
	}
	*/

}
