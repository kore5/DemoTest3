package com.page;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.support.FindBy;

public class Homepage {
	
	@FindBy(xpath = "//ul[@id='homeSubmenu']/li")
	List<WebElement> menu;
	public List<String>getMenu(){
		ArrayList<String>menuName=new ArrayList<String>();
		return null;
		
		
		
		
	}
	

}
