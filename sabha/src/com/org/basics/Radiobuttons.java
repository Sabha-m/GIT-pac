package com.org.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Radiobuttons {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","C:/Users/91807/Desktop/driver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		WebElement findElement = driver.findElement(By.xpath("//input[@type='radio'][2]"));
		
		findElement.click();
		boolean selected = findElement.isSelected();
		
		
		if(selected==true) {
			System.out.println(selected);
		}
		else {
			driver.close();
			
		}
		//WebElement findElement2 = driver.findElement(By.xpath("//input[@value='red'][1]"));
		//findElement2.click();
		
		boolean selected2 = findElement.isSelected();
		System.out.println(selected2);
		
		List<WebElement> findElements = driver.findElements(By.xpath("//input[@name='color']"));
		//for(int i=0; i<findElements.size(); i++) {
			
		//	findElements.get(i).click();
			
		//}
		
		for(WebElement d:findElements) {
			//d.click();
			if(d.getAttribute("value").equals("red")||d.getAttribute("value").equals("blue")) {
				d.click();
			}
			
			String attribute = d.getAttribute("value");
			System.out.println(attribute);
			
			
			
			
	}
		
		Actions f= new Actions(driver);
		
		
		WebElement r = driver.findElement(By.tagName("//h1"));
		f.moveToElement(r);
		
		
		
		
		
		
	}

}
