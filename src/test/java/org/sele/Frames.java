package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws Exception{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	  driver.get("https://chercher.tech/practice/frames");
	  
	  
//	  driver.switchTo().frame("frame1");
//	 WebElement wer= driver.findElement(By.xpath("//b[@id='topic']"));
//	 String text = wer.getText();
//	 System.out.println(text);
	  
	  driver.switchTo().frame("frame1");
	  driver.switchTo().frame("frame3");
	  driver.findElement(By.xpath("//input[@id='a']")).click();
//	 
	  
	  
	  
	  
	}

}
