package Task10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guvisignin {

	WebDriver driver;
	public Guvisignin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='name']")
	WebElement username;
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	@FindBy(xpath="//input[@class='form-control password-err']")
	WebElement password;
	@FindBy(xpath="//input[@id='mobileNumber']")
	WebElement number;
	@FindBy(xpath="//a[@id='signup-btn']")
	WebElement signupbtn;
	
	public void setname(String name) {
		username.sendKeys(name);
	}
	public void setemail(String mail) {
		email.sendKeys(mail);
	}
	public void setpwd(String pwd) {
		password.sendKeys(pwd);	
	}
	public void setno(String no) {
		number.sendKeys(no);
		
	}
	public void clicksignup() {
		signupbtn.click();
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement loginmail;
	
	@FindBy(id="password")
	WebElement loginpwd;
	
	@FindBy(className="login-btn")
	WebElement loginbtn;
	
	public void setLmail(String lmail) {
		loginmail.sendKeys(lmail);
	}
	public void setLpwd(String lpwd){
		loginpwd.sendKeys(lpwd);
		
	}
	public void clicklogin() {
		loginbtn.click();
	}
		
	}
	
