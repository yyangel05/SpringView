package controller;

//RegisterMembberController의 직업 리스트와 연결
public class Code {
	
	private String code; //인덱스(1,2,3,4,...)
	private String label; //내용(개발자, 기획자, 디자이너,....)
	
	public Code(String code, String value) {
		this.code = code;
		this.label = value;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	

}
