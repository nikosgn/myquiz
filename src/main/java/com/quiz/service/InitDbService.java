package com.quiz.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quiz.entity.Answer;
import com.quiz.entity.Category;
import com.quiz.entity.Question;
import com.quiz.entity.Role;
import com.quiz.entity.User;
import com.quiz.repository.AnswerRepository;
import com.quiz.repository.CategoryRepository;
import com.quiz.repository.QuestionRepository;
import com.quiz.repository.RoleRepository;
import com.quiz.repository.UserRepository;

@Transactional
@Service
public class InitDbService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@PostConstruct
	public void init()
	{
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		User userAdmin = new User();
		userAdmin.setUsername("admin");
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		
		Category catGeography = new Category();
		catGeography.setName("Geography");
		categoryRepository.save(catGeography);
		
		Question questions = new Question();
		questions.setQuestion("What is the capital of France?");
		questions.setRightAnswer("Paris");
		questionRepository.save(questions);
		
		Answer answers = new Answer();
		answers.setAnswer1("Madrid");
		answers.setAnswer2("Lisbon");
		answers.setAnswer3("Paris");
		answers.setAnswer4("Berlin");
		answers.setQuestionId(1);
		answers.setQuestion("What is the capital of France?");
		answers.setRightAnswer("Paris");
		answerRepository.save(answers);
		
		
		Answer answers1 = new Answer();
		answers1.setAnswer1("Cairo");
		answers1.setAnswer2("City of Qatar");
		answers1.setAnswer3("Doha");
		answers1.setAnswer4("Rabat");
		answers1.setQuestion("What is the capital of Qatar?");
		answers1.setRightAnswer("Doha");
		answerRepository.save(answers1);
		
		
		
	}

}
