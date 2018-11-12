package adminDeals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralClass {

	public static void main(String[] args) {
		
		
		 //System.setProperty("webdriver.chrome.driver",path of executable file "Chromedriver.exe")
        System.setProperty("webdriver.chrome.driver", "D:/SeleniumEnvironment/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://auctionsoftwaremarketplace.com:7075/");
        System.out.println("Selenium Webdriver Script in Chrome browser ");
        
        
        driver.close();
        

	}
	
	
}
