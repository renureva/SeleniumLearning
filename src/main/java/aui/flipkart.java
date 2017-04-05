package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		Actions builder =new Actions(driver);
		WebElement electronics=driver.findElementByXPath("//span[contains(text(),'Electronics')]");
		builder.moveToElement(electronics).click().build().perform();
		Thread.sleep(3000);
		WebElement samsung=driver.findElementByXPath("//span[contains(text(),'Samsung')]");
		builder.click(samsung).build().perform();
		//System.out.println("samsung clicked successful");
		Thread.sleep(4000);
		String title=driver.getTitle();
		if(title.startsWith("Samsung")){
			System.out.println("starts with samsung success");
		}
		else
		{System.out.println("failed");
		}



		driver.close();


	}

}
