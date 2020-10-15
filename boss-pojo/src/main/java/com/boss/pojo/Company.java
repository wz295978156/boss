package com.boss.pojo;

import lombok.Data;
import lombok.Value;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 公司
 */
@Data
@Entity
@Table(name = "tb_company")
public class Company implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "company_id")
	private Integer companyId;
	@Column(name = "company_name")
	private String companyName;
	@Column(name = "company_shortname")
	private String companyShortName;
	@Column(name = "company_address")
	private String companyAddress;
	@Column(name = "company_profile")
	private String companyProfile;
	@Column(name = "company_boss")
	private String companyBoss;
	@Column(name = "company_registered_capital")
	private String companyRegisteredCapital;
	@Column(name = "company_date")
	private String companyDate;
	@Column(name = "company_img")
	private String companyImg;
	@Column(name = "company_code")
	private String companyCode;
	@Column(name = "company_business_scope")
	private String companyBusinessScope;
	@Column(name = "company_status")
	private String companyStatus;
	@Column(name = "company_vcr")
	private String companyVcr;
	@Column(name = "company_scale")
	private String companyScale;
	@Column(name = "company_financing")
	private String companyFinancing;
	@Column(name = "company_updatetime")
	private String companyUpdatetime;

}
