package com.boss.dao;

import com.boss.pojo.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CompanyDao extends JpaRepository<Company, Serializable> {

}
