package Task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target);
		action.build().perform();
		String bgcolor=target.getCssValue("background");
		if(bgcolor.contains("255, 250, 144")) {
			System.out.println("Drag and operation is successfull and the bgcolor is yellow");
		}
		if(target.getText().equalsIgnoreCase("Dropped!")) {
			System.out.println("Drag and operation is successfull and the text is changed");
		}
		else
			System.out.println("Operation is not successful");		

}
	
}

