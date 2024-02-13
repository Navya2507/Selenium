package Udemy_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_practise {

	public static void main(String[] args) {
		
		System.setProperty("webdriver","E:\\@432\\chromedriver_win32\\chromedriver_win32.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com"); //URL in the browser
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
        int i=2;
        while(i<5) {
            driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
            i++;
        }
        System.out.println(driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]/div[1]")).getText());
        
	}

}
