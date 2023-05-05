package org.sele;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionssss {

	public static void main(String[] args) throws Exception {
         WebDriverManager.edgedriver().setup();
		WebDriver driver = new  EdgeDriver();
//		driver .get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
//		WebElement login =driver.findElement(By.xpath("//a[text()='Login']"));
//		
//		
//		Actions ac = new Actions(driver);
//		ac.moveToElement(login).perform();
//		
		
		driver.get("https://www.facebook.com/");
//		WebElement login= driver.findElement(By.id("email"));
//		login.sendKeys("selenium");
//		Thread.sleep(3000);
//		//((WebElement) driver).sendKeys("selenium");
//		Actions ac = new Actions(driver);
//		ac.doubleClick(login).contextClick().build().perform();
	WebElement  pass = driver.findElement(By.xpath("//input[@name='pass']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].setattribute('value','qwerty')",pass);
		
		
		Robot r = new Robot();
		for (int i = 0; i <3; i++) {
			
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);}
		
		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		//r.keyPress(KeyEvent.VK_TAB);
//		//r.keyRelease(KeyEvent.VK_TAB);
//	//	r.keyRelease(KeyEvent.VK_C);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
//		
		
		
	}
		
		
		
		
		
		
		

	}


