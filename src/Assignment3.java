import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		//driver.findElement(By.xpath("//*[@id='content']/a[2]")).click();
		//second method
		driver.findElement(By.cssSelector("a[href*='loadAjax']")).click();
		
		WebDriverWait d = new WebDriverWait(driver,20);
		//d.until(ExpectedConditions.textToBePresentInElementValue(driver.findElement(By.id("results")).getText(), "Process completed!  This response has been loaded via the Ajax request directly from the web server, without reoading this page."));
		
		d.until(ExpectedConditions.presenceOfElementLocated(By.id("results")));
		String text = driver.findElement(By.id("results")).getText();
		System.out.println(text);

	}

}







//Rahul Shetty's solution


/*
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) {

// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.cssSelector("a[href*='loadAjax']")).click();
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.elementToBeClickable(By.id("results")));
		System.out.println(driver.findElement(By.id("results")).getText());
		// System.out.println(
		// driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());

	}
}

*/