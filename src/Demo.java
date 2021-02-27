import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException{
	 System.setProperty("webdriver.chrome.driver", "//Users//sadansar//eclipse-workspace//Java Demo//Library//chromedriver");
	 WebDriver driver = new ChromeDriver();
	
	 driver.navigate().to("https://www.nykaa.com/giftcard/list?ptype=giftcard");

	  driver.manage().window().maximize();

	  driver.findElement(By.xpath("//button[contains(.,\'SEND\')]")).click();

	  driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("Recipent Name");

	  driver.findElement(By.xpath("//input[@placeholder=\"Recipient’s Phone or Email\"]")).sendKeys("Recipient@test.com");

	  driver.findElement(By.xpath("//button[text()=\"250\"]")).click();

	  driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("Test Name");

	  driver.findElement(By.xpath("//input[@placeholder=\"Email ID\"]")).sendKeys("9999999999");

	  driver.findElement(By.xpath("//button[contains(text(),\"PAY\")]")).click(); 
	 
//	 driver.get("https://www.spicejet.com/");
//	 Thread.sleep(2000L);
//	 driver.findElement(By.id("divpaxinfo")).click();
//	 Thread.sleep(2000L);
//	 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//	 Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
//	 s.selectByValue("3");
//	 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	 
//	 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//	 driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
//	 Thread.sleep(2000L);
//	 driver.findElement(By.xpath("(//a[@text='Hyderabad (HYD)'])[2]")).click();
	 //driver.close();
	}

}
