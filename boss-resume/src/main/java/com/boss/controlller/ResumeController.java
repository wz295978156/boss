package com.boss.controlller;

import com.boss.config.MsgResult;
import com.boss.pojo.Intention;
import com.boss.pojo.Resume;
import com.boss.service.impl.ResumeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResumeController {

	@Autowired
	ResumeServiceImpl resumeService;
	
	@GetMapping("/findresume/{username}/{password}")
	public MsgResult findResume(@PathVariable("username") String username, @PathVariable("password") String password){
		Resume user = resumeService.findResumeByUserNameAndPassword(username, password);

		MsgResult msgResult = new MsgResult();
		msgResult.setData(user);
		msgResult.setStatus(200);

		return msgResult;
	}
	@PostMapping("/updateresume")
	public MsgResult updateResume(@RequestBody Resume resume){
		String resume1 = resumeService.updateResume(resume);

		MsgResult msgResult = new MsgResult();
		msgResult.setData(resume1);
		msgResult.setStatus(200);

		return msgResult;
	}


}
