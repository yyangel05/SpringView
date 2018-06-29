package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/member/regist.do")
public class RegisterMemberController {
	
	private String formViewName = "registMemberForm";
	
	@RequestMapping(method = RequestMethod.GET) 
	public String form(Model model) {
		referenceData(model);
		return formViewName;
	}
	
	private void referenceData(Model model) {
		List<Code> jobCodes = new ArrayList<Code>();
		jobCodes.add(new Code("1", "개발자"));
		jobCodes.add(new Code("2", "UI 개발자"));
		jobCodes.add(new Code("3", "웹 디자이너"));
		jobCodes.add(new Code("4", "기획자"));
		
		String[] favoritesOsNames = {"윈도우xp", "vista", "window7", "Ubuntu","MAC"};
		String[] tools = {"Eclipse", "Visual Studio", "NetBeans"};
		
		model.addAttribute("jobCodes", jobCodes);
		model.addAttribute("favoritesOsNames", favoritesOsNames);
		model.addAttribute("tools", tools);
		
	}
	
	@ModelAttribute
	protected Object formBackingObject() throws Exception {
		return new MemberInfo();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute MemberInfo memberInfo, BindingResult result, Model model) {
		new MemberInfoValidator().validate(memberInfo, result);
		checkDuplicateId(memberInfo.getUserId(), result);
		
		if(result.hasErrors()) {
			referenceData(model);
			return formViewName;
		}
		return "registMember";
	}
	
	private void checkDuplicateId(String userId, BindingResult errors) {
		if(userId.equals("zzuggumi")) {
			errors.rejectValue("userId", "duplicate");
		}
	}

}
