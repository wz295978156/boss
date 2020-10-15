package com.boss.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * boss用户
 */
@Data
public class User implements Serializable {

	private Integer userId;

	private String userEmail;

	private String password;

	private String username;

	private String userSex;

	private String userIdentity;

	private String userAvatar;

	private String userBirthday;

	private String userPoliticsStatus;

	private String userJobStare;

	private String userCreateTime;

	private String userAddress;

	private String userTel;

}
