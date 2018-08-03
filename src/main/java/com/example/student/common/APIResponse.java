package com.example.student.common;

import java.io.Serializable;

public class APIResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	private int status;
	
	@Override
	public String toString() {
		return "APIResponse [message=" + message + ", status=" + status + "]";
	}

}
