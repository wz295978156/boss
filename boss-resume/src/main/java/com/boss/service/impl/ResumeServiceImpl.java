package com.boss.service.impl;

import com.boss.dao.UserResumeDao;
import com.boss.pojo.Resume;
import com.boss.pojo.User;
import com.boss.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeServiceImpl implements ResumeService {

	@Autowired
	UserResumeDao resumeDao;

	@Override
	public Resume findResumeByUserNameAndPassword(String username, String password) {
		Resume resume = resumeDao.findResumeByUserNameAndPassword(username, password);
		return resume;
	}

	@Override
	public String updateResume(Resume resume) {
		try {
			resumeDao.updateResume(resume);
			return "update success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "update false";
	}
}
