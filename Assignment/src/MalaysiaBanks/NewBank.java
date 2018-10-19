package MalaysiaBanks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class NewBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new SafariDriver();
		
		driver.get("https://www.theswiftcodes.com/malaysia/");
		driver.manage().window().maximize();
		
	 driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		 
		//To locate table.
	    	WebElement mytable = driver.findElement(By.tagName("table"));
	    	WebElement mytable1 = driver.findElement(By.tagName("table"));
	    	List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
	    	List < WebElement > rows_table1 = mytable1.findElements(By.tagName("tr"));
	    	
		    //To calculate no of rows In table.
		    	int rows_count = rows_table.size();
		    	
		    	
		    //Loop will execute till the last row of table.
		    	for (int row = 0; row < rows_count; row++) 
		    	{
		    List < WebElement > Columns_row = rows_table.get(row).findElements(By.xpath("/html/body/div[3]/div[1]/div/div[6]/table/tbody/tr/td[2]"));
		    List < WebElement > Columns_row1 = rows_table1.get(row).findElements(By.xpath("/html/body/div[3]/div[1]/div/div[6]/table/tbody/tr/td[5]/a"));
		    
		    String rowtext = Columns_row.get(row).getText();
		    String rowtext1 = Columns_row1.get(row).getText();
	    	
	    	System.out.println("Bank Name : "+rowtext);
	    	System.out.println("Swift Code : "+rowtext1);
		    	}
	    	
		    
	   
	}
}


