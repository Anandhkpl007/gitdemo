package Com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.cucumber.listener.Reporter;
import Com.adacitin_baaseclass.BaseClass;
import io.cucumber.junit.CucumberOptions;

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Com\\adactin\\feature",glue="Com\\adactin\\stepdefination",
monochrome=true, plugin= {"html:adactin/adactin report.html","pretty","json:adactin/adaticreport.json",
		"com.cucumber.listener.ExtentCucumberFormatter:adactinreport/extentreport.html"
})

public class RunnerClass {
	
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() {
		//driver=BaseClass.browser("chrome");
		


	}
	@AfterClass
	public static  void tearDown() {
		
		//driver.close();
		

	}
	
	

}
