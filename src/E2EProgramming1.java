import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2EProgramming1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// 1. Give me the count of links on the page.
		// 2. Count of footer section-

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");

		System.out.println(driver.findElements(By.tagName("a")).size()); // Count the number of links on the complete
																			// web page

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope by creating a new
																		// driver for web element of web page footer

		System.out.println(footerdriver.findElements(By.tagName("a")).size()); // Count the number of links only in
																				// footer of the web page

		// 3- Limiting the scope again of the web driver within the footer of the web
		// page , to drive only the first column in the footer of web page

		// Xpath created for the fist column in footer keeping the base driver to be the
		// driver of footer
		// -- //table/tbody/tr/td[1]/ul this xpath with // in front signifies the
		// starting of the footer driver and not of the whole web page

		WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size()); // Count the number of links only in the
																				// first column within the footer of web
																				// page

		// 4- click on each link in the coloumn and check if the pages are opening-
		for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);

		} // opens all the tabs
		Set<String> abc = driver.getWindowHandles();// 4
		Iterator<String> it = abc.iterator();

		// Loop to traverse/iterate until there is a next tab of web page opened in
		// window browser using the iterator class

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}

}
