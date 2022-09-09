package stepdefinitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.bdd.magicbricks.factory.DriverFactory;
import com.bdd.magicbricks.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppliacationHooks {
	private DriverFactory driverfactory;
	private WebDriver driver;
	private ConfigReader configreader;
	Properties prop;
	
	@Before(order=0)
	public void getproperty() throws IOException {
		configreader=new ConfigReader();
		prop=configreader.init_prop();
	}
	
	@Before(order=1)
	public void launchbrowser() {
		String browserName = prop.getProperty("browser");
		driverfactory=new DriverFactory();
		driver=driverfactory.init_driver(browserName);
	}
	
	@After(order=0)
	public void quitbrowser() {
		driver.quit();
	}

}
