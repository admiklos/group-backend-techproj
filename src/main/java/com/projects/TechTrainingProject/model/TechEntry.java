package com.projects.TechTrainingProject.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TechEntry {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String username;
	
	// languages: Java, Javascript, Python, etc
	private String[] languages;
	
	// method: tutorial, practice, compete
	private String selectedMethod;

	// category: algorithms, data structures, math, general
	//           interview questions
	private String taskCategory;
	
	private String selectedLanguage;

	// the actual question or problem to solve
	private String task;
	
	// the users answer
	private String userAnswer;
	
	// the actual answer
	private String answer;


	public String getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public TechEntry() {}

	public TechEntry(String username, String[] languages, String selectedMethod, String taskCategory,
			String selectedLanguage, String task, String userAnswer, String answer) {
		this.username = username;
		this.languages = languages;
		this.selectedMethod = selectedMethod;
		this.taskCategory = taskCategory;
		this.selectedLanguage = selectedLanguage;
		this.task = task;
		this.userAnswer = userAnswer;
		this.answer = answer;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	public String getSelectedMethod() {
		return selectedMethod;
	}

	public void setSelectedMethod(String selectedMethod) {
		this.selectedMethod = selectedMethod;
	}

	public String getTaskCategory() {
		return taskCategory;
	}

	public void setTaskCategory(String taskCategory) {
		this.taskCategory = taskCategory;
	}

	public String getSelectedLanguage() {
		return selectedLanguage;
	}

	public void setSelectedLanguage(String selectedLanguage) {
		this.selectedLanguage = selectedLanguage;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "TechEntry [id=" + id + ", username=" + username + ", languages=" + Arrays.toString(languages)
				+ ", selectedMethod=" + selectedMethod + ", taskCategory=" + taskCategory + ", selectedLanguage="
				+ selectedLanguage + ", task=" + task + ", userAnswer=" + userAnswer + ", answer=" + answer + "]";
	}
	
}
