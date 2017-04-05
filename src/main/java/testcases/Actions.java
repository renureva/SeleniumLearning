package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chroemdriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.gmail.com");
		Actions builder = new Actions();
		builder.keys
 
	}

}
