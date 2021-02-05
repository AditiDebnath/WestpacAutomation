package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
 public static WebDriver driver;	
 public Properties prop;
public WebDriver initializeDriver() throws IOException
{
	//chrome
prop= new Properties();
FileInputStream fis=new FileInputStream("./src/main/java/resources/data.properties");

prop.load(fis);
String browserName=prop.getProperty("browser");
System.out.println(browserName);

if(browserName.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver", "./src/main/java/resources/drivers/chromedriver.exe");
	driver= new ChromeDriver();
}
else if (browserName.equals("firefox"))
{
	System.setProperty("webdriver.gecko.driver", "./src/main/java/resources/drivers/geckodriver.exe");
	driver= new FirefoxDriver();	
}
else if (browserName.equals("IE"))
{
	System.setProperty("webdriver.ie.driver", "./src/main/java/resources/drivers/IEDriverServer.exe");
	driver= new InternetExplorerDriver();
}
else if (browserName.equals("edge"))
{
	System.setProperty("webdriver.edge.driver", "./src/main/java/resources/drivers/msedgedriver.exe");
	driver= new InternetExplorerDriver();
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;

}
public void getScreenshot(String result) throws IOException
{
	File scrn=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(scrn,new File("./screenshots/"+result+"screenshot.png"));
	
	
}
}
