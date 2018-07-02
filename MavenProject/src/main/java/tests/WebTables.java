package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Empower_Yourself_Assignment/Selenium_Assignment/Filpkart/driver_latest_versions/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//asd
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		// To find total number of rows present in WebTable
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr//td[1]"));
		
		// To find total number of Columns present in WebTable
		List<WebElement> col=driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
		
//		List<WebElement> allData=driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
		
		String ExpString="Laughing Bacchus Winecellars";
		for(int i=1;i<rows.size();i++){
			
			//String s = allData.get(i).getText();
			String s=driver.findElement(By.xpath("//table[@id='customers']//tr["+(i+1)+"]/td[1]")).getText();
			if(s.equals(ExpString)){
				for(int j=1;j<col.size();j++){
					String data=driver.findElement(By.xpath("//table[@id='customers']//tr["+(i+1)+"]/td["+(j+1)+"]")).getText();
					System.out.print(data+" , ");
				}
			}
			
		}
		
		 /*
		 List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='customers']//td"));
		int count = alldata.size();
		System.out.println("Total Data in webtable : "+count);
		String str= "Ernst Handel";
		for(int i=0;i<count;i++)
		{
			String s=alldata.get(i).getText();
			//String s=data.getText();
			if(s.equals(str))
			{
				String SC=alldata.get(i+1).getText();
				String TC=alldata.get(i+2).getText();
				
				System.out.println("Contact : "+SC+"  Country : "+TC);
			}
		} 

		*/
		
	}

}
