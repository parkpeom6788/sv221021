package org.kosta.myproject.model;

public class memberDAO {
	private static memberDAO instance = new memberDAO();
	private memberDAO() {}
	public static memberDAO getInstance() {
		return instance;
	}
	
	public void delete() {
		System.out.println("안녕");
	}
}
