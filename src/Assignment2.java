import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		 * cleartrip leave from and to select today's date on depart on select adult - 2
		 * click on children - 1 click on link enter preferred airline name click on
		 * search get the error message grab the error message and print
		 */

		// Create a instance of ChromeOptions class
		ChromeOptions options = new ChromeOptions();
		// Add chrome switch to disable notification - "**--disable-notifications**"
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		// driver.switchTo().alert().accept();

		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();

		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByIndex(2);

		Select s1 = new Select(driver.findElement(By.id("Childrens")));
		s1.selectByIndex(1);

		driver.findElement(By.xpath("//*[@id='MoreOptionsLink']")).click();// *[@id="MoreOptionsLink"]
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Go Air");

		driver.findElement(By.id("SearchBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement((By.id("homeErrorMessage"))).getText());
		driver.close();

	}

}

/*
 * 
 * //Rahul Shetty's solution to same problemt
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.Keys; import
 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.ui.Select;
 * 
 * public class Assignment {
 * 
 * public static void main(String[] args) {
 * 
 * // TODO Auto-generated method stub
 * System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
 * WebDriver driver=new ChromeDriver(); driver.get("http://www.cleartrip.com/");
 * //calendar driver.findElement(By.id("DepartDate")).click();
 * driver.findElement(By.
 * cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click(
 * ); //DD1 WebElement adult=driver.findElement(By.id("Adults")); Select s =new
 * Select(adult); s.selectByIndex(2); //DD2 WebElement
 * ch=driver.findElement(By.id("Childrens")); Select s1 =new Select(ch);
 * s1.selectByIndex(2);
 * driver.findElement(By.xpath("//a[@title='More search options']")).click();
 * driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
 * driver.findElement(By.id("SearchBtn")).click(); //validate error message
 * System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
 * } }
 * 
 */