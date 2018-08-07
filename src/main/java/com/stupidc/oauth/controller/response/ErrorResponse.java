package com.stupidc.oauth.controller.response;

public class ErrorResponse {

	private String error;
	private String error_description;
	private String error_uri;

	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getError_description() {
		return error_description;
	}
	public void setError_description(String error_description) {
		this.error_description = error_description;
	}
	public String getError_uri() {
		return error_uri;
	}
	public void setError_uri(String error_uri) {
		this.error_uri = error_uri;
	}

}
