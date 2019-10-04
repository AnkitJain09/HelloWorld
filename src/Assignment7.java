import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		int rowCount = driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr")).size();
		int columnCount = driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr[1]/th")).size();
		
		System.out.println("Total row count in table is : "+rowCount);
		
		System.out.println("Total column count in table is : "+columnCount);
		
		//*[@id="product"]/tbody/tr[1]
		
		System.out.println();
		System.out.println("Content of 2nd row in the table : ");
		System.out.println();
		
		for(int i=0;i<columnCount;i++) {
			System.out.println(driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr[3]/td")).get(i).getText());
		}
		
		

	}

}


//Rahul Shetty's solution to this problem

/*

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3 {

public static void main(String[] args) {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://qaclickacademy.com/practice.php");
WebElement table=driver.findElement(By.id("product"));
System.out.println(table.findElements(By.tagName("tr")).size());
System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
System.out.println(secondrow.get(0).getText());
System.out.println(secondrow.get(1).getText());
System.out.println(secondrow.get(2).getText());
}
}

*/