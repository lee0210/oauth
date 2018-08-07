package com.stupidc.oauth.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JWT {
    
	@Id
    private String jwt;
    private String user;
    private String scope;
    private String expire;

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public String getExpire() {
		return expire;
	}

	public void setExpire(String expire) {
		this.expire = expire;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

}
