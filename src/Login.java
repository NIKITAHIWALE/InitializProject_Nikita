import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login {

	public static void main(String[] args) throws InterruptedException {
                                                      // C:\Users\NikitaHiwale\chromedriver-win64
	
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\NikitaHiwale\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://console.dev.initializ.ai/login/");
		driver.findElement(By.id("user-email-input")).sendKeys("nhiwale@initializ.io");
  	    driver.findElement(By.id("auth-login-v2-password")).sendKeys("Pass@123");
  	    driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div/form/button")).click();
  	    Thread.sleep(3000);
     	driver.manage().window().maximize();
  	/*----------------------------------------------------------------------------------------*/
		
		
	/*	System.setProperty("WebDriver.edge.driver", "C:\\Users\\NikitaHiwale\\edgedriver_win64");
		WebDriver driver = new EdgeDriver();
	*/
		
	 /* chrome
		 System.setProperty("WebDriver.chrome.driver", "Users\\NikitaHiwale\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
		driver.get("https://console.dev.initializ.ai/login/");
		driver.findElement(By.id("user-email-input")).sendKeys("nhiwale@initializ.io");
    	driver.findElement(By.id("auth-login-v2-password")).sendKeys("Password@1234$$");
    	driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div/form/button")).click();
    	driver.manage().window().maximize();
    	*/
 		//driver.close();
 		//driver.quit();
    	
    	
	   
		
	}

}
