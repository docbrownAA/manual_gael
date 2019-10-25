package com.example.demo.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
public class AppProperties {

	private final Auth auth = new Auth();
	private final OAuth2 auth2 = new OAuth2();

	public static class Auth {
		private String tokenSecret;
		private long tokenExpirationMsec;

		public String getTokenSecret() {
			return tokenSecret;
		}

		public void setTokenSecret(String tokenSecret) {
			this.tokenSecret = tokenSecret;
		}

		public long getTokenExpirationMsec() {
			return tokenExpirationMsec;
		}

		public void setTokenExpirationMsec(long tokenExpirationMsec) {
			this.tokenExpirationMsec = tokenExpirationMsec;
		}

	}

	public static final class OAuth2 {
		private List<String> authorizedRedirectsUris = new ArrayList<>();

		public List<String> getAuthorizedRedirectsUris() {
			return authorizedRedirectsUris;
		}

		public void setAuthorizedRedirectsUris(List<String> authorizedRedirectsUris) {
			this.authorizedRedirectsUris = authorizedRedirectsUris;
		}

	}

	public Auth getAuth() {
		return auth;
	}

	public OAuth2 getAuth2() {
		return auth2;
	}
	
	
}
