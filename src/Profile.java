import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Profile {

	public static void main(String[] args) throws InterruptedException {
	     	//System.setProperty("WebDriver.gecko.driver", "C:\\Users\\NikitaHiwale\\geckodriver.exe");
		   // WebDriver driver = new FirefoxDriver();
		 
		 System.setProperty("WebDriver.chrome.driver", "Users\\NikitaHiwale\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver(); 
		
	    driver.get("https://console.dev.initializ.ai/login/");
		driver.findElement(By.id("user-email-input")).sendKeys("nhiwale@initializ.io");
  	    driver.findElement(By.id("auth-login-v2-password")).sendKeys("Pass@123");
     	driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div/form/button")).click();
  	    Thread.sleep(4000);
  	    driver.manage().window().maximize();
  	    Thread.sleep(4000);
 //profile Icon click
		driver.findElement(By.cssSelector("#__next > div.layout-wrapper.css-uinsfl > div.layout-content-wrapper.MuiBox-root.css-34b9xr > header > div > div > div.actions-right.MuiBox-root.css-70qvj9 > span > div > img")).click();
		Thread.sleep(4000);
// MY Profile in dropdown and click
		driver.findElement(By.cssSelector("body > div.MuiPopover-root.MuiMenu-root.MuiModal-root.css-1aa1mv6 > div.MuiPaper-root.MuiMenu-paper.MuiPaper-elevation.MuiPaper-rounded.MuiPaper-elevation8.MuiPopover-paper.css-1c4kgj2 > ul > li:nth-child(3) > div")).click();
        
		JavascriptExecutor js=(JavascriptExecutor )driver;
        js.executeScript("window.scrollBy(40,3000)"); //Vertical Scroll
         
        Thread.sleep(6000); // need more time to load than rest pages
       
 // Edit Profile
        driver.findElement(By.cssSelector("#__next > div.layout-wrapper.css-uinsfl > div.layout-content-wrapper.MuiBox-root.css-34b9xr > main > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-rounded.MuiPaper-elevation7.MuiCard-root.css-1mrwhpn > div > div > button")).click();
        Thread.sleep(4000); 
    // First name
             
            driver.findElement(By.id(":r4:")).sendKeys("NIKITA");
              //driver.findElement(By.cssSelector("#\\:r4\\:")).sendKeys("NIKITA");    
              //driver.findElement(By.xpath("//input[@id=':r4:']")).sendKeys("NIKITA");// related XPATH I hv created its correct but nt working
// Last Name
             //driver.findElement(By.className("MuiInputBase-input MuiOutlinedInput-input css-qrixlr")).click();
	      driver.findElement(By.cssSelector("#\\:r5\\:")).sendKeys("H.");
	      Thread.sleep(2000);
// phone number
	        // driver.findElement(By.cssSelector("#\\:r8\\:")).sendKeys("9819638935");
	      driver.findElement(By.id(":r8:")).sendKeys("9819638935");
	      Thread.sleep(2000);
//Address
	      driver.findElement(By.id(":r9:")).sendKeys("WhiteField");  
	      Thread.sleep(2000);
// State
	      driver.findElement(By.id(":ra:")).sendKeys("Karnataka");  
	      Thread.sleep(4000);
// Country
	     // driver.findElement(By.cssSelector("#menu- > div.MuiPaper-root.MuiMenu-paper.MuiPaper-elevation.MuiPaper-rounded.MuiPaper-elevation8.MuiPopover-paper.css-1c4kgj2 > ul > li:nth-child(101)")).click();
	     // Select drpCountry = new Select(driver.findElement(By.id("country")));
	     //    drpCountry.selectByVisibleText("INDIA");
	        
	      //Thread.sleep(2000);
	      
	      By CountryLocator = By.xpath("//*[@id="country"]");
	      WebElement countryElement = driver.findElement(CountryLocator);
	      Select countryDropdown = new Select(countryElement);
	      String countryToSelect = "India";
	      countryDropdown.selectByVisibleText(countryToSelect); 
	     
//Zip Code
	      //driver.findElement(By.id("zipCode")).sendKeys("560066"); 
	     // driver.findElement(By.cssSelector("#zipCode")).sendKeys("560066");
	    //  Thread.sleep(2000);
// City
	     // driver.findElement(By.id(":rc:-label")).sendKeys("Banglore"); 
	      driver.findElement(By.cssSelector("#\\:rc\\:")).sendKeys("Banglore");
	      Thread.sleep(2000);
// Save Changes
	      driver.findElement(By.cssSelector("#__next > div.layout-wrapper.css-uinsfl > div.layout-content-wrapper.MuiBox-root.css-34b9xr > main > div:nth-child(2) > div > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-rounded.MuiPaper-elevation7.MuiCard-root.css-1mrwhpn > form > div.MuiCardContent-root.css-1dzn5ey > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.css-1of6guj > button.MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-disableElevation.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-disableElevation.css-1vt8mna")).click();
	      
// 
	      driver.findElement(By.cssSelector("#__next > div.layout-wrapper.css-uinsfl > div.layout-content-wrapper.MuiBox-root.css-34b9xr > header > div > div > div.actions-right.MuiBox-root.css-70qvj9 > button:nth-child(2) > svg")).click();
	}

}
