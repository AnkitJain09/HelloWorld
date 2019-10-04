import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Udemy\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		System.out.println("before Switching");
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText());
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		
		Set<String>ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println("After switching to child");
		System.out.println(driver.findElement(By.xpath("/html/body/div/h3")).getText());
		driver.switchTo().window(parentid);
		System.out.println("After Switching back to parent");
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText());
		

	}

}




//Rahul Shetty's solution
/*
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {

public static void main(String[] args) {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://the-internet.herokuapp.com/");
driver.findElement(By.linkText("Multiple Windows")).click();
driver.findElement(By.cssSelector("a[href*='windows']")).click();
Set<String> abc=driver.getWindowHandles();
Iterator<String> it=abc.iterator();
String parentWindow=it.next();
driver.switchTo().window(it.next());
System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
driver.switchTo().window(parentWindow);
System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

}
}

*/