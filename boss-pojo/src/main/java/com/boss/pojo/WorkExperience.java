package com.boss.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 工作履历
 */
@Data
@Entity
@Table(name = "tb_workexperience")
public class WorkExperience implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="workexperience_id")
	private Integer workExperienceId;
	@Column(name = "workexperience_company")
	private String workExperienceCompany;
	@Column(name = "workexperience_industry")
	private String workExperienceIndustry;
	@Column(name = "workexperience_workingtimeend")
	private String workExperienceWorkingTimeEnd;
	@Column(name = "workexperience_workingtimebegin")
	private String workExperienceWorkingTimeBegin;
	@Column(name = "workexperience_type")
	private String workExperienceType;
	@Column(name = "workexperience_department")
	private String workExperienceDepartment;
	@Column(name = "workexperience_content")
	private String workExperienceContent;
	@Column(name = "workexperience_performance")
	private String workExperiencePerformance;
}
