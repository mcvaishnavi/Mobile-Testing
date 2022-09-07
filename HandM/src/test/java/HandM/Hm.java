package HandM;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Hm {

	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		try {
			openHm();
			region();
			operation();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
			System.out.println(e.getMessage());

			e.printStackTrace();
		}
		
		finally {
			
			System.out.println("HandM closed");
			driver.close();
		}

	}

		

		private static void openHm() throws MalformedURLException, InterruptedException{
			
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability("deviceName", "GM1901");
			cap.setCapability("udid", "b9f0697d");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "11");
			
			cap.setCapability("appPackage", "com.hm.goe");
			cap.setCapability("appActivity", "com.hm.goe.app.home.HomeActivity");
			cap.setCapability("automationName", "UiAutomator2");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, cap);
			 
			System.out.println("Application Started...");
			
		}
		
		public static void region() throws InterruptedException {
			
			MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView");
			el1.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//android.widget.Button[@text='NO THANKS']")).click();
			//MobileElement el2 = (MobileElement) driver.findElementById("android:id/button2");
			//el2.click();


		}
		public static void operation() throws Exception {
			
			MobileElement el5 = (MobileElement) driver.findElementById("com.hm.goe:id/teaser_area_child_container");
			el5.click();
			Thread.sleep(3000);
			MobileElement el6 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"SAVE AS FAVORITE\"])[1]");
			el6.click();
			Thread.sleep(3000);
			MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ImageView");
			el7.click();
			Thread.sleep(3000);
			MobileElement el8 = (MobileElement) driver.findElementById("com.hm.goe:id/selectSizeContainer");
			el8.click();
			Thread.sleep(3000);
			MobileElement el9 = (MobileElement) driver.findElementByXPath("(//android.widget.TextView[@content-desc=\"pdp_fav_select_size_item\"])[2]");
			el9.click();
			Thread.sleep(3000);
			MobileElement el10 = (MobileElement) driver.findElementById("com.hm.goe:id/buttonText");
			el10.click();
			Thread.sleep(3000);
			MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.View");
			el11.click();

			

		}
			
}
			
			


			
		

		

