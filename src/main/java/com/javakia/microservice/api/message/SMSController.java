package com.javakia.microservice.api.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javakia.microservice.api.service.SMSService;
import com.twilio.rest.api.v2010.account.Message;

@RestController
public class SMSController {

	@Autowired
	private SMSService smsService;

	@RequestMapping(value = "/sendSMS", method = RequestMethod.POST)
	public Message sendSMS() {
		return smsService.sendSMS();
	}

}
