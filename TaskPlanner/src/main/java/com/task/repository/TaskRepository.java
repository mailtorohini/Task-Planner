package com.task.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.task.model.Task;

@Repository
public interface TaskRepository extends MongoRepository <Task, String>{

	@Query("select task from Task task where task.title=?1")
    public Task findBytitle(String title);

}
