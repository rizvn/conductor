package app;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Riz
 */
@Config(browser = Browser.CHROME, url = "about:blank")
public class MainTest extends Locomotive{

  @Test
  public void checkSupportsTest(){
    navigateTo("https://sites.google.com/a/chromium.org/chromedriver/downloads");
    validateText("td.sites-layout-tile>div>div>div:nth-child(1)>div>b>div", "Supports Chrome v52-54");
  }

  @Test
  public void testGoogleSearch(){
    navigateTo("https://www.google.co.uk/");
    setText("input#lst-ib", "hello");
    click(By.cssSelector("button.lsb"));
    WebElement element = driver.findElement(By.partialLinkText("Hello!"));
    element.click();
  }
}
