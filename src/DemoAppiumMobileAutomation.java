import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class DemoAppiumMobileAutomation {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		File f = new File("src");
		File fs = new File(f, "API Demos for Android_v1.9.0_apkpure.com.apk");

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "AnkitPixelEmulator");
		dc.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		// AndroidDriver ad = new AndroidDriver(connectiontoserverlink, capabilities);
		AndroidDriver<AndroidElement> ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);

		// AndroidUIAutomator

		// C:/Users/ankij/AppData/Local/Android/Sdk/tools/bin/UIAutomatorviewer - run it
		// only after opening your mobile emulator

		// rahulonlinetutor@gmail.com

	}

}
