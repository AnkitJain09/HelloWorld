import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsAndSelectorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("This is first code");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgot Password?")).click();
		*/
		
		//Alpha numeric IDs may vary on every refresh, so preferr to use xpath or CSS
		//Confirm the link text with anchor "a" tag
		//every object may not have id, classname, name - Xpath or CSS preferred.
		//Class name attribute should not have spaces, if having, then do not use it. - Compound classes cannot be accepted.
		
		//login to salesforce.com
		
		/*
		driver.get("http://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("test");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("Login")).click();
		*/
		
		//XPATH and CSS Selector
		//XPATH - need to change the double quotes returned in xpath to single quotes when using it in java
		//dont copy the xpath starting from /html - ignore it not reliable, switch browser to get the correct one
		
		/*
		driver.get("http://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("test");
		driver.findElement(By.id("password")).sendKeys("123456");
		//driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
		
		//Customized xpath and css selectors
		
		/*
		driver.get("http://login.salesforce.com");
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("myown xpath"); // Customized xpath
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("my text"); // Customized css selector
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456"); // Customized xpath
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("123456"); //Customized css selector
		//driver.findElement(By.xpath("//input[@value='Log In']")).click(); // Customized xpath
		driver.findElement(By.cssSelector("input[value='Log In']")).click(); //Customized css selector
		*/
		
		
		
		/*
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click(); // locating element using "text" attribute 
		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click(); // locating sibling element 
		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role")); //locating parent of child element
		*/
		
		
		
		driver.get("http://login.salesforce.com");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("testing");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("1123456");
		//driver.findElement(By.cssSelector("[id='Login']")).click();
		driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();  // shortcut way of using cssselector xpath
		System.out.println("Your automation script ran successfully");
		
		

	}

}
