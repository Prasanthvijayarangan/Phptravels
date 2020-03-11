package com.atmecs.php.pathallocator;

import java.util.Properties;

import com.atmecs.php.Standardfile.Standardfile;
import com.atmecs.php.utils.ReadLocatorsfile;

public class ValidatePathallocator {
	Properties property;
	String DemoElement;
	String CarModule;
	String Provider;
	String Headers;
	String Homeimage;
	String Adminimage;
	String Pagelogo;
	

	
	public void getvalidationdata() throws Exception {
		property = ReadLocatorsfile.loadProperty(Standardfile.Validation_config);
		
		setCarModule();
		setDemoElement();
		setProvider();
		setHeaders();
		setAdminimage();
		setHomeimage();
		setPagelogo();
		
		
	}
	
	public String getHomeimage() {
		return Homeimage;
	}
	public void setHomeimage() {
		Homeimage = property.getProperty("val.img.home");
	}
	public String getAdminimage() {
		return Adminimage;
	}
	public void setAdminimage() {
		Adminimage = property.getProperty("val.img.admin");
	}
	public String getPagelogo() {
		return Pagelogo;
	}
	public void setPagelogo() {
		Pagelogo = property.getProperty("val.img.logo");
	}
	public String getHeaders() {
		return Headers;
	}
	public void setHeaders() {
		Headers = property.getProperty("val.buttons.header");
	}
	public String getDemoElement() {
		return DemoElement;
	}

	public void setDemoElement() {
		DemoElement = property.getProperty("val.demo.element");
	}

	public String getCarModule() {
		return CarModule;
	}

	public void setCarModule() {
		CarModule = property.getProperty("val.button.carmodule");
	}

	public String getProvider() {
		return Provider;
	}

	public void setProvider() {
		Provider = property.getProperty("val.button.providers");
	}

}
