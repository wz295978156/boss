package com.boss.controller;

import com.boss.pojo.Certificate;
import com.boss.service.ICertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CertificateController {

	@Autowired
	ICertificateService certificateService;

	@PostMapping("/saveandflash")
	public String saveAndFlash(@RequestBody Certificate certificate){

		try {
			Certificate certificate1 = certificateService.saveAndFlashCertificate(certificate);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "false";
		}
	}

}
