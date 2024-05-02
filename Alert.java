package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//Deepesh//Downloads//chromedriver_win32 (4)//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("confirmButton")).click();
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("promtButton")).click();
		driver.switchTo().alert().sendKeys("test");
		driver.switchTo().alert().accept();
		
		

	}

}
