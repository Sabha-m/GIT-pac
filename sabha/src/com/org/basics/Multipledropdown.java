package com.org.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Multipledropdown {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","C:/Users/91807/Desktop/driver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		WebElement findElement = driver.findElement(By.xpath("//*[@name='coffee2']"));
		Select n = new Select(findElement);
		List<WebElement> options = n.getOptions();
		//n.deselectByIndex(2);
		//n.selectByIndex(5);
		//n.selectByVisibleText("A donut");
		//n.selectByValue("skim");
		
		//for(WebElement m:options) {
		//	System.out.println(m.getText());
			
		//}
		for(int i=0; i<options.size();i++) {
			n.selectByIndex(i);
			n.deselectByIndex(1);
			
		}
		
		
		
		
		
		
		

	}

}
