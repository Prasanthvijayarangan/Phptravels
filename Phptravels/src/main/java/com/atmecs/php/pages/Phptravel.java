
package com.atmecs.php.pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.atmecs.php.helpers.Pageaction;
import com.atmecs.php.helpers.Validation;
import com.atmecs.php.pathallocator.Pathallocator;
import com.atmecs.php.pathallocator.ValidatePathallocator;
import com.atmecs.php.pathallocator.Validatedata;
import com.atmecs.php.testbase.Testbase;




public class Phptravel extends Testbase {
	static Pathallocator path = new Pathallocator();
	static ValidatePathallocator path1 = new ValidatePathallocator();
	static WebDriverWait wait  = new WebDriverWait(driver, 15);
	static Validatedata data = new Validatedata();
	
	@Test(priority=1)
	public static void home(WebDriver driver) throws Exception {
		path.getdata();
		Pageaction.mousehover(driver, path.getFeature(), "FEATURES");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path.getProduct())));
		Pageaction.mousehover(driver, path.getProduct(), "PRODUCT");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path.getClickhelp())));
		Pageaction.click(driver, path.getClickhelp());
		driver.switchTo().frame("chat-widget");
		//Pageaction.click(driver, path.getOption());
		Pageaction.sendkeys(driver, "//input[@name='name']", "Birds");
		Pageaction.click(driver,"//button[@aria-label=\"Minimize window\"]");
	}
	@Test(priority=2)
	public static void validatehome() throws Exception {
		path.getdata();
		path1.getvalidationdata();
		data.getvalidationdata();
		
		Validation.validateData(driver, path1.getDemoElement(),"DemoElement is Present");
		
		Validation.validateData(driver, path1.getCarModule(),"CarModule is Present");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path1.getProvider())));
		Validation.validateData(driver, path1.getProvider(), "Provider is Present");
		
		Validation.validateData(driver, path1.getHomeimage(), "Home image is Present");
		
		Validation.validateData(driver, path1.getAdminimage(), "Admin image is Present");
		
		Validation.validateData(driver, path1.getPagelogo(), "WebPage Logo is Present");
		
		List<WebElement> headers=Validation.headervalidate(driver, path1.getHeaders());
		
		Validation.textvalidate(driver, headers.get(0).getText(),data.getHeaderelement1());
		Validation.textvalidate(driver, headers.get(1).getText(),data.getHeaderelement2());
		Validation.textvalidate(driver, headers.get(2).getText(),data.getHeaderelement3());
		Validation.textvalidate(driver, headers.get(3).getText(),data.getHeaderelement4());
		Validation.textvalidate(driver, headers.get(4).getText(),data.getHeaderelement5());
		
	}

 

}
