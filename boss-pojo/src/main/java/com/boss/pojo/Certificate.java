package com.boss.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 证书
 */
@Data
@Table(name = "tb_certificate")
@Entity
public class Certificate implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "certificate_id")
	private Integer CertificateId;
	@Column(name = "certificate_name")
	private String CertificateName;

}
