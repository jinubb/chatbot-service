package com.jinubb.chatbot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "msg")
public class Msg {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; // 메세지 번호
	
	@Column(name="MESSAGE")
	private String message; // 메시지 내용
	
	@Column(name="VERIFIED")
	private String verified; // 답장 성공여부
}
