package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutClass 
{
private WebDriver driver;
    
   
    
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
   	private  WebElement aboutButton;
    
	 @FindBy(xpath="//a[@id='logout_sidebar_link']")
   	private  WebElement logOut;
    
    //Thread.sleep(5000);
   	
	public LogOutClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void ClickaboutButton()
	{
		aboutButton.click();
	}
	
	public void ClicklogOut()
	{
		logOut.click();
	}

	

	
}
