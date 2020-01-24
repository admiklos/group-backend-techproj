package com.projects.TechTrainingProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.TechTrainingProject.model.TechEntry;
import com.projects.TechTrainingProject.repository.TechEntryRepository;

@Service
public class TechEntryServiceImpl implements TechEntryServiceInt {

	@Autowired
	TechEntryRepository techEntryRepository;

	@Override
	public void saveEntry(TechEntry techEntry) {
		techEntryRepository.save(techEntry);
		
	}

	@Override
	public List<TechEntry> getAllEntries() {
		return techEntryRepository.findAll();
	}

	@Override
	public void deleteEntry(Long id) {
		techEntryRepository.deleteById(id);
		
	}

	@Override
	public TechEntry getEntryById(Long id) {
		return techEntryRepository.findTechEntryById(id);
	}
	
	@Override
	public void updateEntry(Long id, TechEntry techEntry) {
		TechEntry updatedEntry = techEntryRepository.findTechEntryById(id);
		updatedEntry.setLanguages(techEntry.getLanguages());
		updatedEntry.setAnswer(techEntry.getAnswer());
		updatedEntry.setSelectedLanguage(techEntry.getSelectedLanguage());
		updatedEntry.setSelectedMethod(techEntry.getSelectedMethod());
		updatedEntry.setTask(techEntry.getTask());
		updatedEntry.setTaskCategory(techEntry.getTaskCategory());
		updatedEntry.setUserAnswer(techEntry.getUserAnswer());
		updatedEntry.setUsername(techEntry.getUsername());
		techEntryRepository.save(updatedEntry);
	}
		
}
