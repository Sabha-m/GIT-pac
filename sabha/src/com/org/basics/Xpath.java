package com.org.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","C:/Users/91807/Desktop/driver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.xpath("//input[@id='email']"));
		findElement.sendKeys("sabhasrim@gmail.com");
		WebElement findElement2 = driver.findElement(By.xpath("//input[@id='pass']"));
		findElement2.sendKeys("sabha@67");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
		
		
		
		
	}

}
