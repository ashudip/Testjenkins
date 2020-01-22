package testpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DesireCapabilityClass {
  @Test
  public void f() throws MalformedURLException {
	  DesiredCapabilities dc = new DesiredCapabilities().chrome();
  	URL url = new URL("http://localhost:4444/wd/hub");
  	RemoteWebDriver driver = new RemoteWebDriver(url,dc);
  	 driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
  	System.out.println(driver.getTitle());
  	driver.close();
	  
	  
	  
  }
}
