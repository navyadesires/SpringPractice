package com.mouritech.springdiexample.fieldbaseddi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springdiexample.service.MessageService;

@Component
public class FieldBasedInjection {
	@Autowired
	@Qualifier("FaceBookService")
	private MessageService msgService;

	public MessageService getMsgService() {
		return msgService;
	}

	public void setMsgService(MessageService msgService) {
		this.msgService = msgService;
	}
	
	public void sendMsg(String message) {
		msgService.sendMsg(message);
	}
	
}