import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Looping {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver", "E:\\@432\\chromedriver_win32\\chromedriver_win32.exe");
		
		WebDriver driver =new ChromeDriver();
		
        driver.get("https://www.amazon.in");
		
		//login
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();        
        driver.findElement(By.id("ap_email")).sendKeys("8639415488");
        driver.findElement(By.cssSelector("input[type*='submit']")).click();
        driver.findElement(By.id("ap_password")).sendKeys("baby1234");
        driver.findElement(By.className("a-button-input")).click();
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("the original donut shop regular, single-serve keurig k-cup pods");
//        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
//        Thread.sleep(3000);
//        System.out.println(driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div[2]/div[6]/span/div/div[2]/span[1]")).getText());
        
//       Looping
        //clicking the add button 
        driver.findElement(By.xpath("//*[@id=\"a-autoid-12\"]")).click();
        Thread.sleep(2000L);
        
        int i=1;
        while(i<6) {
              driver.findElement(By.xpath("//*[@id=\"a-autoid-12\"]")).click();
              i++;
        }
        
        WebElement slider = driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol"));
        slider.findElement(By.xpath("//*[@id=\"a-autoid-2\"]/span/input")).click();
        
//        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/div/div/div[2]/div/div[2]/div/ol/li[19]/div/div/div[7]/div[2]/div/div/div[2]/img[2]")).click();
//        Thread.sleep(2000);
//        System.out.println(driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div[2]/div[6]/span/div/div[2]/span[1]")).getText());


        
	}

}
