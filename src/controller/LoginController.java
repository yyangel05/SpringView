package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login/login.do")
public class LoginController {
	
	private Authenticator authenticator;
	
	@ModelAttribute("login") //jsp에서 form으로 전송될 액션같은거의 이름??
	public LoginCommand formBacking() {
		return new LoginCommand();
	}
	
	@RequestMapping(method = RequestMethod.GET) 
	public String form() {
		return "loginForm";
	}
	
	@RequestMapping(method = RequestMethod.POST) 
	public String submit(@ModelAttribute("login") LoginCommand loginCommand, BindingResult result) {
		new LoginCommandValidator().validate(loginCommand, result);
		if(result.hasErrors()) {
			return "loginForm";
		}
		
		try {
			authenticator.authenticate(loginCommand.getId(), loginCommand.getPassword()); //MockAuthenticator의 메서드가 실행됨.
			return "loginSuccess";
		} catch(AuthenticationException ex) {
			result.reject("invalidIdOrPassword",new Object [] {loginCommand.getId() }, null); //properties에서 invalidIdOrPassword.login라는 텍스트를 출력한다
			return "loginForm";
		}
	}
	
	@ModelAttribute("loginTypes") //jsp에서 꺼내 쓸 이름. 셀렉트박스에서 내용물들을 보여주기 위함.
	protected List<String> referenceData() throws Exception {
		List<String> loginTypes = new ArrayList<String>(); //리스트 객체 loginTypes 생성
		loginTypes.add("일반회원"); //내용물1
		loginTypes.add("기업회원"); //내용물2
		loginTypes.add("헤드헌터회원"); //내용물3
		return loginTypes; //리스트객체 리턴
	}
	
	public void setAuthenticator(Authenticator authenticator) {
		this.authenticator = authenticator;
	}

}
