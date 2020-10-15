package com.boss.service;

import com.boss.pojo.Certificate;

import java.util.Optional;

public interface ICertificateService {
	Certificate saveAndFlashCertificate(Certificate certificate);
	Optional<Certificate> findCertificateById(int id);

}
