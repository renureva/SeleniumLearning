package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
				
		driver.findElementByLinkText("Droppable").click();
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement draggable=driver.findElementById("draggable");
		WebElement droppable=driver.findElementById("droppable");
		
		Actions builder =new Actions(driver);
		builder.dragAndDrop(draggable, droppable).build().perform();
		System.out.println("success");
		driver.close();
;
	}

}
