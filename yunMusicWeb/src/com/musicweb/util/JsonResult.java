package com.musicweb.util;

public class JsonResult {

	private boolean code;
	private String message;
	private Object data;
	public String getMsg() {
		return message;
	}
	public void setMsg(String msg) {
		this.message = msg;
	}
	public boolean getCode() {
		return code;
	}
	public void setCode(boolean code) {
		this.code = code;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
