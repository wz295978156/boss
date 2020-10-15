package com.boss.controller;

import com.boss.pojo.ProjectExperience;
import com.boss.service.ProjectExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectExperienceController {

	@Autowired
	ProjectExperienceService projectExperienceService;
	@PostMapping("/projectsave")
	public ProjectExperience saveAndFlash(@RequestBody ProjectExperience projectExperience){

		ProjectExperience projectExperience1 = projectExperienceService.saveAndFlash(projectExperience);

		return projectExperience1;

	}


}
