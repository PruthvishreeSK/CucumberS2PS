package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {

	WebDriver driver;
	
	@Given("open tricentis page in chrome")
	public void open_tricentis_page_in_chrome() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
	}

	@When("click on login link")
	public void click_on_login_link() throws InterruptedException {
	    Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	}

	@Then("Enter details and login")
	public void enter_details_and_login() throws InterruptedException {
	   
		Thread.sleep(5000);
		driver.findElement(By.name("Email")).sendKeys("Itest@test.com");
	   driver.findElement(By.name("Password")).sendKeys("Itest@test");
	   driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
}
