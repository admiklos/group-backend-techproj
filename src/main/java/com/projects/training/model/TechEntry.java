package com.projects.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TechEntry {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	// category: algorithms, data structures, math, general
	//           interview questions
	private String category;
	
	private String language;

	// the actual question or problem to solve
	private String question;
	
	// the multiple choice answers
	@Column(length=4096)
	private String[] multiChoice;
	
	// the correct answer index for the multiChoice key-value pair.
	private String answer;

	public TechEntry() {}

	public TechEntry(String category, String language, String question, String[] multiChoice, String answer) {
		this.category = category;
		this.language = language;
		this.question = question;
		this.multiChoice = multiChoice;
		this.answer = answer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Long getId() {
		return id;
	}

	public String[] getMultiChoice() {
		return multiChoice;
	}

	public void setMultiChoice(String[] multiChoice) {
		this.multiChoice = multiChoice;
	}

	@Override
	public String toString() {
		return "TechEntry [id=" + id + ", category=" + category + ", language=" + language + ", question=" + question
				+ ", multiChoice=" + multiChoice + ", answer=" + answer + "]";
	}
	
}
