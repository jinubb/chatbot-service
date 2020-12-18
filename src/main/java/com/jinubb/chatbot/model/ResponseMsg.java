package com.jinubb.chatbot.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL) //null인필드 삭제
public class ResponseMsg {
	private boolean verified;
	private String responseMsg;
	
	public void setMsg(String msg) {
		this.verified = true;
		this.responseMsg = msg;
	}
	
	public void unverified() {
		this.verified = false;
		this.responseMsg = "등록되지 않은 메시지입니다.";
	}
}
