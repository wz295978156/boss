package com.boss.config;

import lombok.Data;

import java.io.Serializable;

@Data
public class MsgResult implements Serializable {
	private Integer status;//响应状态码
	private String message;//相应短消息
	private Object data;//响应携带的数据

	public MsgResult(Integer status, String message, Object data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public MsgResult() {
	}
}