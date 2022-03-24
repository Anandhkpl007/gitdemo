package Com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Element_loginPage {
	
	public static WebDriver driver;
	
	
	public Element_loginPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberofroom() {
		return numberofroom;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getcheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	@FindBy(id="username")
	private WebElement username;

	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement loginbtn;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement numberofroom;
	
	@FindBy(id="datepick_in")
	private WebElement checkindate;
	
	@FindBy(id="datepick_out")
	private WebElement checkoutdate;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement searchbtn;
	
	// select hotel
	
	

	public WebElement getHotelbtn() {
		return hotelbtn;
	}

	public WebElement getContiune() {
		return contiune;
	}

	public WebElement getFirdtname() {
		return firdtname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcardno() {
		return creditcardno;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcmonth() {
		return ccmonth;
	}

	public WebElement getCcyear() {
		return ccyear;
	}

	public WebElement getCcvno() {
		return ccvno;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
	@FindBy(id="radiobutton_0")
	private  WebElement hotelbtn;

	@FindBy(id="continue")
	 private WebElement contiune;
	
	@FindBy(id="first_name")
	private WebElement firdtname;
	
	@FindBy (id="last_name")
	private WebElement lastname;
	
	@FindBy (id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement  creditcardno;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	@FindBy(id ="cc_exp_month")
	private WebElement ccmonth;
	
	@FindBy (id="cc_exp_year")
	private WebElement ccyear;
	
	@FindBy (id="cc_cvv")
	private WebElement ccvno;
	
	@FindBy(id="book_now")
	private WebElement booknow;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
