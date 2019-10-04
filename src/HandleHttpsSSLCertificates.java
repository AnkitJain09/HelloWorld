import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.apache.commons.exec.util.*;

public class HandleHttpsSSLCertificates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SSl certificates

		// Desired capabilities is a class that helps us to define specific capabilities
		// that our browser should posses
		// general chrome profile

		DesiredCapabilities ch = DesiredCapabilities.chrome();

		// providing below capability of accepting the certificates that comes while
		// launching few websites, these may be insecure or ssl certificates.

		// ch.acceptInsecureCerts();
		// alternate method for above statement
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		// now in order to pass these general chrome capabilitie to our local browser
		// that would be opened by selenium script we need to use
		// class ChromeOptions

		// Belongs to your local browser
		ChromeOptions co = new ChromeOptions();
		co.merge(ch); // providing the capabilities to the local browser

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Udemy\\chromedriver_win32\\chromedriver.exe");

		// now in order to make sure that our web driver possess the same capabilities
		// we need to pass the reference of chromeOptions class to driver
		// so that the browser launched with driver, have the same capabilities.

		WebDriver driver = new ChromeDriver(co);
		
		

	}

}
