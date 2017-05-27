package homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AllHomePageElements {
@Test
	public void  homepageelement()
	{
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("http://store.demoqa.com/");
WebElement logo=driver.findElement(By.id("logo"));
String data=logo.getText();
String data1="ToolsQA2";
Assert.assertEquals(data, data1);
System.out.println(data);
	}

}
