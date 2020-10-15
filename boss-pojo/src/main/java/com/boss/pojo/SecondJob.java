package com.boss.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 职位
 */
@Data
public class SecondJob implements Serializable {

	private Integer jobtableSid;

	private String jobtableSecondtype;

	private String jobImg;

}
