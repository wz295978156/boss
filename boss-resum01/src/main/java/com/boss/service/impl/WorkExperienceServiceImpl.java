package com.boss.service.impl;

import com.boss.dao.WorkExperienceDao;
import com.boss.pojo.WorkExperience;
import com.boss.service.WorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WorkExperienceServiceImpl implements WorkExperienceService {

	@Autowired
	WorkExperienceDao workExperienceDao;

	@Override
	public WorkExperience saveAndFlash(WorkExperience workExperience) {

		return workExperienceDao.saveAndFlush(workExperience);
	}

	@Override
	public Optional<WorkExperience> findById(int id) {

		Optional<WorkExperience> work = workExperienceDao.findById(id);

		return work;
	}
}
