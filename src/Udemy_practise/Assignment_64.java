package Udemy_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_64 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver","E:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//name
		driver.findElement(By.name("name")).sendKeys("Navya");
		driver.findElement(By.name("email")).sendKeys("navya132@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345678");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.xpath("//*[@id=\"exampleFormControlSelect1\"]/option[2]")).click();
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		/*
		 * driver.findElement(By.id("exampleCheck1")).click();

WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));

Select abc = new Select(dropdown);

abc.selectByVisibleText("Female");

driver.findElement(By.id("inlineRadio1")).click();

driver.findElement(By.name("bday")).sendKeys("02/02/1992");

driver.findElement(By.cssSelector(".btn-success")).click();
		*/

	}

}
