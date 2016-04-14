package com.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.entity.Category;

//Type of the entity(Category) and data type of Entity's primary key (Integer)
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
