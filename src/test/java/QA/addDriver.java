package QA;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class addDriver {

	static WebDriver driver;

	@Test
	public void loginpage() throws Exception {

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Thread.sleep(1000);
		driver.navigate().to("https://partnersqa1.routematic.com");

		Thread.sleep(1000);
		driver.findElement(By.id("inputEmail")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("inputEmail")).sendKeys(
				"amarendra.kumar+202@routematic.com");
		driver.findElement(By.id("inputPass")).sendKeys("Demo@123456");

		Thread.sleep(1000);
		driver.findElement(
				By.xpath(".//*[@id='login']/div/div/div/div/div[1]/div/form/div[4]/div/button"))
				.click();
		Thread.sleep(1000);

	}

	@Test(priority = 1)
	public void addDriv() throws Exception {
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[1]/app-sidebar/div[3]/div[1]/ul/li[3]/a/span"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[1]/app-sidebar/div[3]/div[1]/ul/li[3]/ul/li[1]/a/span"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[2]/div[1]/div[1]/angular2-multiselect/div/div[1]/div"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[2]/div[1]/div[1]/angular2-multiselect/div/div[2]/div[3]/ul/span/li[1]/label"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[2]/div[1]/div[1]/angular2-multiselect/div/div[1]/div/span[2]"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[2]/div[2]/div/input"))
				.sendKeys("ABC");
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[3]/div[2]/div[1]/input"))
				.sendKeys("9171771771");
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[5]/div[1]/div[1]/input"))
				.sendKeys("9171771771");
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[5]/div[2]/div[1]/input"))
				.sendKeys("9171771771");

		// driver.findElement(By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[1]/div/input")).click();
		// StringSelection ss = new
		// StringSelection("C:\\Users\\Amar\\Desktop\\1.JPG");
		// //Thread.sleep(2000);
		// Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,
		// null);
		// Thread.sleep(2000);
		// /*driver.findElement(By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[18]/label[2]/input")).click();
		// StringSelection ss1 = new
		// StringSelection("C:\\Users\\Amar\\Desktop\\1.PNG");
		// Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1,
		// null);*/
		//
		//
		// //imitate mouse events like ENTER, CTRL+C, CTRL+V
		// Robot robot = new Robot();
		// robot.setAutoDelay(1000);
		// robot.keyPress(KeyEvent.VK_ENTER);
		// robot.keyRelease(KeyEvent.VK_ENTER);
		// robot.delay(2000);
		//
		// robot.keyPress(KeyEvent.VK_CONTROL);
		// robot.keyPress(KeyEvent.VK_V);
		//
		// robot.keyRelease(KeyEvent.VK_V);
		// robot.keyRelease(KeyEvent.VK_CONTROL);
		//
		// robot.keyPress(KeyEvent.VK_ENTER);
		// robot.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[6]/div[1]/div[1]/textarea"))
				.sendKeys("abcd");
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[6]/div[2]/div/textarea"))
				.sendKeys("abcd");
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[7]/div[2]/div/input"))
				.sendKeys("1234");
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[10]/div[1]/div/input"))
				.sendKeys("123");
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[11]/div[1]/div/input"))
				.sendKeys("1234");
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[15]/div[1]/div/input"))
				.sendKeys("sadsads");
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[15]/div[2]/div/input"))
				.sendKeys("dfhjsjsd");

		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[7]/div[1]/div[1]/div/input"))
				.click();
		// driver.findElement(By.className("datepicker")).click();
		// driver.findElement(By.className("btn-light")).click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[7]/div[1]/div[1]/div/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[2]/div[5]/div"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[8]/div[1]/div[1]/div/input"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[8]/div[1]/div[1]/div/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[2]/div[5]/div"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[9]/div[1]/div[1]/div/input"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[9]/div[1]/div[1]/div/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[2]/div[5]/div"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[8]/div[2]/div/div[1]/input"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[8]/div[2]/div/div[1]/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[2]/div[5]"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[9]/div[2]/div/div[1]/input"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[9]/div[2]/div/div[1]/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[2]/div[5]"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[10]/div[2]/div/div[1]/input"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[10]/div[2]/div/div[1]/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[2]/div[5]"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[11]/div[2]/div/div[1]/input"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[11]/div[2]/div/div[1]/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[2]/div[5]"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[12]/div[1]/div/div[1]/input"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[12]/div[1]/div/div[1]/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[2]/div[5]"))
				.click();

		// All dates

		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[16]/div/div[1]/angular2-multiselect/div/div[1]/div"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[16]/div/div[1]/angular2-multiselect/div/div[2]/div[3]/ul/span/li[2]/label"))
				.click();
		driver.findElement(
				By.xpath("html/body/app-root/app-full-layout/div/div[2]/div/div/div/adddriver-app/section/div/div/div/div/div/form/div/div[16]/div/div[1]/angular2-multiselect/div/div[1]/div/span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//.[@id='locationName']")).sendKeys(
				"Hebbal");
		List<WebElement> lstGoogle = driver.findElements(By
				.xpath("html/body/div[3]"));
		Thread.sleep(1000);
		for (int i = 0; i < lstGoogle.size(); i++) {
			System.out.println(lstGoogle.get(i).getText());

			Thread.sleep(1000);
			if (lstGoogle.get(i).getText()
					.contains("Hebbal KempapuraBengaluru, Karnataka, India")) {
				lstGoogle.get(i).click();
			}
			//driver.findElement(By.xpath("//.[@class='ng-untouched ng-pristine ng-invalid']")).click();
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("window.scrollBy(0,250)", "");
			 
		}
	
		 Thread.sleep(1000);
		//driver.findElement(By.xpath("//.[@id='checkbox_check']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.xpath(".//*[@id='adddriver']/div/div/div/div/div/form/div/div[20]/label"));
      js.executeScript("arguments[0].scrollIntoView();", Element);
      Thread.sleep(5000);
      
      driver.findElement(By.xpath(".//button[@type='submit']")).click();
	

		
	
	// System.out.println("Page title is: " + driver.getTitle());
	// getScreenShot(driver);
	}
}
