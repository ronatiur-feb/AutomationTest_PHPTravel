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
public class ToursTestTest {
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
  public void toursTest() {
    driver.get("https://www.phptravels.net/tours");
    driver.manage().window().setSize(new Dimension(1382, 754));
    {
      WebElement element = driver.findElement(By.id("select2-tours_city-container"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".select2-search__field"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector("body")).click();
    driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("India");
    driver.findElement(By.cssSelector(".ladda-label")).click();
    driver.findElement(By.cssSelector(".focus-visible")).click();
    driver.findElement(By.cssSelector("li:nth-child(3) .custom-control-label")).click();
    driver.findElement(By.cssSelector("li:nth-child(4) .custom-control-label")).click();
    driver.findElement(By.cssSelector("li:nth-child(5) .custom-control-label")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("#private-three-day-tour-to-petra-unesco-world-heritage-site .ladda-label"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector("#private-three-day-tour-to-petra-unesco-world-heritage-site .ladda-label")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("#private-three-day-tour-to-petra-unesco-world-heritage-site .ladda-label"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.linkText("Read More")).click();
    driver.findElement(By.id("childs")).click();
    {
      WebElement dropdown = driver.findElement(By.id("childs"));
      dropdown.findElement(By.xpath("//option[. = '1']")).click();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".effect"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".effect")).click();
    driver.findElement(By.name("firstname_1")).click();
    driver.findElement(By.name("firstname_1")).sendKeys("Ronatiur");
    driver.findElement(By.name("lastname_1")).click();
    driver.findElement(By.name("lastname_1")).click();
    {
      WebElement element = driver.findElement(By.name("lastname_1"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.name("lastname_1")).sendKeys("Lumban Gaol");
    driver.findElement(By.name("firstname_2")).click();
    driver.findElement(By.name("firstname_2")).sendKeys("Disnet");
    driver.findElement(By.name("lastname_2")).click();
    driver.findElement(By.name("lastname_2")).sendKeys("Okey");
    driver.findElement(By.id("gateway_bank-transfer")).click();
    {
      WebElement element = driver.findElement(By.id("booking"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("booking")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("body")).click();
  }
}
