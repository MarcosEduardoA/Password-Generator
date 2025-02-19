package br.com.bean;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.entities.Password;

@ManagedBean(name = "passwordBean")
public class PasswordBean {
	
	private Password password = new Password();
	
	public void generatedPassword() {
		String numberType = "0123456789";
		String upperType = "ABCDEFGHIJKLMNOPQRSVWXYZ";
		String lowerType = "abcdefghijklmnopqrstuvxyz";
		String symbols = "!@#$%&*()+-=?.,;:/{}[]<>´`~^º°ªç";
		
		Random random = new Random();
		
		StringBuilder sb = new StringBuilder();
		
		int l = password.getLenght();
		
		String type = "";
		
		if (password.getType() != null) {
			for (int i = 0; i < password.getType().length; i++) {
				if (password.getType()[i].equals("NUMBER")) {
					type += numberType;
				}
				if (password.getType()[i].equals("UPPER")) {
					type += upperType;
				}
				if (password.getType()[i].equals("LOWER")) {
					type += lowerType;
				}
				if (password.getType()[i].equals("SYMBOLS")) {
					type += symbols;
				}
			}
		}
		
		if (type != "") {
			for (int i = 0; i < l; i++) {
				int index = random.nextInt(type.length());
				
				char randomChar = type.charAt(index);
				
				sb.append(randomChar);
			}
		}
		
		String randomString = sb.toString();
		password.setPassword(randomString);
		
	}
	
	public String newPassword() {
		generatedPassword();
		
		return "";
	}
	
	public String getCurrentPassword() {
		return password.getPassword();
	}
	
	public void setPassword(Password password) {
		this.password = password;
	}
	
	public Password getPassword() {
		return password;
	}
}
