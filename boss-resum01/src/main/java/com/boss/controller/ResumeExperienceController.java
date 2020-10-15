package com.boss.controller;

import com.boss.pojo.Resumeeducation;
import com.boss.service.ResumeEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResumeExperienceController {

	@Autowired
	ResumeEducationService resumeEducationService;
	@PostMapping("/resumesaveflash")
	public Resumeeducation saveAndFlash(Resumeeducation resumeeducation){

		Resumeeducation resumeeducation1 = resumeEducationService.saveAndFlash(resumeeducation);

		return resumeeducation1;
	}

}
