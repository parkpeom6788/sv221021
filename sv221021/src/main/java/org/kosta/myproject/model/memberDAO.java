package org.kosta.myproject.model;

public class memberDAO {
	private static memberDAO instance = new memberDAO();
	private memberDAO() {}
	public static memberDAO getInstance() {
		return instance;
	}
	
	public void register() {
		System.out.println("안녕");
	}

	public void login() {
		System.out.println("메롱");
	}
	
}
