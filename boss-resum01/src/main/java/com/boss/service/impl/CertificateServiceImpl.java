package com.boss.service.impl;

import com.boss.dao.CertificateDao;
import com.boss.pojo.Certificate;
import com.boss.service.ICertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CertificateServiceImpl implements ICertificateService {

	@Autowired
	CertificateDao certificateDao;

	@Override
	public Certificate saveAndFlashCertificate(Certificate certificate) {
		return certificateDao.saveAndFlush(certificate);
	}

	@Override
	public Optional<Certificate> findCertificateById(int id) {
		Optional<Certificate> certificate = certificateDao.findById(id);
		return certificate ;
	}
}
