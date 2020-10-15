package com.boss.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * boss  hr
 */
@Data
public class Boss implements Serializable {

	private Integer bossId;

	private String bossName;

	private String bossSex;

	private String bossPhone;

	private String bossCompanyid;

}
