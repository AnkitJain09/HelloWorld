import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssignmentFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).isSelected());
		
		
		/*
		 *Rahul Shetty's code : 
		 * 
		 * driver.findElement(By.id("checkBoxOption1")).click();
			System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print True
			driver.findElement(By.id("checkBoxOption1")).click();
			System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print false
		 */
		
		
		
		//Count the number of checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("The number of checkboxes on web page is : " +checkboxes.size());

		
		/*
		 * Rahul Shetty code to compare : 
		 * 
		 * driver.findElements(By.cssSelector("input[value='checkbox']")).size();
		 */
		
	}

}
