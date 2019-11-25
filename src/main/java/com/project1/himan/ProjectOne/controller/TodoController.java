package com.project1.himan.ProjectOne.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.project1.himan.ProjectOne.model.Todo;
import com.project1.himan.ProjectOne.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos", method= RequestMethod.GET )
	public String showTodos(ModelMap model) {
		String name = (String) model.get("name");
		model.put("todos",service.retrieveTodos(name));
		return "list-todos";
	}	
	

	@RequestMapping(value="/add-todo", method= RequestMethod.GET )
	public String showTodoPage(ModelMap model) {
		//model.addAttribute("todo",new Todo(0,(String) model.get("name"),"default description",new Date(),false));
		return "add-todo";
	}	
	
	@RequestMapping(value="/delete-todo", method= RequestMethod.GET )
	public String deleteTodo(@RequestParam int id) {
		service.deleteTodo(id);
		return "redirect:/list-todos";
	}	
	
	@RequestMapping(value="/update-todo", method= RequestMethod.GET )
	public String updateTodo(@RequestParam int id, ModelMap model) {
		Todo todo = service.retrieveTodo(id);
		model.put("todo",todo);
		return "add-todo";
	}
	
	@RequestMapping(value="/add-todo", method= RequestMethod.POST )
	public String addTodo(ModelMap model, @RequestParam String desc) {
		service.addTodo((String) model.get("name"), desc, new Date(), false);
		return "redirect:/list-todos";
	}	
}