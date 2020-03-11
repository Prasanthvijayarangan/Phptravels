package com.atmecs.php.helpers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class Validation {
	public static void validateData(WebDriver driver, String path,String message) {
		boolean isDisplayed=driver.findElement(By.xpath(path)).isDisplayed();
		
		if(isDisplayed==true)
		{
			System.out.println(message);
		}
		else
		{
			System.out.println("Not Displayed");
		}
		}
	
	public static void isEnabled(WebDriver driver, String path,String message) {
		boolean enabledata=driver.findElement(By.xpath(path)).isEnabled();
		
		if(enabledata==true)
		{
			System.out.println(message);
		}
		else
		{
			System.out.println("Not Displayed");
		}
		}
	
	public static void gettextvalidate(WebDriver driver,String path,String expected) {
	String actualValue = driver.findElement(By.xpath(path)).getText();
	String expectedValue = expected;
	Assert.assertEquals(actualValue, expectedValue);
	System.out.println("actualValue :" + actualValue);
	}
	
	public static List<WebElement> headervalidate(WebDriver driver,String path) {
		List<WebElement> allHeadersOfTable1= driver.findElements(By.xpath(path));
		return allHeadersOfTable1;

	}

	public static void textvalidate(WebDriver driver,String actual, String expected) {
		// TODO Auto-generated method stub
		
		Assert.assertEquals(actual, expected);
		
	}
}
