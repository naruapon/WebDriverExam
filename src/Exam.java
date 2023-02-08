import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Exam {

	@Test
	void testExam() {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		
		driver.findElement(By.id("vfb-5")).sendKeys("Naruapon");
		driver.findElement(By.id("vfb-7")).sendKeys("Suwanwijit");	
		
		driver.findElement(By.id("vfb-13-address")).sendKeys("205/1");
		driver.findElement(By.id("vfb-13-address-2")).sendKeys("IT Building");
		driver.findElement(By.id("vfb-13-city")).sendKeys("Muang");		
		driver.findElement(By.id("vfb-13-state")).sendKeys("Kanchanaburi");
		driver.findElement(By.id("vfb-13-zip")).sendKeys("71000");
		driver.findElement(By.id("vfb-14")).sendKeys("naruapon@gmail.com");
		driver.findElement(By.id("vfb-18")).sendKeys("14/02/2023");
		driver.findElement(By.id("vfb-18")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("vfb-19")).sendKeys("034520339");
		driver.findElement(By.id("vfb-20-0")).click();
		driver.findElement(By.id("vfb-20-1")).click();
		driver.findElement(By.id("vfb-20-2")).click();
		driver.findElement(By.id("vfb-20-3")).click();
		driver.findElement(By.id("vfb-20-4")).click();
		driver.findElement(By.id("vfb-20-5")).click();
		driver.findElement(By.id("vfb-23")).sendKeys("React Native");	
		driver.findElement(By.id("vfb-3")).sendKeys("99");	
		driver.findElement(By.id("vfb-4")).click();
		
		String result = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/div/h2")).getText();

		assertEquals("Dynamic Transaction Verification", result);
		//driver.quit();
	}

}
