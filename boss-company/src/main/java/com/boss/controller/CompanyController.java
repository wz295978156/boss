package com.boss.controller;

import com.boss.config.MsgResult;
import com.boss.pojo.Company;
import com.boss.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;
@RestController
public class CompanyController {

	@Autowired
	CompanyService companyService;

	@GetMapping("/findAll")
	@CrossOrigin
	public MsgResult findAllCompany(){
		List<Company> allCompany = companyService.findAllCompany();
		MsgResult msgResult = new MsgResult();
		msgResult.setStatus(200);
		msgResult.setData(allCompany);
		return msgResult;
	}
	@PostMapping("/update")
	public Company update( Company company){
		Company update = companyService.update(company);

		return update;
	}
}
