package com.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.quiz.service.CategoryService;


@Controller
public class CategoryContoller {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/categories")
	public String users(Model model)
	{
		model.addAttribute("categories", categoryService.findAll());
		return "categories";
	}
	
	/*@RequestMapping("/users/{id}")
	public String detail(Model model, @PathVariable int id)
	{
		model.addAttribute("user", userService.findOne(id));
		return "user-detail";
	}
	*/

}
