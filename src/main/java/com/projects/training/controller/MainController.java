package com.projects.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projects.training.model.TechEntry;
import com.projects.training.service.TechEntryServiceImpl;

@RestController
public class MainController {
	
	@Autowired
	TechEntryServiceImpl techEntryServiceImpl;
	
	@CrossOrigin(origins="http://localhost:3000")
	@GetMapping("/")
	public String index() {
		return "Tech Training Project";
	}
	
	@CrossOrigin
	@GetMapping("/entries")
	public List<TechEntry> getAllEntries() {
		return techEntryServiceImpl.getAllEntries();
	}
	
	@CrossOrigin
	@GetMapping("/entry/{id}")
	public TechEntry getEntryById(@PathVariable Long id) {
		return techEntryServiceImpl.getEntryById(id);
	}
	
	@CrossOrigin
	@PostMapping("/entry")
	//public void saveEntry(@RequestBody TechEntry techEntry) {
		public void saveEntry(TechEntry techEntry) {
		techEntryServiceImpl.saveEntry(techEntry);
	}

	@CrossOrigin
	@PutMapping("/entry/{id}")
	//public void updateEntry(@PathVariable Long id, @RequestBody TechEntry techEntry) {
		public void updateEntry(Long id, @RequestBody TechEntry techEntry) {
		techEntryServiceImpl.updateEntry(id, techEntry);
	}
	
	@CrossOrigin
	@DeleteMapping("/entry/{id}")
	public void deleteEntry(@PathVariable Long id) {
		techEntryServiceImpl.deleteEntry(id);
	}
}
