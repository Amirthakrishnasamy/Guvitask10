package Task10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
	
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
			String date="22";
			String month="October";
			String year="2025";
			while(true) {
				String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				if(currentMonth.equals(month)&&currentYear.equals(year)){
				break;	
				}
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
			
			List<WebElement> allDates=driver.
					findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
			for(WebElement dates:allDates) {
				if(dates.getText().equals(date)) {
				dates.click();
				break;
				}
			}
			String selectedDate=driver.findElement(By.xpath("//input[@class='hasDatepicker']")).getAttribute("value");
			System.out.println("The Selected date is:"+selectedDate);
			driver.quit();

	}

}
