package com.projects.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.training.model.TechEntry;
import com.projects.training.repository.TechEntryRepository;

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
		updatedEntry.setCategory(techEntry.getCategory());
		updatedEntry.setLanguage(techEntry.getLanguage());
		updatedEntry.setQuestion(techEntry.getQuestion());
		updatedEntry.setMultiChoice(techEntry.getMultiChoice());
		updatedEntry.setAnswer(techEntry.getAnswer());
		techEntryRepository.save(updatedEntry);
	}
		
}
