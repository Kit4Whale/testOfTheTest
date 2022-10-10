package ru.stqa.pft.supertests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public class CreateTest {

  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "/Users/nikitastrahov/Documents/GitHub/testOfTheTest/web-tests/src/test/resources/chromedriver");
    driver = new ChromeDriver();
  }
  @AfterMethod
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void authorization() throws InterruptedException {
    driver.get("https://stepik.org/catalog");
    driver.manage().window().setSize(new Dimension(1440, 817));
    driver.findElement(By.id("ember239")).click();
    driver.findElement(By.id("id_login_email")).sendKeys("nikitastrakhov1@gmail.com");
    driver.findElement(By.id("id_login_password")).sendKeys("cjhjrfctvbvbkkbvtnhjdsq");
    driver.findElement(By.xpath("//form[@id = 'login_form']/button")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ember13")).click();
  }
}
