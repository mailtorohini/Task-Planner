package com.task.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document
public class Task {
	
	@Id
	private String taskId;
	private String title;
	private String description;
	private String createdBy;
    private String assignedTo;
	private Date completedOn;
	private String status;
	
}
