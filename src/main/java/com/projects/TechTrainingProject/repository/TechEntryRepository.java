package com.projects.TechTrainingProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projects.TechTrainingProject.model.TechEntry;

@Repository
public interface TechEntryRepository extends JpaRepository<TechEntry, Long> {

	public TechEntry findTechEntryById(Long id);

}