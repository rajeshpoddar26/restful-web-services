package com.in28minutes.rest.webservices.restfulwebservices.exception;

import java.time.LocalDateTime;

public class ErrorDetails {

	private LocalDateTime timestamp;
	private String message;
	private String detaills;

	public ErrorDetails(LocalDateTime timestamp, String message, String detaills) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.detaills = detaills;
		
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetaills() {
		return detaills;
	}

	public void setDetaills(String detaills) {
		this.detaills = detaills;
	}

}
