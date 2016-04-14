package com.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quiz.entity.User;

//Type of the entity(User) and data type of Entity's primary key (Integer)
public interface UserRepository extends JpaRepository<User, Integer> {

}
