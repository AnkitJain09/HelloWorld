import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripPracticeDateSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");

		// *[@id="root"]/div/div[2]/div/div[2]/div[1]/div[3]

		driver.findElement(By.cssSelector("[class='fsw_inputBox dates inactiveWidget ']")).click();

		// String month =
		// driver.findElement(By.cssSelector("[class='DayPicker-Months']/div[1]
		// [class='DayPicker-Caption']/div")).getText();
		// String monthYear =
		// driver.findElement(By.xpath("//*[@class='DayPicker-Months']/div[1]/div[1]/div")).getText();
		// *[@id="root"]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div
		// System.out.println(monthYear);

		while (!driver.findElement(By.xpath("//*[@class='DayPicker-Months']/div[1]/div[1]/div")).getText()
				.contains("December 2019")) {
			// System.out.println(By.xpath("//*[@class='DayPicker-Months']/div[1]/div[1]/div")).getText());
			driver.findElement(By.cssSelector("[class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}

		int count = driver.findElements(By.className("DayPicker-Day")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("DayPicker-Day")).get(i).getText();
			if (text.equalsIgnoreCase("21")) {
				driver.findElements(By.className("DayPicker-Day")).get(i).click();
				break;
			}
		}
		System.out.println("Your choice of date selected in calendar.....Please Check.......");
	}

}
