package com.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quiz.entity.Role;

//  Type of the entity(Role) and data type of Entity's primary key(Integer)
public interface RoleRepository extends JpaRepository<Role, Integer> {
	

}
