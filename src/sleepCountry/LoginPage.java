package sleepCountry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Downloads\\Browser drivers\\Updated driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:welcome2021@p7185168c2tst-store.occa.ocs.oraclecloud.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div.search-section")).click();
		driver.findElement(By.id("CC-headerWidget-Search")).sendKeys("mattress");
		driver.findElement(By.id("searchSubmit")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[@class='cc-item-title']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#CC-prodDetails-addToCart")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("cart")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("CC-orderSummary-checkout")).click();

	}

}
