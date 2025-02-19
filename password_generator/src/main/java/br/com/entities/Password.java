package br.com.entities;

public class Password {
	
	private String password;
	
	private String[] type;
	
	private Integer lenght;
	
	public Integer getLenght() {
		return lenght;
	}
	
	public void setLenght(Integer lenght) {
		this.lenght = lenght;
	}
	
	public void setType(String[] type) {
		this.type = type;
	}
	
	public String[] getType() {
		return type;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
}
