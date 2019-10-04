import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*select any checkbox
		grab the label of checkbox
		select an option from dropdown, and this option should come from label grabbed in above step
		enter grabbed labeled text in edit box
		click Alert
		verify if text grabbed in step 2 is present in pop up message*/
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		String selectedCheckBox = null;
		
		//List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		//System.out.println("The number of checkboxes on web page is : " +checkboxes.size());
		
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		/*
		for(int i=0;i<checkboxes.size();i++) {
			driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
			if(driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).isSelected()) {
				selectedCheckBox=driver.findElements(By.xpath("//input[@type='checkbox'] text()")).get(i).getText();
			}
			System.out.println(selectedCheckBox);
			//s.selectByVisibleText(selectedCheckBox);
				
		}*/
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]/input")).click();
		selectedCheckBox = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();
		s.selectByVisibleText(selectedCheckBox);
		//*[@id="checkbox-example"]/fieldset/label[1]/text()
		driver.findElement(By.id("name")).sendKeys(selectedCheckBox);
		driver.findElement(By.id("alertbtn")).click();
		String text=  driver.switchTo().alert().getText();
		if(text.contains(selectedCheckBox))
		{

			System.out.println("Alert message success");
		}
		else
			System.out.println("Something wrong with execution");
		
		

	}

}






// Rahul Shetty's solution 

/*

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

public static void main(String[] args) {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://qaclickacademy.com/practice.php");
driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
Select s=new Select(dropdown);
s.selectByVisibleText(opt);
driver.findElement(By.name("enter-name")).sendKeys(opt);
driver.findElement(By.id("alertbtn")).click();
String text=  driver.switchTo().alert().getText();
if(text.contains(opt))
{

	System.out.println("Alert message success");
}
else
	System.out.println("Something wrong with execution");
}
//  System.out.println( driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());   

}

*/