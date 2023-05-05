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
public class ElementsTest {
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
  public void elements() {
    driver.get("https://demoqa.com/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.cssSelector(".card:nth-child(1) svg")).click();
    driver.findElement(By.cssSelector(".show #item-0 > .text")).click();
    driver.findElement(By.cssSelector(".show #item-1 > .text")).click();
    driver.findElement(By.cssSelector(".rct-title")).click();
    driver.findElement(By.cssSelector(".show #item-2 > .text")).click();
    driver.findElement(By.id("item-3")).click();
    driver.findElement(By.cssSelector("#delete-record-3 path")).click();
    driver.findElement(By.cssSelector(".show #item-4 > .text")).click();
    driver.findElement(By.id("rightClickBtn")).click();
    driver.findElement(By.id("D4GJz")).click();
    driver.findElement(By.id("doubleClickBtn")).click();
    driver.findElement(By.cssSelector(".show #item-5 > .text")).click();
    driver.findElement(By.id("no-content")).click();
    driver.findElement(By.cssSelector(".show #item-6 > .text")).click();
    driver.findElement(By.linkText("Click Here for Valid Link")).click();
    js.executeScript("window.scrollTo(0,99.83999633789062)");
    driver.findElement(By.cssSelector(".card:nth-child(1) svg")).click();
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.id("item-7")).click();
    js.executeScript("window.scrollTo(0,0.19211816787719727)");
    driver.findElement(By.cssSelector(".col-12:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".show #item-8 > .text")).click();
    driver.findElement(By.id("colorChange")).click();
  }
}
