package com.boss.service;

import com.boss.pojo.Resumeeducation;

import java.util.Optional;

public interface ResumeEducationService {

	Resumeeducation saveAndFlash(Resumeeducation resumeeducation);

	Optional<Resumeeducation> findById(int id);
}
