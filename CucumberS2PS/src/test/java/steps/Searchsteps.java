package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchsteps {

	WebDriver driver;
	
	@Given("Open chrome and tricentis page")
	public void open_chrome_and_tricentis_page() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
	}

	@When("Enter the product to search in search box")
	public void enter_the_product_to_search_in_search_box() throws InterruptedException {
	    driver.findElement(By.id("small-searchterms")).sendKeys("shoes");
	    Thread.sleep(2000);
	}

	@Then("Click on search button")
	public void click_on_search_button() {
	    driver.findElement(By.xpath("//input[@value='Search']")).click();
	}
	
}
