package com.jinubb.chatbot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jinubb.chatbot.model.ResponseMsg;
import com.jinubb.chatbot.service.ChatbotService;
import com.jinubb.common.ResponseContainer;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/jinubb/chatbot")
public class ChatbotController {
	private static Logger logger = LoggerFactory.getLogger(ChatbotController.class);
	
	@Autowired
	ChatbotService service;
	
	@ApiOperation(value = "로그인")
	@PostMapping("/")
	public ResponseContainer<ResponseMsg> RequestMsg(
			@RequestParam(required = true) String msg) {
		ResponseContainer<ResponseMsg> response = ResponseContainer.emptyResponse();		
		try {
			response.setPayload(service.RequestMsg(msg));
		} catch(Exception e) {
			logger.error("request:\n{}",e);
			response.setError(e);
		}
		return response;
	}
}
