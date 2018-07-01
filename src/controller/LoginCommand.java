package controller;

public class LoginCommand {
	
	private String id; //아이디
	private String password; //비밀번호
	private String loginType; //로그인유형(일반회원/기업회원/..)
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoginType() {
		return loginType;
	}
	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}
	
	

}
