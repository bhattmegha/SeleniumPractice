package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class freeCrmLogin {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Downloads\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("meghabhattdehradun@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Password@1");
		driver.findElement(By.cssSelector(".ui.fluid.large.blue.submit.button")).click();
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions mouse = new Actions(driver);
		mouse.moveToElement(driver.findElement(By.cssSelector(".calendar.icon"))).build().perform();
		driver.findElement(By.cssSelector(".plus.inverted.icon")).click();
		

}
}