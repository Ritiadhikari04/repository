package Amazon;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class GetList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "Chromedriver");

	WebDriver driver = new SafariDriver();
				
		driver.get("https://www.amazon.in");

		List<WebElement> allimages = driver.findElements(By.tagName("a"));
		for (WebElement imagefromlist : allimages)
		{
			String ImageUrl= imagefromlist.getAttribute("href");
		    System.out.println(ImageUrl);
		}
		
		driver.close();
	}

}
