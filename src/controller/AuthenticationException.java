package controller;

public class AuthenticationException  extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public AuthenticationException(String message) {
		super(message); //액션의 catch부분의 내용을 super로 올려서 값을주는느낌??
	}
}
