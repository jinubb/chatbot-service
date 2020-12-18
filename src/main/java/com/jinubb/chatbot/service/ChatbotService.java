package com.jinubb.chatbot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinubb.chatbot.entity.Msg;
import com.jinubb.chatbot.model.ResponseMsg;
import com.jinubb.chatbot.repository.MsgRepository;

@Service
public class ChatbotService {
	
	@Autowired
	private MsgRepository msgRepo;
	
	public ResponseMsg RequestMsg(String requestMsg) {
		ResponseMsg res = new ResponseMsg();
		if(requestMsg.equalsIgnoreCase("Hello")) {
			res.setMsg("World");
			this.saveMsg(requestMsg, true);
		}else {
			res.unverified();
			this.saveMsg(requestMsg, false);
		}
		return res;
	}
	
	public Msg saveMsg(String reqMsg, boolean verified) {
		Msg msg = new Msg();
		msg.setMessage(reqMsg);
		String strVerified = (verified == true) ? "Y" : "N";
		msg.setVerified(strVerified);
		msgRepo.save(msg);
		return msg;
	}

}
