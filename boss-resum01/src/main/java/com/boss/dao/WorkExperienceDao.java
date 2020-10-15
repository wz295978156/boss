package com.boss.dao;

import com.boss.pojo.WorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface WorkExperienceDao extends JpaRepository<WorkExperience, Serializable> {
}
