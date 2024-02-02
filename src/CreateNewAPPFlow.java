import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAPPFlow  {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\NikitaHiwale\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		 
		// System.setProperty("WebDriver.chrome.driver", "Users\\NikitaHiwale\\chromedriver-win64\\chromedriver.exe");
	     //WebDriver driver = new ChromeDriver(); 
		
	    driver.get("https://console.dev.initializ.ai/login/");
		driver.findElement(By.id("user-email-input")).sendKeys("nhiwale@initializ.io");
    	driver.findElement(By.id("auth-login-v2-password")).sendKeys("Pass@123");
    	driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div/form/button")).click();
    	Thread.sleep(4000);
    	driver.manage().window().maximize();
    	/*----------------------------------------------------------------------------------------*/
    	
    	// It will wait for maximum of 10secs each object
    	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	 
        //Next page Source Code Page
    	 driver.findElement(By.cssSelector("html body div#__next div.layout-wrapper.css-uinsfl div.layout-content-wrapper.MuiBox-root.css-34b9xr header.MuiPaper-root.MuiPaper-elevation.MuiPaper-elevation0.MuiAppBar-root.MuiAppBar-colorDefault.MuiAppBar-positionSticky.layout-navbar.css-1607019 div.MuiToolbar-root.MuiToolbar-gutters.MuiToolbar-regular.navbar-content-container.css-yza87a div.MuiBox-root.css-12d2mry div.actions-right.MuiBox-root.css-70qvj9 button.MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeLarge.MuiButton-containedSizeLarge.MuiButton-disableElevation.css-1hkob4v")).click();
    	 Thread.sleep(3000);
    	
    	//Application Name
         driver.findElement(By.id(":r4:")).sendKeys("TestDEMO4");
    	 Thread.sleep(3000);
    	
        //css Path of Repository: from firefox
    	  driver.findElement(By.cssSelector("html body div#__next div.layout-wrapper.css-uinsfl div.layout-content-wrapper.MuiBox-root.css-34b9xr main.layout-page-content.css-1q5gtkw div.MuiPaper-root.MuiPaper-elevation.MuiPaper-rounded.MuiPaper-elevation7.MuiCard-root.css-kfge8z div.MuiCardContent-root.css-1jhn1ig div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-5.css-1g0g456 div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.css-9b0rt form div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-5.css-1g0g456 div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-12.css-9b0rt div.MuiFormControl-root.MuiFormControl-fullWidth.css-tzsjye div.MuiInputBase-root.MuiOutlinedInput-root.MuiInputBase-colorPrimary.MuiInputBase-formControl.css-1xqx54r div.MuiSelect-select.MuiSelect-outlined.MuiInputBase-input.MuiOutlinedInput-input.css-14yaz1e")).click();
        //css path of NIKITACubeday: from firefox
          driver.findElement(By.cssSelector("html body div#menu-.MuiPopover-root.MuiMenu-root.MuiModal-root.css-1sucic7 div.MuiPaper-root.MuiMenu-paper.MuiPaper-elevation.MuiPaper-rounded.MuiPaper-elevation8.MuiPopover-paper.css-1c4kgj2 ul.MuiList-root.MuiList-padding.MuiMenu-list.css-r8u8y9 li.MuiButtonBase-root.MuiMenuItem-root.MuiMenuItem-gutters.css-1pfq95z")).click();
          Thread.sleep(2000);
      
       //page scroll down
          JavascriptExecutor js=(JavascriptExecutor )driver;
          js.executeScript("window.scrollBy(40,3000)"); //Vertical Scroll
          Thread.sleep(4000);
     
        //Branch: : from firefox
       //driver.findElement(By.className("MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-14yaz1e")).click();
        driver.findElement(By.cssSelector("#__next > div.layout-wrapper.css-uinsfl > div.layout-content-wrapper.MuiBox-root.css-34b9xr > main > div > div.MuiCardContent-root.css-1jhn1ig > div > div > form > div > div:nth-child(5) > div > div > div")).click();
        driver.findElement(By.cssSelector("#menu- > div.MuiPaper-root.MuiMenu-paper.MuiPaper-elevation.MuiPaper-rounded.MuiPaper-elevation8.MuiPopover-paper.css-1c4kgj2 > ul > li")).click();
        
       // NEXT Button:  from chrome copied selector
        driver.findElement(By.cssSelector("#__next > div.layout-wrapper.css-uinsfl > div.layout-content-wrapper.MuiBox-root.css-34b9xr > main > div > div.MuiCardContent-root.css-1jhn1ig > div > div > form > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.css-irb3p1 > button.MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeLarge.MuiButton-containedSizeLarge.MuiButton-disableElevation.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeLarge.MuiButton-containedSizeLarge.MuiButton-disableElevation.css-1hkob4v")).click();
         Thread.sleep(2000);
        
       // Next Page: Configuration: from chrome copied selector
       driver.findElement(By.cssSelector("#__next > div.layout-wrapper.css-uinsfl > div.layout-content-wrapper.MuiBox-root.css-34b9xr > main > div > div.MuiCardContent-root.css-1jhn1ig > div > div > form > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.css-irb3p1 > button.MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeLarge.MuiButton-containedSizeLarge.MuiButton-disableElevation.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeLarge.MuiButton-containedSizeLarge.MuiButton-disableElevation.css-1hkob4v")).click();
       Thread.sleep(2000);
       
       // Next Page: Review and submit: : from chrome copied selector
       driver.findElement(By.cssSelector("#__next > div.layout-wrapper.css-uinsfl > div.layout-content-wrapper.MuiBox-root.css-34b9xr > main > div > div.MuiCardContent-root.css-1jhn1ig > div > div > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.css-irb3p1 > button.MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedSuccess.MuiButton-sizeLarge.MuiButton-containedSizeLarge.MuiButton-disableElevation.MuiButton-root.MuiButton-contained.MuiButton-containedSuccess.MuiButton-sizeLarge.MuiButton-containedSizeLarge.MuiButton-disableElevation.css-d2btsl")).click();
	}
	}
   
