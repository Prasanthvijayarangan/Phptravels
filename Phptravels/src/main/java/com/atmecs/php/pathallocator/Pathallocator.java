package com.atmecs.php.pathallocator;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.php.Standardfile.Standardfile;
import com.atmecs.php.utils.ReadLocatorsfile;

public class Pathallocator {
	Properties property;
	String Feature;
	String Product;
	String clickhelp;
	String option;
	



	
	public void getdata() throws Exception {
		property = ReadLocatorsfile.loadProperty(Standardfile.Locator_config);
		setFeature();
		setProduct();
		setClickhelp();
		setOption();
		
	}
	
	public String getClickhelp() {
		return clickhelp;
	}
	public void setClickhelp() {
		clickhelp = property.getProperty("loc.click.help");
	}
	public String getOption() {
		return option;
	}
	public void setOption() {
		option = property.getProperty("loc.button.option");
	}
	public String getFeature() {
		return Feature;
	}
	public void setFeature() {
		Feature = property.getProperty("loc.button.feature");
	}
	public String getProduct() {
		return Product;
	}
	public void setProduct() {
		Product = property.getProperty("loc.button.product");
	}


	
}
