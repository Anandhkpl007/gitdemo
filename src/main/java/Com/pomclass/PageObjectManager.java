package Com.pomclass;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public static WebDriver driver;
	

	


	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}





	public Element_loginPage loginpage() {
		
		Element_loginPage h=new Element_loginPage(driver);
		return h;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
