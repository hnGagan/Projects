package objectrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePF {

	WebDriver driver;

	public HomepagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='s-item__link']")
	List<WebElement> products;

	public void shoeName(WebDriver driver)

	{

		for (int i = 0; i < products.size(); i++) {
			if (i == 9) {
				String name = products.get(i).getText();

				System.out.println(name);

				break;

			}
		}
	}

	public void productsFromFirstPage(WebDriver driver) {

		for (int i = 0; i < products.size(); i++) {

			String name = products.get(i).getText();
			System.out.println(name);

		}
	}

	public void scroll(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//ol[@class='x-pagination__ol']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);

	}

	public void pfap(WebDriver driver) {

		WebElement table = driver.findElement(By.xpath("//nav[@class='x-pagination x-pagination--align-left']"));
		
	    List<WebElement> table_row = table.findElements(By.cssSelector("ol.x-pagination__ol"));

		int row_count = table_row.size();
		for (int row = 0; row < row_count; row++) {
			List<WebElement> Columns_row = table_row.get(row).findElements(By.cssSelector("li.x-pagination__li"));

			int column_count = Columns_row.size();
			for (int column = 0; column < column_count; column++) {
				for (int i = 0; i < products.size(); i++) {

					String name = products.get(i).getText();
					System.out.println(name);

				}
				
			}
		}
		
		

	}

	
	
}
