package com.projects.TechTrainingProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projects.TechTrainingProject.model.TechEntry;

@Service
public interface TechEntryServiceInt {

	public void saveEntry(TechEntry techEntry);

	public List<TechEntry> getAllEntries();

	public void deleteEntry(Long id);

	public TechEntry getEntryById(Long id);

	public void updateEntry(Long id, TechEntry techEntry);


}
