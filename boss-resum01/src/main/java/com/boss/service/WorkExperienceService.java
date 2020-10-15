package com.boss.service;

import com.boss.pojo.WorkExperience;

import java.util.Optional;

public interface WorkExperienceService {

	WorkExperience saveAndFlash(WorkExperience workExperience);

	Optional<WorkExperience> findById(int id);
}
