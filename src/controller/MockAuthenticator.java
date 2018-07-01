package controller;

//001예제. Authenticator을 구현한 클래스. 

public class MockAuthenticator implements Authenticator {
	
	@Override
	public void authenticate(String id, String password) { 
		if(!id.equals("zzuggumi")) { //입력한 아이디가 zzuggumi여야 한다. 비밀번호는 아무거나
			throw new AuthenticationException("invalid id " + id);
		}
	}

}
