package com.boss.service.impl;

import com.boss.dao.ProjectExperienceDao;
import com.boss.pojo.ProjectExperience;
import com.boss.service.ProjectExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectExperienceServiceImpl implements ProjectExperienceService {

	@Autowired
	ProjectExperienceDao experienceDao;

	@Override
	public ProjectExperience saveAndFlash(ProjectExperience projectExperience) {
		return experienceDao.saveAndFlush(projectExperience);
	}

	@Override
	public Optional<ProjectExperience> findById(int id) {

		Optional<ProjectExperience> projectExperience = experienceDao.findById(id);

		return projectExperience;
	}
}
