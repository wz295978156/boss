package com.boss.service;

import com.boss.pojo.ProjectExperience;

import java.util.Optional;

public interface ProjectExperienceService {

	ProjectExperience saveAndFlash(ProjectExperience projectExperience);

	Optional<ProjectExperience> findById(int id);
}
