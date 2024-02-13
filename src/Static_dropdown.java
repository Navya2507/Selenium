import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver", "E:\\@432\\chromedriver_win32\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();
		//Steps:
		//open the amazon page
		//Select the sign in on the home page
        //Checking the SIGN_UP_page_1 then Enter M.No,Continue
		driver.get("https://www.amazon.com");
		
		//login
//        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();        
//        driver.findElement(By.id("ap_email")).sendKeys("8639415488");
//        driver.findElement(By.cssSelector("input[type*='submit']")).click();
//        driver.findElement(By.id("ap_password")).sendKeys("baby1234");
//        driver.findElement(By.className("a-button-input")).click();
		
		
        //Static drop down
//        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
//        dropdown.selectByIndex(2);
//        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        //another way
        
        WebElement Sdropdown =driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
        
        Select dropdown = new Select(Sdropdown);        
        dropdown.selectByIndex(5);        
        System.out.println(dropdown.getFirstSelectedOption().getText()); 
        
        dropdown.selectByValue("search-alias=arts-crafts-intl-ship");
        Thread.sleep(1000);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        dropdown.selectByVisibleText("Beauty & Personal Care");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        
        
        

	}

}
