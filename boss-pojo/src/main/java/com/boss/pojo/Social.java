package com.boss.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 个人主页
 */
@Data
public class Social implements Serializable {

	private Integer socialId;

	private String socialName;

}
