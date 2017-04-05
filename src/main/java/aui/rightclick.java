package aui;

import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.websocket.common.AcceptHash;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 ChromeDriver driver= new ChromeDriver();
	 driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	 
	 WebElement rightclickme=driver.findElementByXPath("//div[@class='document']//span");
	 Actions builder= new Actions(driver);	
	 builder.contextClick(rightclickme).build().perform();
	 
	 WebElement clickEdit=driver.findElementByXPath("//ul[@class='context-menu-list context-menu-root']//li[1]");
	 builder.click(clickEdit).build().perform();
	 Thread.sleep(6000);
	 driver.switchTo().alert().accept();
	 System.out.println("success");
	 driver.close();
	 
	
	}
}
