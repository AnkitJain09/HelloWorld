import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.qaclickacademy.com/practice.php");

		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		Thread.sleep(2000); // need to be given as if not given the output is different. need to know why it
							// is like this ???????

		// driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementById(\"autocomplete\").value";
		String text = (String) js.executeScript(script);
		System.out.println(text);

		int i = 0;
		while (!text.equalsIgnoreCase("United States")) {
			i++;
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if (i > 10)
				break;
		}
		if (i > 10) {
			System.out.println("Your text is not selected as its not present in options");
		} else
			System.out.println("Your text is selected and present in input box");

	}

}

//Rahul Shetty's solution :

/*
 * import org.openqa.selenium.By; import org.openqa.selenium.Keys; import
 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.Select; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * public class Assignment {
 * 
 * public static void main(String[] args) throws InterruptedException {
 * 
 * // TODO Auto-generated method stub
 * System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
 * WebDriver driver = new ChromeDriver();
 * driver.get("http://qaclickacademy.com/practice.php");
 * driver.findElement(By.id("autocomplete")).sendKeys("ind");
 * Thread.sleep(2000);
 * driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
 * driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
 * System.out.println(driver.findElement(By.id("autocomplete")).getAttribute(
 * "value")); } }
 * 
 */
