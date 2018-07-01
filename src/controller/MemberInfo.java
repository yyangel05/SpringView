package controller;

public class MemberInfo {
	
	private String userId; //아이디
	private String name; //이름
	private Address address; //주소. 주소객체타입
	private String[] favorites; //선호os(win, mac, ubuntu)
	private String jobCode; //직업(개발자/기획자/디자이너)
	private String tool; //선호개발툴(이클립스, 비쥬얼스튜디오...)
	private String etc; //기타 내용칸
	private boolean contractAgreement; //약관에 동의여부
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String[] getFavorites() {
		return favorites;
	}
	public void setFavorites(String[] favorites) {
		this.favorites = favorites;
	}
	public String getJobCode() {
		return jobCode;
	}
	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}
	public String getTool() {
		return tool;
	}
	public void setTool(String tool) {
		this.tool = tool;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	public boolean isContractAgreement() {
		return contractAgreement;
	}
	public void setContractAgreement(boolean contractAgreement) {
		this.contractAgreement = contractAgreement;
	}
	
	

}
