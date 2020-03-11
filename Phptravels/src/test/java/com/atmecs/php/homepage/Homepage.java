package com.atmecs.php.homepage;



import org.testng.annotations.Test;

import com.atmecs.php.helpers.Validation;
import com.atmecs.php.pages.Phptravel;
import com.atmecs.php.pathallocator.Pathallocator;
import com.atmecs.php.pathallocator.ValidatePathallocator;
import com.atmecs.php.testbase.Testbase;

public class Homepage extends Testbase {
	Pathallocator path = new Pathallocator();
 ValidatePathallocator path1 = new ValidatePathallocator();
	@Test
	public void homePage() throws Exception {
		path.getdata();	
		Phptravel.home(driver);
		Phptravel.validatehome();
      
	}
}
