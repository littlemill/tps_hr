package tps_hr;

import java.util.Map;

public class login {
	
	private Map<String,String> loginInfo;
	private String[] idL = {"30024","00120","30110","20341","42343","12345","28788","57778"};
	private String[] passwordL = {"12345","12121","11111","22222","33333","44444","55555","66666"};
	private int initialsize = 8;
	
	public login() {
		for(int i = 0 ; i<initialsize ;i++) {
			this.loginInfo.replace(idL[i], passwordL[i]);
		}
	}
	
	public void addLogin(String id,String pass) {
		this.loginInfo.replace(id, pass);
	}
	public void editLogin(String id,String pass) {
		this.loginInfo.replace(id, pass);
	}
	public void removeLogin(String id) {
		this.loginInfo.remove(id);
	}
	
	//getters & setters
	public Map<String, String> getLoginInfo() {
		return loginInfo;
	}
	
	public void setLoginInfo(Map<String, String> loginInfo) {
		this.loginInfo = loginInfo;
	}
	
	
}
