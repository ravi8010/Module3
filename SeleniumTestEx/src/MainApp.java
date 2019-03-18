import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in");
		WebElement src=driver.findElement(By.id("src"));
		src.click();
		src.sendKeys("Pune");
		src.click();
		Thread.sleep(1000);
		
	
		WebElement dest=driver.findElement(By.id("dest"));
		dest.click();
		dest.sendKeys("Mumbai");
		dest.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			
			e1.printStackTrace();
		}
		
		  driver.findElement(By.xpath("//*[@class='fl search-box date-box gtm-onwardCalendar']")).click();    
		    System.out.println("date box got clicked");     
		    String month="Apr 2019";        
		    String date="28";       
		    String getMonth=driver.findElement(By.xpath("//div[@class='rb-calendar']//td[@class='monthTitle']")).getText();         
		      while(true)   
		      {
		    	  if((getMonth.equalsIgnoreCase(month))) 
		            {
		                break;      
		            } 
		     
              driver.findElement(By.xpath("//div[@class='rb-calendar']/*//td[@class='next']")).click();     
              getMonth=driver.findElement(By.xpath("//div[@class='rb-calendar']//td[@class='monthTitle']")).getText(); 
		      }         
		      driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody//td[text()='"+month+"']/../..//td[text()='"+date+"']")).click();         
		      System.out.println("date got picked");
		      
		      
		      
		      
		      
		      driver.findElement(By.xpath("//*[@class='fl search-box date-box gtm-returnCalendar']")).click();    
			    System.out.println("date box got clicked");     
			    String month1="May 2019";        
			    String date1="29";       
			    String getMonth1=driver.findElement(By.xpath("//div[@class='rb-calendar']//td[@class='monthTitle']")).getText();               
			      while(true)   
			      {      
			      if((getMonth1.equalsIgnoreCase(month1))) 
			            {
			                break;      
			            } 
			     
	                driver.findElement(By.xpath("//div[@class='rb-calendar']/*//td[@class='next']")).click();
	                getMonth1=driver.findElement(By.xpath("//div[@class='rb-calendar']//td[@class='monthTitle']")).getText(); 
			      }      
			      
			      driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']/table/tbody//td[text()='"+month1+"']/../..//td[text()='"+date1+"']")).click();         
			      System.out.println("date got picked");
		      
		      
		      
		      
		      
		      try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		    driver.findElement(By.id("search_btn")).click();
		
	}

}
