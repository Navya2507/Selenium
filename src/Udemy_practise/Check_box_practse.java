package Udemy_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Check_box_practse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver","E:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Thread.sleep(2000);
		//false
		driver.findElement(By.id("checkBoxOption1")).click();		
//		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		//count
		System.out.println("no. of checkboxes --" +driver.findElements(By.cssSelector("input[type=checkbox]")).size());
		
//Radio buttons
		driver.findElement(By.cssSelector("input[type=radio][2]")).click();
		

	}

}
