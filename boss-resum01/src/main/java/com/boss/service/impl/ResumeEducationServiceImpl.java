package com.boss.service.impl;

import com.boss.dao.ResumeEducationDao;
import com.boss.pojo.Resumeeducation;
import com.boss.service.ResumeEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ResumeEducationServiceImpl implements ResumeEducationService {

	@Autowired
	ResumeEducationDao resumeEducationDao;

	@Override
	public Resumeeducation saveAndFlash(Resumeeducation resumeeducation) {
		return resumeEducationDao.saveAndFlush(resumeeducation);
	}

	@Override
	public Optional<Resumeeducation> findById(int id) {

		Optional<Resumeeducation> resumeEducation = resumeEducationDao.findById(id);

		return resumeEducation;
	}
}
