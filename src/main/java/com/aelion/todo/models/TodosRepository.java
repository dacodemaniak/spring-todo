package com.aelion.todo.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


public interface TodosRepository extends CrudRepository<Todo, Integer> {

}