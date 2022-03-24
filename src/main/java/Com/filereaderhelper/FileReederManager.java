package Com.filereaderhelper;

import java.io.IOException;

public class FileReederManager {
	
	
	private FileReederManager() {
		
	}
	
	
	
	
	public static  FileReederManager FileReederManagerfrm() {
		FileReederManager frm=new FileReederManager();
		return frm;
	}
	
	
	
	
	
	public ConfigurationReader getinstancecr() throws IOException {
		ConfigurationReader cr=new ConfigurationReader();
		return cr;
	}

}
