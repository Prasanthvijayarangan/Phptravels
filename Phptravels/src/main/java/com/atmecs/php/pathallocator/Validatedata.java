package com.atmecs.php.pathallocator;

import java.util.Properties;

import com.atmecs.php.Standardfile.Standardfile;
import com.atmecs.php.utils.ReadLocatorsfile;

public class Validatedata {
	Properties property;
	String Headerelement1;
	String Headerelement2;
	String Headerelement3;
	String Headerelement4;
	String Headerelement5;


	

	public void getvalidationdata() throws Exception {
		property = ReadLocatorsfile.loadProperty(Standardfile.Validation_config1);
		setHeaderelement1();
		setHeaderelement2();
		setHeaderelement3();
		setHeaderelement4();
		setHeaderelement5();
	}
	
	
	public String getHeaderelement1() {
		return Headerelement1;
	}


	public void setHeaderelement1() {
		Headerelement1 = property.getProperty("val.data.header1");
	}


	public String getHeaderelement2() {
		return Headerelement2;
	}


	public void setHeaderelement2() {
		Headerelement2 = property.getProperty("val.data.header2");
	}


	public String getHeaderelement3() {
		return Headerelement3;
	}


	public void setHeaderelement3() {
		Headerelement3 = property.getProperty("val.data.header3");
	}


	public String getHeaderelement4() {
		return Headerelement4;
	}


	public void setHeaderelement4() {
		Headerelement4 = property.getProperty("val.data.header4");
	}


	public String getHeaderelement5() {
		return Headerelement5;
	}


	public void setHeaderelement5() {
		Headerelement5 = property.getProperty("val.data.header5");;
	}


}
