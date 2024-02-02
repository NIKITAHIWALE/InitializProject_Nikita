import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DELETEAPP_FLOW {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("WebDriver.chrome.driver", "Users\\NikitaHiwale\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
		
	    driver.get("https://console.dev.initializ.ai/login/");
		driver.findElement(By.id("user-email-input")).sendKeys("nhiwale@initializ.io");
   	driver.findElement(By.id("auth-login-v2-password")).sendKeys("Pass@123");
   	driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div/form/button")).click();
   	Thread.sleep(4000);
   	driver.manage().window().maximize();
   	/*----------------------------------------------------------------------------------------*/
   
   
   	//Click on APP Button: its default selected
   	
   //TestDemo1
   //	driver.findElement(By.cssSelector("#__next > div.layout-wrapper.css-uinsfl > div.layout-content-wrapper.MuiBox-root.css-34b9xr > main > div > div.MuiTableContainer-root.css-1bcvmj7 > table > tbody > tr:nth-child(1) > td:nth-child(1)")).click();                  
   // 	Thread.sleep(4000);
   //testDemo2
   	driver.findElement(By.cssSelector("#__next > div.layout-wrapper.css-uinsfl > div.layout-content-wrapper.MuiBox-root.css-34b9xr > main > div > div.MuiTableContainer-root.css-1bcvmj7 > table > tbody > tr:nth-child(2) > td:nth-child(1)")).click();
   	//TestDemo3
   // driver.findElement(By.cssSelector("#__next > div.layout-wrapper.css-uinsfl > div.layout-content-wrapper.MuiBox-root.css-34b9xr > main > div > div.MuiTableContainer-root.css-1bcvmj7 > table > tbody > tr:nth-child(3) > td:nth-child(1)")).click();
   	
   	//Click on respective app which we want to delete
   	driver.findElement(By.cssSelector("#__next > div.layout-wrapper.css-uinsfl > div.layout-content-wrapper.MuiBox-root.css-34b9xr > main > div > div.MuiTableContainer-root.css-1bcvmj7 > table > tbody > tr:nth-child(1) > td:nth-child(1)")).click();
	Thread.sleep(3000);
   	
	//click on Settings
   	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/main/div[2]/div/div/button[3]")).click();
	Thread.sleep(3000);
	
	//Destroy app
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/main/div[6]/p/div/div[2]/div/div[3]/div/button")).click();
	Thread.sleep(3000);
	//pop up prompt
	// to click yes
//	driver.findElement(By.cssSelector("body > div.MuiDialog-root.MuiModal-root.css-126xj0f > div.MuiDialog-container.MuiDialog-scrollPaper.css-16u656j > div > div.MuiDialogActions-root.MuiDialogActions-spacing.css-186emkw > button.MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-disableElevation.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-disableElevation.css-1cnm9wy")).click();
	// to click cancel
	driver.findElement(By.cssSelector("body > div.MuiDialog-root.MuiModal-root.css-126xj0f > div.MuiDialog-container.MuiDialog-scrollPaper.css-16u656j > div > div.MuiDialogActions-root.MuiDialogActions-spacing.css-186emkw > button.MuiButtonBase-root.MuiButton-root.MuiButton-outlined.MuiButton-outlinedPrimary.MuiButton-sizeMedium.MuiButton-outlinedSizeMedium.MuiButton-disableElevation.MuiButton-root.MuiButton-outlined.MuiButton-outlinedPrimary.MuiButton-sizeMedium.MuiButton-outlinedSizeMedium.MuiButton-disableElevation.css-msingz")).click();
	
	}

}
