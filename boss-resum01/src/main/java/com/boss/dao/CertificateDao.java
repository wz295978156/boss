package com.boss.dao;

import com.boss.pojo.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CertificateDao extends JpaRepository<Certificate, Serializable> {
}
