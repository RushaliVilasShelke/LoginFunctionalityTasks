package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class testbase {

	public String baseURL="https://app.germanyiscalling.com/common/signup/";
	public String Loginurl="https://app.germanyiscalling.com/common/login/";
	public String Name="Rupali Shelke";
	public String Username="rupali19shelke@gmal.com";
	public String Password="Vianshu@1996";
	public String invalidUsername="rupali$shelke@gmal.com";
	public String emptyUsername=" ";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome127version\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
   /* @AfterClass
    public void tearDown() {
    	
    	driver.quit();
    }*/
}
