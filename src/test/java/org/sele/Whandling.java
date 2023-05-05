package org.sele;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Whandling {
	public static void main(String[] args) throws IOException {
		try {
		WebDriverManager.edgedriver().setup();	
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement wer =driver.findElement(By.xpath("//input[@class='_3704LK']"));
		wer.sendKeys("realme",Keys.ENTER);
		 
			Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
		
		 String parent =driver.getWindowHandle();
		 Set<String> child = driver.getWindowHandles();
	 for ( String x: child) {
			 if (!parent.equals(x)) {
			 
	
			 driver.switchTo().window(x);

			  WebElement d =driver.findElement(By.xpath("//span[@class='B_NuCI']"))	 ;
			  String qw = d.getText();
			  System.out.println(qw);
		 }
		 }
	//	List<String> child1 = new ArrayList <> (child);
		// driver.switchTo().window(child1.get(1));
		
	 
		 
//		  WebElement d =driver.findElement(By.xpath("//span[@class='B_NuCI']"))	 ;
//		  String qw = d.getText();
//		  System.out.println(qw);
//		  
		  
//		  
		 //screenshot 
		  TakesScreenshot t = (TakesScreenshot)driver;
		  File src = t.getScreenshotAs(OutputType.FILE);
		  File des = new File("C:\\C:\\Users\\DELL\\eclipse-workspace\\Sele\\src\\test\\java\\org\\sele\\liiiis.png");
		  FileUtils.copyFile(src,des);
		  

		  
		  
		  
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();}}}
					
		
		
		
		
		
		
		

