package Com.filereaderhelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties p;
	
	public ConfigurationReader() throws IOException{
		
		File f=new File("E:\\java class and selenium\\adactin\\src\\main\\java\\Com\\configuration\\Propertyfile.properties");
		
		FileInputStream fis=new FileInputStream(f);
		
		p=new Properties();
		
		p.load(fis);
		
		
	}
	
	public String geturl() {
		String geturl = p.getProperty("url");
		return geturl;
	}
	
	public String getusername() {
		String username = p.getProperty("username");
		return username;
		
	}
	public String getpassword() {
		String password = p.getProperty("password");
		return password;
	}
	
	public String getcheckindate() {
		String checkindate = p.getProperty("checkindate");
		return checkindate;
	}
	
	public String checkoutdate() {
		String checkoutdate = p.getProperty("checkoutdate");
		return checkoutdate;
	}
	
	public String firstname() {
	  String firstname = p.getProperty("firstname");
	 return firstname;
	 
	}
	
	public String lastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
		
	}
	
	public String address() {
		String address = p.getProperty("address");
		return address;
	}
	
	public String ccno() {
		String ccno = p.getProperty("ccno");
		return ccno;
	}
	
	public String cvvno() {
		String cvvno = p.getProperty("cvvno");
		return cvvno;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
