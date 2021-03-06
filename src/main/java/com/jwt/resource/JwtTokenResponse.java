package com.jwt.resource;

import java.io.Serializable;

public class JwtTokenResponse implements Serializable {

	private static final long serialVersionUID = 8317676219297719109L;

	private final String token;
	private final String username;

	public JwtTokenResponse(String token,String username) {
		this.token = token;
		this.username=username;
	}

	public String getToken() {
		return this.token;
	}

	public String getUsername() {
		return this.username;
	}
}