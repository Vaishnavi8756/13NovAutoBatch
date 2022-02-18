package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass 
{
	 private WebDriver driver;
	    
	    @FindBy(xpath="//input[@id='user-name']")
		private  WebElement userName;
		
	    @FindBy(xpath="//input[@id='password']")
	   	private  WebElement passWord;
	   	
	    @FindBy(xpath="//input[@id='login-button']")
	   	private  WebElement LoginButton;
	   	
		public LoginPageClass(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		public void sendUserName()
		{
			userName.sendKeys("standard_user");
		}
		public void sendpassWord()
		{
			passWord.sendKeys("secret_sauce");
		}
		public void ClickLoginButton()
		{
			LoginButton.click();
		}
		
		
		
		

}
