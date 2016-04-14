package com.quiz.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import com.quiz.entity.Answer;
import com.quiz.entity.User;
import com.quiz.service.AnswerService;

@Controller
public class AnswerController {

	@Autowired
	private AnswerService answerService;

	@ModelAttribute("answer")
	public Answer construct() {
		return new Answer();
	}
	@ModelAttribute("answer1")
	public Answer construct2() {
		return new Answer();
	}
	
	@ModelAttribute("answers")
	public ArrayList<String> construct1() {
		ArrayList<String> answers = new ArrayList<>();
		answers.add("India");
		answers.add("England");
		answers.add("Australia");
		answers.add("South Africa");
		return answers;
	}

	@RequestMapping("/questionsfull")
	public String questionsfull(Model model) {
		model.addAttribute("questionsfull", answerService.findAll());
		return "questionsfull";
	}

	/*
	 * @RequestMapping("/showquestions") public String showQuestions(Model
	 * model) {
	 * 
	 * model.addAttribute("showquestions", answerService.showTenQuestions(10));
	 * return "showquestions"; }
	 */

	
	@RequestMapping(value="/showquestions",method=RequestMethod.GET)
	public String showQuestions(Model model)
	{
		model.addAttribute("showquestions",answerService.findAll() );
		model.addAttribute("answer1", answerService.findAll());
		System.out.println(answerService.findAll());
		return "showquestions";
	}
	

}
