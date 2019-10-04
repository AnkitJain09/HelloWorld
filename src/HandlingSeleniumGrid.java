import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingSeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		// Automated- chrome,firefox,ie,safari

		DesiredCapabilities dc = new DesiredCapabilities(); // mandatory in order to define what browser and what OS is
															// needed on remote node machines.
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		// dc.se

		// Webdriver driver=new ChromeDriver();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc); 
		//the Client URL is passed over in this command, which is returned when you register your HUB machine
		// RemoteWebDriver mandatory to tell selenium to hit the remote node machine
		driver.get("http://rediff.com");
		//

	}

}
