package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBaseForGrid {

	public static String BaseUrl = "https://www.lidl.de/";
	public static String UrlHub = "http://localhost:4444/wd/hub";
	
	protected ThreadLocal<RemoteWebDriver> driver= null;
	
	@BeforeClass
	@Parameters(value = {"browser"})
	public void setUp(@Optional("chrome") String browser) throws MalformedURLException {
		driver = new ThreadLocal<>();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", browser);
		driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),caps));
		//driver.set(new RemoteWebDriver(new URL ("UrlHub"), caps));
		getDriver().navigate().to(BaseUrl);
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		getDriver().findElement(By.className("cookie-alert-extended-button")).click();
		
	}
	
	public WebDriver getDriver() {
		
		return driver.get();
	}
	
	
	@AfterClass
	public void stopDriver() {
		
		getDriver().quit();
		driver.remove();
	}
	
	
}
