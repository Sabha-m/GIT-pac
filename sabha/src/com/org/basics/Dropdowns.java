package com.org.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","C:/Users/91807/Desktop/driver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		WebElement findElement = driver.findElement(By.name("coffee"));
		
		Select s = new Select(findElement);
		List<WebElement> options = s.getOptions();
		
		for(WebElement n:options) {
			String text = n.getAttribute("value");
			
			String text2 = n.getText();
			System.out.println(text2);
			
			List<WebElement> allSelectedOptions = s.getOptions();
			s.selectByValue("sugar");
			s.selectByVisibleText("With cream & sugar");
			s.selectByIndex(4);
			
			//for(int i=0;i<allSelectedOptions.size(); i++) {
				//s.selectByIndex(i);
				//s.deselectByIndex(i);
				
				
			//}
			
		}
		
		
		
	}

}
