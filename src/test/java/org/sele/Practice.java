package org.sele;

import java.time.Duration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		
	//	WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver ();
		
//		driver.get("https://www.flipkart.com/");
//		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		WebElement user = driver.findElement(By.xpath("//input[@class='_3704LK']"));
//	    user.sendKeys("realme");
//	    driver.findElement(By.tagName("button")).click();
//	    Map<String,String> mop = new HashMap<>();
//	  List<WebElement> mn =  driver.findElements(By.xpath("//div[@class='_4rR01T']"));
//	  List<WebElement> mp = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
//	
//	  for (int i = 0; i < mn.size(); i++) {
//		  WebElement name = mn.get(i);
//		  String names =name.getText();
//		  
//		  for (int j = i; j <i+1; j++) {
//			  WebElement price = mp.get(j);
//			  String prices =price.getText();
//			  
//			
//		
//	  mop.put(names,prices);
//	  
//	  Set<Entry<String,String>>entryset=mop.entrySet();
//	  for(Entry<String,String>Entry:entryset) {
//				System.out.println(Entry);}
		
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver ();
     driver.get("http://www.amazon.com/");
       WebElement q = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        q.sendKeys("redmimobiles",Keys.ENTER);
        
        
     
      driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

      driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
		

      driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();
      String n = driver.getWindowHandle();
      Set<String> s = driver.getWindowHandles();
      for ( String x: s) {
		 if (!n.equals(x)) {
    driver.switchTo().window(x);
    
    
    List<String> sd = Newarraylist<>(child);
    sd.sw

	  }}}}
	system(vijay)
				
    
		

		
