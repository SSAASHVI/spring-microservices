package com.email.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {
	private static final String MESSAGE_QUEUE = "message_queue";

	@JmsListener(destination = MESSAGE_QUEUE)
	public void receiveMessage(String message) {
		System.out.println("Message consumed " + message);
//		throwexception(product);
	}

	private void throwexception(String message) {
		if (message == null) {
			throw new RuntimeException();
		}
	}
}
