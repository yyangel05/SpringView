package controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class MemberInfoValidator implements Validator {
	
	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "required"); //아이디가 비어있는지 체크
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required"); //이름이 비었는지 체크
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address.address1", "required"); //주소1이 비었는지 체크
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address.address2", "required"); //주소2가 비었는지 체크
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "jobCode", "required"); //직업이 비었는지 체크
		MemberInfo memberInfo = (MemberInfo) target;
		if(memberInfo.getFavorites() == null || memberInfo.getFavorites().length == 0) { //선호os가 비었는지 체크
			errors.rejectValue("favorites", "must_select");
		}
	}
	
	@Override
	public boolean supports(Class<?> clazz) {
		return MemberInfo.class.isAssignableFrom(clazz);
	}

}
