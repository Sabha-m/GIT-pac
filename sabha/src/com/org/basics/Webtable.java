package com.org.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webtable {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","C:/Users/91807/Desktop/driver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		/*
		 * WebElement findElement = driver.findElement(By.xpath("//div[text()='29']"));
		 * String text = findElement.getText(); System.out.println(text);
		 * 
		 * WebElement grup1 =
		 * driver.findElement(By.xpath("//div[@class='rt-thead -header']"));
		 * System.out.print(grup1.getText());
		 */
		
		/*
		 * WebElement grup2 =
		 * driver.findElement(By.xpath("//div[@class='rt-tr-group'][1]"));
		 * System.out.println(grup2.getText());
		 * 
		 * WebElement grup3 =
		 * driver.findElement(By.xpath("//div[@class='rt-tr-group'][2]"));
		 * System.out.println(grup3.getText());
		 * 
		 * WebElement grup4 =
		 * driver.findElement(By.xpath("//div[@class='rt-tr-group'][3]"));
		 * System.out.println(grup4.getText());
		 */
		
		WebElement grup5 = driver.findElement(By.xpath("//div[@class='rt-tbody']"));
		System.out.println(grup5.getText());
		
	}

}
