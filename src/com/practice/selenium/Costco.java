//package com.practice.selenium;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//
//public class Costco extends TestcaseHelper {
//
//	public static WebDriver driver;
//	@Test
//	public  void Costco1() throws InterruptedException {
//		
//		driver=new FirefoxDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//		
//		driver.get("https://www.costco.com/");
//
//		WebElement element=driver.findElement(By.id("navigation-dropdown"));
//		Actions action=new Actions(driver);
//		action.moveToElement(element).click().perform();
//		WebElement element2=driver.findElement(By.name("Electronics"));
//		Actions action1=new Actions(driver);
//		action1.moveToElement(element2).perform();
//		WebElement element3=driver.findElement(By.name("iPad"));
//		Actions action2=new Actions(driver);
//		action2.moveToElement(element3).click().perform();
//		
//		Thread.sleep(5000);
//		
//		driver.quit();
//	}
//	@Test
//	public void applicationformfill() throws InterruptedException
//	{
//		System.out.println("I am from costco class another test from application applicaitonformfill method");
//		
//		// new instance for firefox driver
//				driver=new FirefoxDriver();
//				
//				driver.manage().window().maximize();
//				
//				// in webpage it ill wait for 100 seconds to view webelement
//				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//				
//				// navigate to the webpage
//				driver.get("http://toolsqa.com/automation-practice-form/");
//				
//				// Click on practical link test
//				driver.findElement(By.linkText("Partial Link Test")).click();
//				
//				//click on link test which will navigate to practice form table
//				driver.findElement(By.linkText("Link Test")).click();
//				
//				Thread.sleep(5000);
//				//will navigate  back to the practice form page
//				driver.navigate().back();
//				
//				// enters the firstname and lastname
//				driver.findElement(By.name("firstname")).clear();
//				driver.findElement(By.name("firstname")).sendKeys("Muralidhar");
//				driver.findElement(By.name("lastname")).clear();
//				driver.findElement(By.name("lastname")).sendKeys("Batchu V");
//				
//				//selecgting the radio button
//				driver.findElement(By.id("sex-0")).click();
//				
//				//4-years of experience
//				driver.findElement(By.id("exp-3")).click();
//				
//				//list of years of expirence
//				List<WebElement> element=driver.findElements(By.name("exp"));
//				String xpathstart=".//*[@id='exp-";
//				String xpathend="']";
//				for(int i=0;i<element.size();i++)
//				{
//					driver.findElement(By.xpath(xpathstart+i+xpathend)).click();;
//				}
//				//date
//				driver.findElement(By.id("datepicker")).sendKeys("05/12/1988");
//				
//				//Manual tester
//				driver.findElement(By.id("profession-0")).click();
//				
//				//broswe
//				//driver.findElement(By.id("photo")).click();
//				
//				//list of tools
//				List<WebElement> element1=driver.findElements(By.name("tool"));
//				String firsstpath=".//*[@id='tool-";
//				String endpath="']";
//				for(int j=0;j<element1.size();j++)
//				{
//					driver.findElement(By.xpath(firsstpath+j+endpath)).click();
//				}
//				
//				//select command
//				Select select=new Select(driver.findElement(By.id("continents")));
//				System.out.println(select.getOptions().size());
//				for(int i=0;i<select.getOptions().size();i++)
//				{
//					select.selectByIndex(i);
//				}
//				
//				//multi select command
//				
//				Select select1=new Select(driver.findElement(By.id("selenium_commands")));
//				for(int i=0;i<select1.getOptions().size();i++)
//				{
//					select1.selectByIndex(i);
//				}
//				
//				Thread.sleep(5000);
//				
//				driver.quit();
//	}
//
//}
