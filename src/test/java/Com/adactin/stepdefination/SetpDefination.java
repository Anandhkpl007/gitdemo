package Com.adactin.stepdefination;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Com.adacitin_baaseclass.BaseClass;
import Com.filereaderhelper.FileReederManager;
import Com.pomclass.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SetpDefination extends BaseClass {
	public static WebDriver driver=BaseClass.browser("chrome");
	PageObjectManager pom=new PageObjectManager(driver);
	
	@Given("^User Application Lanuch$")
	public void user_Application_Lanuch() throws Throwable {
		url(FileReederManager.FileReederManagerfrm().getinstancecr().geturl());
	}

	@When("^User Enter The  Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
	  input(pom.loginpage().getUsername(), FileReederManager.FileReederManagerfrm().getinstancecr().getusername() );
	}

	@When("^user Enter The Passwword In Password Field$")
	public void user_Enter_The_Passwword_In_Password_Field() throws Throwable {
	  input(pom.loginpage().getPassword(), FileReederManager.FileReederManagerfrm().getinstancecr().getpassword());
	}

	@io.cucumber.java.en.Then("^User Click The Login Button And NavigateTo The Search Hotel Page$")
	public void user_Click_The_Login_Button_And_NavigateTo_The_Search_Hotel_Page() throws Throwable {
	   clickButton(pom.loginpage().getLoginbtn());
	}

	@When("^User Select The Loction Field$")
	public void user_Select_The_Loction_Field() throws Throwable {
	    dropDown(pom.loginpage().getLocation(), "value", "New York");
	}

	@When("^User Select The Hotels Field$")
	public void user_Select_The_Hotels_Field() throws Throwable {
		
		dropDown(pom.loginpage().getHotels(), "text", "Hotel Sunshine");
	  
	}

	@When("^user Select The Room Type Field$")
	public void user_Select_The_Room_Type_Field() throws Throwable {
	  dropDown(pom.loginpage().getRoomType(), "index", "2");
	}

	@When("^User Select The Number of Rooms Field$")
	public void user_Select_The_Number_of_Rooms_Field() throws Throwable {
	   dropDown(pom.loginpage().getNumberofroom(), "value", "3");
	}

	@When("^User Select The Check In Date Field$")
	public void user_Select_The_Check_In_Date_Field() throws Throwable {
	   clear(pom.loginpage().getCheckindate());
	   input(pom.loginpage().getCheckindate(),FileReederManager.FileReederManagerfrm().getinstancecr().getcheckindate());
	   
	}

	@When("^User Select The Check Out Date Field$")
	public void user_Select_The_Check_Out_Date_Field() throws Throwable {
		clear(pom.loginpage().getcheckoutdate());
	    input(pom.loginpage().getcheckoutdate(), FileReederManager.FileReederManagerfrm().getinstancecr().checkoutdate());
	}

	@When("^User Select The Adult Per Room Field$")
	public void user_Select_The_Adult_Per_Room_Field() throws Throwable {
	    dropDown(pom.loginpage().getAdultroom(), "text", "3 - Three");
	}

	@When("^User Select The Children Per Room Field$")
	public void user_Select_The_Children_Per_Room_Field() throws Throwable {
	    dropDown(pom.loginpage().getChildroom(), "index","3");
	}
	

	@Then("^User Click The Search Button And Navigate To The Select Hotel Page$")
	public void user_Click_The_Search_Button_And_Navigate_To_The_Select_Hotel_Page() throws Throwable {
	 clickButton(pom.loginpage().getSearchbtn()); 
	}
	
	@When("User Select The Hotel Field")
	public void user_select_the_hotel_field() {
		clickButton(pom.loginpage().getHotelbtn());
	   
	}

	@Then("User Click The Continue Button And Navigate To The Booking Hotel Page")
	public void user_click_the_continue_button_and_navigate_to_the_booking_hotel_page() {
	   clickButton(pom.loginpage().getContiune());
	}

	@When("User Enter The Firstname Field")
	public void user_enter_the_firstname_field() throws IOException {
	   input(pom.loginpage().getFirdtname(), FileReederManager.FileReederManagerfrm().getinstancecr().firstname());
	}

	@When("User Enter The Lastname Field")
	public void user_enter_the_lastname_field() throws IOException {
     input(pom.loginpage().getLastname(),FileReederManager.FileReederManagerfrm().getinstancecr().lastname());

	}

	@When("User Enter The Billing Address Field")
	public void user_enter_the_billing_address_field() throws IOException {
	   input(pom.loginpage().getAddress(),FileReederManager.FileReederManagerfrm().getinstancecr().address());
	}

	@When("User Enter The Credit Card Number Field")
	public void user_enter_the_credit_card_number_field() throws IOException {
	    input(pom.loginpage().getCreditcardno(), FileReederManager.FileReederManagerfrm().getinstancecr().ccno());
	}

	@When("User Select The Credit Card Type Field")
	public void user_select_the_credit_card_type_field() {
	   dropDown(pom.loginpage().getCctype(),"value", "VISA");
	}

	@When("User Select The Exprie Date Field")
	public void user_select_the_exprie_date_field() {
	    dropDown(pom.loginpage().getCcmonth(),"index","8");
	}
	
	@When("User Select The Exprie Year Field")
	public void user_select_the_exprie_year_field() {
	   dropDown(pom.loginpage().getCcyear(), "value", "2019");
	}

	@When("User Enter The CVV Number Field")
	public void user_enter_the_cvv_number_field() throws IOException  {
	   input(pom.loginpage().getCcvno(), FileReederManager.FileReederManagerfrm().getinstancecr().cvvno());
	}

	@Then("User Click The Book Now Button And Navigate To The  Booking Confirm Page")
	public void user_click_the_book_now_button_and_navigate_to_the_booking_confirm_page() throws IOException {
	   clickButton(pom.loginpage().getBooknow());
	   Screenshot();
	}
	

	
	

	


	
	
	
	
	
	
	
	

}
