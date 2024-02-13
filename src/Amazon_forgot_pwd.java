import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Amazon_forgot_pwd {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver", "E:\\@432\\chromedriver_win32\\chromedriver_win32.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();        
        driver.findElement(By.id("ap_email")).sendKeys("fayago7475@docwl.com");
        driver.findElement(By.cssSelector("input[type*='submit']")).click();
        driver.findElement(By.id("auth-fpp-link-bottom")).click();
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.name("code")).sendKeys("277365");
        Thread.sleep(5000);
        driver.findElement(By.className("a-button-input")).click();
        driver.findElement(By.id("ap_fpp_password")).sendKeys("baby1234");
        driver.findElement(By.id("ap_fpp_password_check")).sendKeys("baby1234");
        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.className("a-truncate-cut")).getText());
       // <scope>test</scope> removed on the pom.xml because of asserts
        Assert.assertEquals(driver.findElement(By.className("a-truncate-cut")).getText(), "Keep shopping for");

	}

}
