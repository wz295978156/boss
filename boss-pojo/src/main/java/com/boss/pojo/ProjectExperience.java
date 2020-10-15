package com.boss.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 项目经验
 */
@Data
@Entity
@Table(name = "tb_projectexperience")
public class ProjectExperience implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "projectexperience_id")
	private Integer projectExperienceId;
	@Column(name = "projectexperience_name")
	private String projectExperienceName;
	@Column(name = "projectexperience_role")
	private String projectExperienceRole;
	@Column(name = "projectexperience_lasttime")
	private String projectExperienceLastTime;
	@Column(name = "projectexperience_describe")
	private String projectExperienceDescribe;
	@Column(name = "projectexperience_performance")
	private String projectExperiencePerformance;
	@Column(name = "projectexperience_connect")
	private String projectExperienceConnect;
	@Column(name = "projectexperience_beforetime")
	private String projectExperienceBeforeTime;

}
