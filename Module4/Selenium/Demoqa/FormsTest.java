// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class FormsTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void forms() {
    driver.get("https://demoqa.com/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.cssSelector("g > path")).click();
    driver.findElement(By.cssSelector(".show #item-0")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".show .text"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("firstName")).click();
    driver.findElement(By.id("firstName")).sendKeys("k887568468555");
    driver.findElement(By.id("lastName")).sendKeys("6565654");
    driver.findElement(By.id("userEmail")).click();
    driver.findElement(By.id("userEmail")).sendKeys("kj@gli.il");
    driver.findElement(By.cssSelector(".custom-radio:nth-child(2) > .custom-control-label")).click();
    driver.findElement(By.id("userNumber")).click();
    driver.findElement(By.id("userNumber")).sendKeys("62+65265");
    driver.findElement(By.id("userNumber")).sendKeys("6854685465");
    driver.findElement(By.cssSelector("body")).click();
    driver.findElement(By.id("submit")).click();
    {
      WebElement element = driver.findElement(By.id("submit"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("closeLargeModal")).click();
  }
}
