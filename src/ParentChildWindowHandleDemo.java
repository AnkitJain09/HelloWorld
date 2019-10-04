import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildWindowHandleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[1]/a")).click();
		System.out.println(driver.getTitle());
		Set<String>ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println("After Switching");
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println("Switching back to parent");
		System.out.println(driver.getTitle());
		
	}

}
