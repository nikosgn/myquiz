package com.quiz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@GeneratedValue
	@Column(name = "question_id")
	private Integer questionId;
	
	@Column(name = "category_id")
	private Integer categoryId;
	
	private String question;
	
	@Column(name = "right_answer")
	private String rightAnswer;
	
	@ManyToOne
	@JoinColumn(name="name")
	private Category category;

	@OneToOne(targetEntity=Answer.class)
	private Answer answer;
	
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}


	public Integer getquestionId() {
		return questionId;
	}

	public void setId(Integer questionId) {
		this.questionId = questionId;
	}

	public Integer getcategoryId() {
		return categoryId;
	}

	public void setcategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getRightAnswer() {
		return rightAnswer;
	}

	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
}
