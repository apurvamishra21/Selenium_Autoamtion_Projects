package com.SendingMails;

import javax.mail.internet.AddressException;

public class TestMail {
	
	public static void main(String[] args) throws AddressException {
		
		MonitoringMail mail = new MonitoringMail();
		//mail.sendMail(TestConfig.server , TestConfig.from , TestConfig.to , TestConfig.subject , TestConfig.messageBody , TestConfig.attachmentPath ,TestConfig.attachmentName);
		//mail.sendMail(mailServer, from, to, subject, messageBody);
	}

}
