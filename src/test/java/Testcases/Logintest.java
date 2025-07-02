package Testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logintest {

	public static void main(String[] args) throws InterruptedException, IOException {
ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	//By ex=	By.xpath("//input[contains(@id,'ail')]");
	driver.get("https://testautomationpractice.blogspot.com/");
	
	//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	//WebElement r=driver.findElement(By.id("textarea"));
	

	TakesScreenshot s=(TakesScreenshot)driver;
	File sourc=s.getScreenshotAs(OutputType.FILE);
	File target=new File(System.getProperty("user.dir")+"\\Screenshot\\main.png");
	FileUtils.copyFile(sourc, target);
	
//	return System.getProperty("user.dir")+"\\Screenshot\\main.png";
	}
}
