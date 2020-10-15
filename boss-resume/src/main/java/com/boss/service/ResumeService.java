package com.boss.service;

import com.boss.pojo.Resume;
import com.boss.pojo.User;

public interface ResumeService {
	Resume findResumeByUserNameAndPassword(String username, String password);

	String updateResume(Resume resume);
}
