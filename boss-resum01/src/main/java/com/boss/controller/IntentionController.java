package com.boss.controller;

import com.boss.pojo.Intention;
import com.boss.service.IntentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntentionController {

	@Autowired
	IntentionService intentionService;
	@PostMapping("/intentionsave")
	public String saveAndFlash(@RequestBody Intention intention){

		try {
			Intention intention1 = intentionService.saveAndFlash(intention);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "false";
		}
	}

}
