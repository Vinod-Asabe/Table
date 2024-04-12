package pkg;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void sample() {
		System.out.println("First Test Method");
	}
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\WorldLine\\Testing\\Assignment5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//To Launch any Web site in  Browser
		driver.get("https://www.google.com");
		WebElement p=driver.findElement(By.name("q"));
		p.sendKeys("IPL");
		p.submit();

	}
	
}
