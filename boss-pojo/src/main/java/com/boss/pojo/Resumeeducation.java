package com.boss.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 学历详情
 */
@Data
@Entity
@Table(name = "tb_resumeeducation")
public class Resumeeducation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "resumeeducation_id")
	private Integer resumeeducationId;
	@Column(name = "resumeeducation_school")
	private String resumeeducationSchool;
	@Column(name = "resumeeducation_background")
	private String resumeeducationBackground;
	@Column(name = "resumeeducation_major")
	private String resumeeducationMajor;
	@Column(name = "resumeeducation_lasttime")
	private String resumeeducationLasttime;
	@Column(name = "resumeeducation_experience")
	private String resumeeducationExperience;
	@Column(name = "resumeeducation_beforetime")
	private String resumeeducationBeforetime;

}
