package org.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dragdown {
public static void main(String[] args) throws Exception {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	
	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	
	 WebElement single =driver.findElement(By.xpath("//select[@id='second']"));
	 
	 Select s = new Select (single);
//	 s.selectByIndex(2);
//	 s.selectByValue("Apple");
//	 s.selectByVisibleText("Bing");
//	 
//	 
//	  List<WebElement>option =s.getOptions();
//	  
//	  for (int i = 0; i <option.size(); i++) {
//		WebElement options = option.get(i);
//		String text = options.getText();
//		System.out.println(text);
	 
	// boolean multiple = s.isMultiple();
//	 System.out.println(multiple);
	 
//	 s.selectByIndex(0);
//	 s.selectByIndex(1);
//	 s.selectByIndex(2);
	 
	//s.deselectbyindex(3) or //s.deselectall 
//	 List<WebElement> qwerty =s.getOptions();
//  
//	  for (int i = 0; i <qwerty.size(); i++) {
//		WebElement g = qwerty.get(i);
//		String text = g.getText();
//		System.out.println(text);
	 
	 
//	 s.selectByIndex(0);
//	 s.selectByIndex(2);
//	 s.selectByIndex(3);
//	 
//	 List<WebElement>getAllSelectedOptions=s.getAllSelectedOptions();	
//	 for (int i = 0; i <getAllSelectedOptions.size(); i++) {
//			WebElement options = getAllSelectedOptions.get(i);
//			String text = options.getText();
//		System.out.println(text);
	 
	  s.selectByIndex(0);
      s.selectByIndex(2);
	 
	WebElement a =s.getFirstSelectedOption();
//	for (int i = 0; i <a.getSize(); i++) {
//		WebElement options = a.get(i);
		String text =a.getText();
	System.out.println(text);
	
	 
	 
		
		
		
		
		
		
		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  }
	  
	  
	  
	 
	 
	 
	}
	
	
