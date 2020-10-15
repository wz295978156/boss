package com.boss.dao;

import com.boss.pojo.ProjectExperience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface ProjectExperienceDao extends JpaRepository<ProjectExperience, Serializable> {
}
