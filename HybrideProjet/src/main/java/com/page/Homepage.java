package com.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	
	@FindBy(xpath = "//ul[@id='homeSubmenu']/li")
	List<WebElement> menu;
	public List getMenu() {
		ArrayList<String> menuName=new ArrayList<String>();
		return null;
		
		
		
		
	}
	

}
