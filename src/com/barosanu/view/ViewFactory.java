package com.barosanu.view;

import com.barosanu.EmailManager;

public class ViewFactory {
	private EmailManager emailManager;

	public ViewFactory(EmailManager emailManager) {
		super();
		this.emailManager = emailManager;
	}
	
	public void showLoginWindow() {
		
		System.out.println("pokazuje");
	}

}
