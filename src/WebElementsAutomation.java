import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


// TestNG is one of the testing framework

public class WebElementsAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Handling Static Dropdown
		/*
		driver.get("http://spicejet.com");
		Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByValue("INR");
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByVisibleText("USD");
		Thread.sleep(1000);
		System.out.println("your all selections were made successfully");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int i =1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();
		*/
		
		//Handling dynamic Dropdown
		
		
		driver.get("http://spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='JDH'])[2]")).click();
		//driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTXT'] //a[@value='JDH']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//driver.close();	
		
		
		
		//Handling Autosuggestive dropdowns.
		/*
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.id("fromCity")).sendKeys("DEL");
		Thread.sleep(1000);
		driver.findElement(By.id("fromCity")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("fromCity")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.id("toCity")).sendKeys("PUN");
		Thread.sleep(1000);
		driver.findElement(By.id("toCity")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("toCity")).sendKeys(Keys.ENTER);
		*/
		
		
		//Handling RadioButtons
		/*
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//input[@value='Milk']")).click();
		int count =driver.findElements(By.xpath("//input[@name='group1']")).size();
		for(int i=0;i<count;i++)
		{
		//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
		if(text.equals("Cheese"))
		{
		driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
		}
		*/
		
		//Handling Checkboxes
		/*
		driver.get("https://www.spicejet.com");
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		
		//Count number of Checkboxes on web page , by looking for a common locator in all the checkboxes webelement attributes.
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		*/
		
		//Handling Assertions 
		/*
		//driver.get("https://www.spicejet.com");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		*/
		
		//Handling Calendar UI in travel websites
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
		//Validate UI elements are disabled or enabled
		
		
		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
		System.out.println("its enabled");
		Assert.assertTrue(true);
		}
		else
		{
		Assert.assertTrue(false);
		}
	}
}
