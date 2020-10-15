package com.boss.controller;

import com.boss.pojo.WorkExperience;
import com.boss.service.WorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkExperienceController {

	@Autowired
	WorkExperienceService workExperienceService;
	@PostMapping("/worksave")
	public WorkExperience saveAndFlash(@RequestBody WorkExperience workExperience){

		WorkExperience workExperience1 = workExperienceService.saveAndFlash(workExperience);

		return workExperience1;
	}

}
