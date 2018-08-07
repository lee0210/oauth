package com.stupidc.oauth.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class App {
	
	@Id
	private String appId;
	private String appSecret;
	private String redirectUrl;
	
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppSecret() {
		return appSecret;
	}
	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}
	public String getRedirectUrl() {
		return redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	

}
