package com.boss.dao;

import com.boss.pojo.Resumeeducation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface ResumeEducationDao extends JpaRepository<Resumeeducation, Serializable> {
}
