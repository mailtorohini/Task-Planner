package com.task.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.dao.TaskDao;
import com.task.model.Task;


@RestController
public class TaskController {

		@Autowired
		TaskDao dao;
		
		@PostMapping("/insert")
		public Task insert(@RequestBody Task t) {
			return dao.insert(t);
		}

		@PostMapping("/insertall")
		public List<Task> insertall(@RequestBody List<Task> t){
			return dao.insertall(t);
		}
		@GetMapping("/getall")
		public List<Task> gettall(){
			return dao.getall();
		}
	

	@PutMapping("/update")
		public Task update(@RequestBody Task t) {
		return dao.update(t);
		}


	 @GetMapping("/getbyId{t}") 
	 public Optional<Task> findBytId(@PathVariable String t) { 
		 return dao.findById(t); }
	 
	 @GetMapping("/getbytitle{t}") 
	   public Task findBytitle(@PathVariable String t) { 
		return dao.findBytitle(t); }
}
