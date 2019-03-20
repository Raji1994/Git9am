package org.hex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hexaware {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naveen\\Desktop\\raji\\HexAc\\src\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
