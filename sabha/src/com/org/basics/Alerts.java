package com.org.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","C:/Users/91807/Desktop/driver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		/*	WebElement w = driver.findElement(By.cssSelector("button#alertButton"));
	     w.click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);
        Thread.sleep(3000);
        alert.accept();
        
        driver.findElement(By.xpath("//div/button[@id='confirmButton']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert();
        alert.accept();
	    // s.click();
   //    Alert alert1 = driver.switchTo().alert();
   //    String text1 = alert1.getText();
   //    System.out.println(text1);
   //    Thread.sleep(3000);
    //   alert.accept();
        
		
       /*	  WebElement e = driver.findElement(By.cssSelector("button#promtButton"));
		  e.click(); 
			
			 * Alert alert2 = driver.switchTo().alert(); String textre=alert2.getText();
			 * System.out.println(textre);
			 */
     
        driver.findElement(By.xpath("//div/button[@id='alertButton']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
        driver.findElement(By.xpath("//div/button[@id='timerAlertButton']")).click();
        Thread.sleep(6000);
        driver.switchTo().alert();
        alert.accept();
        Actions d= new Actions(driver);
        
        WebElement s = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        
        d.moveToElement(s);
        
        
        
	}

}
