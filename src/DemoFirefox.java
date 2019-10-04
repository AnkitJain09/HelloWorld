import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoFirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// gecko driver needed for firefox browser
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Selenium Udemy\\chromedriver_win32\\geckodriver.exe"); WebDriver driver
		 * = new FirefoxDriver(); driver.get("http://google.com");
		 * System.out.println(driver.getTitle());
		 */

		// for IE , MicrosoftWebDriver.exe needed
		/*
		 * System.setProperty("webdriver.ie.driver",
		 * "C:\\Selenium Udemy\\MicrosoftWebDriver.exe"); WebDriver driver = new
		 * InternetExplorerDriver(); driver.get("http://google.com");
		 * System.out.println(driver.getTitle());
		 */

		// ******** PAYTM Prepaid, Postpaid radio button selection **********

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//input[@id='radio1']")).click();
		// driver.findElement(By.id("radio1")).click();
		// driver.findElement((By.cssSelector("input#radio1"))).click();

		driver.findElement(By.xpath("//*[text()='Postpaid']")).click();
		System.out.println("Postpaid service type selected");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Prepaid']")).click();
		System.out.println("Prepaid service type selected");
		Thread.sleep(3000);
		/*
		 * List<WebElement> radio_serviceType=
		 * driver.findElements(By.name("serviceType"));
		 * 
		 * boolean bValue = false; boolean clickableValue = false; bValue =
		 * radio_serviceType.get(0).isSelected(); clickableValue =
		 * radio_serviceType.get(1).isEnabled();
		 * 
		 * System.out.println(bValue); System.out.println(clickableValue);
		 * 
		 * 
		 * if(bValue == true){ radio_serviceType.get(1).click(); }else {
		 * radio_serviceType.get(0).click(); }
		 * 
		 * //*[@id="app"]/div/div[3]/div/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/
		 * label/i
		 * 
		 * if(driver.findElement(By.cssSelector("label._1oun")).isEnabled()) {
		 * //driver.findElement(By.cssSelector("label._1oun")).click();
		 * driver.findElement(By.xpath("//*[text()='Postpaid']")).click();
		 * 
		 * }
		 */
		driver.close();

	}

}
