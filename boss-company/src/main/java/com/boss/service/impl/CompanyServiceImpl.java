package com.boss.service.impl;

import com.boss.dao.CompanyDao;
import com.boss.pojo.Company;
import com.boss.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyDao companyDao;

	@Override
	public List<Company> findAllCompany() {
		return companyDao.findAll();
	}

	@Override
	public Company update(Company company) {
		Company company1 = companyDao.saveAndFlush(company);

		return company1;
	}
}
