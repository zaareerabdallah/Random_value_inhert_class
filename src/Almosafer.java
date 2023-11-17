

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Almosafer extends parametar {
	WebDriver driver = new ChromeDriver(); 
	@BeforeTest
    public void myBeforeTest() {
	
		
	}
	@Test
    public void myTestCurrancy () throws InterruptedException   {
		
		driver.get(website[RandomIndex]);
    
		driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]/div")).click();
    	if(driver.getCurrentUrl().contains("ar")) {
    		driver.findElement(By.xpath("//input[@placeholder='البحث عن فنادق أو وجهات']")).sendKeys(ArabicCity[RandomIndex]);
    		driver.findElement(By.xpath("//button[@class='sc-jTzLTM eJkYKb sc-1vkdpp9-6 iKBWgG js-HotelSearchBox__SearchButton btn btn-primary btn-block']")).click();
    	}
    	else {
    		driver.findElement(By.xpath("//input[@placeholder='Search for hotels or places']")).sendKeys(EngleshCity[RandomIndex]);
    		driver.findElement(By.xpath("//button[@class='sc-jTzLTM hQpNle sc-1vkdpp9-6 iKBWgG js-HotelSearchBox__SearchButton btn btn-primary btn-block']")).click();
    	}
    	 Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[2]/section[1]/div/button[2]")).click();
        Thread.sleep(2000);
        WebElement Divprice = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[1]")) ;
      
        List<WebElement>myList = Divprice.findElements(By.className("Price__Value"));
        
        for(int i=0 ; i< myList.size();i++){
        	System.out.println(myList.get(i).getText());
        }
        
        
	}
	

	

    @AfterTest
    public void myAfterTest() throws InterruptedException   {
    
    }
	 
}
