import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Maven_1_Login{

	public static void main(String[] args) throws InterruptedException{
		
		
		System.setProperty("webdriver", "E:\\@432\\chromedriver_win32\\chromedriver_win32.exe");
		WebDriver driver = new ChromeDriver();
		//Steps:
		//open the amazon page
		//Select the sign in on the home page
        //Checking the SIGN_UP_page_1 then Enter M.No,Continue
		driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();        
        driver.findElement(By.id("ap_email")).sendKeys("8639415488");
        driver.findElement(By.cssSelector("input[type*='submit']")).click();
        driver.findElement(By.id("ap_password")).sendKeys("baby1234");
        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.className("a-truncate-cut")).getText());
       // <scope>test</scope> removed on the pom.xml because of asserts
        Assert.assertEquals(driver.findElement(By.className("a-truncate-cut")).getText(), "Keep shopping for");
        
//        try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();			
//		}
        
//        Thread.sleep(3000);
//  
//        driver.close();

	}

}
