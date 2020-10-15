package com.boss.service;

import com.boss.pojo.Company;

import java.util.List;

public interface CompanyService {

	List<Company> findAllCompany();
	Company update(Company company);
}
