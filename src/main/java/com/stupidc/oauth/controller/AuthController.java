package com.stupidc.oauth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stupidc.oauth.controller.response.AuthResponse;

@Controller
public class AuthController {
	
	@RequestMapping(path="/auth")
	public @ResponseBody ResponseEntity<?> auth(
			@RequestParam(name="grant_type") String grantType,
			@RequestParam(name="username", required=false) String user,
			@RequestParam(name="password", required=false) String passwd,
			@RequestParam(name="redirect_url", required=false) String redirectUrl) throws Exception {
		if (grantType.equals("password")) {
		}
		throw new Exception();
	}
	
	public AuthResponse passwordAuth(String user, String passwd, String redirectUrl) {
		AuthResponse response = new AuthResponse();
		return response;
	}

}
