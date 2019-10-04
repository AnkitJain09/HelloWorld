import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create driver object for Chrome browser
		
		//We  will strictly implement methods of WebDriver interface
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource()); // get the page source of the page opened in browser
		
		driver.get("http://yahoo.com");
		driver.navigate().back();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().forward();
		
		//driver.close(); //close current browser you are in focus
		
		//driver.quit(); //closes all the browser opened by selenium script
		
	}

}
