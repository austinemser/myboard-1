package com.myboard.business;

import java.security.MessageDigest;

public class MyBoardSecurity {
	public static final String SALT = "sZ9U2zXmrw";
	
	public static String hashIt(String originalPassword){
		StringBuilder saltedPassword = new StringBuilder();
		saltedPassword.append(MyBoardSecurity.SALT);
		saltedPassword.append(originalPassword);
		
		StringBuilder sb = new StringBuilder();
		
		try{
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(saltedPassword.toString().getBytes());
			byte byteData[] = md.digest();
			
	        for (int i = 0; i < byteData.length; i++) {
	            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
	        }
		}catch(Exception ex){
			System.out.println("Exception while hashing clear password during Login. " + ex.getMessage());
		}
		
		return sb.toString().substring(0, 20);
	}
}
