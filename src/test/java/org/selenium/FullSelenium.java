package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Register.html");

		Thread.sleep(5000);

		// // Navigation commands
		// driver.navigate().to("https://www.facebook.com/");
		// driver.navigate().refresh();
		// driver.navigate().back();
		// driver.navigate().forward();

		//		
		//		 List<WebElement> w =driver.findElements(By.xpath("//input[@type='checkbox']"));
		//		 for(int i=0;i<w.size();i++) {
		//			 w.get(i).click();
		//			 
	}

	//		driver.get("http://ironspider.ca/forms/dropdowns.htm");
	//		WebElement w = driver.findElement(By.name("coffee"));
	//		Select s = new Select(w);
	//		List<WebElement> o = s.getOptions();
	//		for (WebElement x : o) {
	//
	//			System.out.println(x.getText());
}

driver.get("http://toolsqa.com/automation-practice-table/");

List<WebElement> tRows = driver.findElements(By.tagName("tr"));
for(
		WebElement rows:tRows){
	List<WebElement> tData = driver.findElements(By.tagName("td"));
	for(WebElement data:tData){
		System.out.println(data.getText()); 

	}

}
