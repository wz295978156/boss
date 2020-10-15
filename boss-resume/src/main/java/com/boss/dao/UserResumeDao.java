package com.boss.dao;

import com.boss.pojo.Resume;
import com.boss.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserResumeDao {
	Resume findResumeByUserNameAndPassword(String username, String password);

	void updateResume(Resume resume);
}
