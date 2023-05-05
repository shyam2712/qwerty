package org.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Webdriver2 {
	public static void main(String[] args) {
		try {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get ("https://www.facebook.com/");
		
	
	WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("wertyu");
		
	//WebElement user1 = driver.findElement(By.name("pass"));
	//user1.sendKeys("Shyam@2798");
	
	//WebElement button = driver.findElement(By.tagName("button"));
	//button.click();
	    
		WebElement button = driver.findElement(By.linkText("Create new account"));
		 button.click();}
		
		
		
		catch (Exception e) {
		System.out.println(e.toString());}
	
		
		
		}

	
		
	}
	     
		
		
			
	


