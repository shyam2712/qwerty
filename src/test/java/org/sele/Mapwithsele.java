package org.sele;


import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mapwithsele {
	
	public static String text;
	
	 public static void main(String[] args) {
		try {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		
	 driver.findElement (By.xpath("//button [@class = '_2KpZ6l _2doB4z']")).click();	
	
	 WebElement user =driver.findElement(By.xpath("//input[@type ='text']"));
	 user.sendKeys("redmi");
	 
	
		WebElement button = driver.findElement(By.tagName("button"));
		button.click();
		
		Map<String,String> mp= new HashMap <String, String>();
		Thread.sleep(7000);
		List<WebElement> name =driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> price =driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		//FileOutputStream out = new FileOutputStream(f); 
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\samplemvn\\target\\qasdwe.xlsx");
		Workbook q = new XSSFWorkbook();
		Sheet s =q.createSheet("sheet1");
		
		
		
		for (int i = 0; i <name.size(); i++) {
			WebElement w= name.get(i);
			String text = w.getText();
			Row r = s.createRow(i);
			Cell e =r.createCell(0);
			e.setCellValue(text);
			
			
			
			
			
			for (int j = i; j<=i+1; j++) {
				WebElement p = price.get(j);
				String number =p.getText();
				Cell h = r.createCell(1);
				h.setCellValue(number);
		mp.put(text, number)	;
		
		Set <Entry<String,String>>entryset =mp.entrySet();
		for(Entry<String,String>Entry:entryset) {
			System.out.println(Entry);
			
			
			
		
			FileOutputStream out = new FileOutputStream(f); 
			q.write(out);
		}
		
				
				
				
				
				
				
				
			}
			
		}
		   
		   

		}
		catch(Exception e) {
		System.out.println(e.toString());}}}
