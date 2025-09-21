package Test;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import Task10.Guvisignin;

public class guviSigntest {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.guvi.in/");
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		testsignin();
		driver.findElement(By.xpath("//a[@id='laterBtn']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String header="GUVI | Sign Up";
		String header1=driver.getTitle();
		System.out.println(header1);
		if (header1.equals(header)) {
			System.out.println("signup is success");
		}
		else {
			
			System.out.println("signup is not  success");
		}
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.guvi.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@id='login-btn']")).click();
		login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String title="GUVI | Login";
		String title1=driver.getTitle();
		System.out.println(title1);
		if (title1.equals(title)) {
			System.out.println("Login is success");
		}
		else {
			
			System.out.println("Login is not  success");
		}
		driver.quit();
	}
	static void testsignin() {
		Guvisignin mtd=new Guvisignin(driver);
		mtd.setname("Rudranila");
		mtd.setemail("amirthav123@gmail.com");
		mtd.setpwd("Ruvanya@123");
		mtd.setno("8248038284");
		mtd.clicksignup();	
		
}
	static void login() {
		Guvisignin mtd1=new Guvisignin(driver);
		mtd1.setLmail("amirthavk10@gmail.com");
		mtd1.setLpwd("Ruvanya@123");
		mtd1.clicklogin();
		
	}

}
