package tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import objectrepository.HomepagePF;

public class oneCase {

	@Test
	public void Ebay() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MyPC\\Documents\\selpro\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://in.ebay.com/");

		driver.findElement(By.xpath("//input[@label='Search for anything']")).sendKeys("shoes");

		Select s = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));

		s.selectByVisibleText("Sporting Goods");

		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		 
		HomepagePF hp = new HomepagePF(driver);
		hp.shoeName(driver);
		System.out.println("---------------");
		hp.productsFromFirstPage(driver);
		System.out.println("---------------");
		hp.scroll(driver);
		hp.pfap(driver);

	}

}
