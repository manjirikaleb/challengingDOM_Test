package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.*;
@SuppressWarnings("unused")
public class Steps_login {
	
	WebDriver driver=null;
	
	@Given("I have open the browser")
	public void login(){
		if (driver==null) {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);   
	    System.out.println("Successfully open chrome Browser");
		}
		else {
			 System.out.println("Successfully open chrome Browser");	
		}
	}
	
	@When("I open Challenging Dom website")
	public void openWebSite() {
		driver.get("http://the-internet.herokuapp.com/challenging_dom");
	    System.out.println(" Successfully open Challenging Dom website ");
	   } 
	
	@When("Verify Web Page Title as Challenging DOM is dispalyed on UI")
	public void verifyWebPage() {
		if(driver.findElement(By.xpath("//*[@id='content']/div/h3")).isDisplayed()) { 
	         System.out.println("Successfully verifed Page Title as- Challenging DOM"); 
	      } else {
	         System.out.println("Verifed Page Title as- Challenging DOM not displayed on UI");
	      } 
		
	   }
	
	@Then("Verify three button on UI in blue Red and Green")
	public void verifyButtons(){
		     WebElement element_Button1 = driver.findElement(By.xpath("//div[@class='large-2 columns']/a[@class='button']"));
		     String button_ID_beforeClick = element_Button1.getAttribute("id");
	         System.out.println("Successfully verifed 1st button on web Page with Text as - " + element_Button1.getText() + "   and ID as " + element_Button1.getAttribute("id")); 
	         element_Button1.click(); 
	         String button_ID_afterClick = driver.findElement(By.xpath("//div[@class='large-2 columns']/a[@class='button']")).getAttribute("id");
	         Assert.assertNotEquals(button_ID_beforeClick, button_ID_afterClick);
	         System.out.println("After click on 1st button on web Page with dispalyed Text as - " + driver.findElement(By.xpath("//div[@class='large-2 columns']/a[@class='button']")).getText()+ "  and ID as " + button_ID_afterClick);     
	         
	         WebElement element_Button2 = driver.findElement(By.xpath("//div[@class='large-2 columns']/a[@class='button alert']"));
		     button_ID_beforeClick = element_Button2.getAttribute("id");
	         System.out.println("Successfully verifed 2nd button on web Page with Text as - " + element_Button2.getText() + "   and ID as " + element_Button2.getAttribute("id")); 
	         element_Button2.click(); 
	         button_ID_afterClick = driver.findElement(By.xpath("//div[@class='large-2 columns']/a[@class='button alert']")).getAttribute("id");
	         Assert.assertNotEquals(button_ID_beforeClick, button_ID_afterClick);
	         System.out.println("After click on 2nd button on web Page with dispalyed Text as - " + driver.findElement(By.xpath("//div[@class='large-2 columns']/a[@class='button alert']")).getText()+ "  and ID as " + button_ID_afterClick);     
	        
	         WebElement element_Button3 = driver.findElement(By.xpath("//div[@class='large-2 columns']/a[@class='button success']"));
		     button_ID_beforeClick = element_Button3.getAttribute("id");
	         System.out.println("Successfully verifed 2nd button on web Page with Text as - " + element_Button3.getText() + "   and ID as " + element_Button3.getAttribute("id")); 
	         element_Button3.click(); 
	         button_ID_afterClick = driver.findElement(By.xpath("//div[@class='large-2 columns']/a[@class='button success']")).getAttribute("id");
	         Assert.assertNotEquals(button_ID_beforeClick, button_ID_afterClick);
	         System.out.println("After click on 3rd button on web Page with dispalyed Text as - " + driver.findElement(By.xpath("//div[@class='large-2 columns']/a[@class='button success']")).getText()+ "  and ID as " + button_ID_afterClick);            
	         
	}
		
	@Then("Verify table header on webPage")
	public void verifyTableHeader(){
		  Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"large-10 columns\"]/table/thead/tr/th[1]")).getText(),"Lorem");
	      System.out.println("Column Header - Lorem displayed successfully."); 
	      
	      Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"large-10 columns\"]/table/thead/tr/th[2]")).getText(),"Ipsum");
	      System.out.println("Column Header - Ipsum displayed successfully."); 
	     
	      Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"large-10 columns\"]/table/thead/tr/th[3]")).getText(),"Dolor");
	      System.out.println("Column Header - Dolor displayed successfully."); 
	      
	      Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"large-10 columns\"]/table/thead/tr/th[4]")).getText(),"Sit");
	      System.out.println("Column Header - Sit displayed successfully."); 
	    
	      Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"large-10 columns\"]/table/thead/tr/th[5]")).getText(),"Amet");
	      System.out.println("Column Header - Amet displayed successfully."); 
	    
	      Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"large-10 columns\"]/table/thead/tr/th[6]")).getText(),"Diceret");
	      System.out.println("Column Header - Diceret displayed successfully."); 
	    
	      Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"large-10 columns\"]/table/thead/tr/th[7]")).getText(),"Action");
	      System.out.println("Column Header - Action displayed successfully."); 
	    
	}
	
	@Then("Verify edit and delete button in table")
	public void verifyEditDeleteButton() {
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[2]/table/tbody/tr[1]/td[7]/a[1]")).getText(),"edit");
		System.out.println("Successfully verifed Edit button on web Page"); 
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[1]/td[7]/a[2]")).getText(),"delete");
		System.out.println("Successfully verifed Delete button on web Page"); 
	   }
	
	@Then("Close browser")
	public void closeBrowser(){
		driver.quit();
	}
	
	}
