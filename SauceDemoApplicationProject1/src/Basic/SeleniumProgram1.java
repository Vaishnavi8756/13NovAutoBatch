package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProgram1 {

	public static void main(String[] args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
		System.out.println("main");
		driver.close();
	}

}
