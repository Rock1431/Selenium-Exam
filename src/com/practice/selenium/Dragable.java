//package com.practice.selenium;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;
//
//public class Dragable extends TestcaseHelper {
//
//	public static WebDriver driver;
//	@Test
//	public  void Draggable1() throws InterruptedException {
//
//		driver=new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//		
//		driver.get("https://jqueryui.com/droppable/");
//
//	
//		        driver.switchTo().frame(0);
//		
//		WebElement from=driver.findElement(By.xpath(".//*[@id='draggable']"));
//		
//		WebElement to=driver.findElement(By.xpath(".//*[@id='droppable']"));
//		
//		 Actions builder = new Actions(driver);
//		 
//	      Action dragAndDrop = builder.clickAndHold(from)
//	 
//	     .moveToElement(to)
//	 
//	    .release(to)
//	 
//	   .build();
//	 
//	  dragAndDrop.perform();
//	 
//	  Thread.sleep(5000);
//	  
//	  driver.quit();
//
//				
//	}
//
//}
