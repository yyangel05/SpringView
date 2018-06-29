package controller;

public class MockAuthenticator implements Authenticator {
	
	@Override
	public void authenticate(String id, String password) {
		if(!id.equals("zzuggumi")) {
			throw new AuthenticationException("invalid id " + id);
		}
	}

}
