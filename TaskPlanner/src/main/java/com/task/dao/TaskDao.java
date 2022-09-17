package com.task.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.model.Task;
import com.task.repository.TaskRepository;

@Service
public class TaskDao {

	@Autowired
	TaskRepository repo;
	
	public Task insert(Task t) {
		return repo.save(t);
	}

	public List<Task> insertall(List<Task> t) {
		return repo.saveAll(t);
	}

	public List<Task> getall() {
		return repo.findAll();
	}

	public Task update(Task t) {
        
         Task tt = repo.findById(t.getTaskId()).orElse(null);
           tt.setTitle(t.getTitle());
          return repo.save(t);
	}
	
	public Optional<Task> findById(String t) {
		return repo.findById(t); 
	}
	
	public Task findBytitle(String t) {
		return repo.findBytitle(t); 
	}

	

}
