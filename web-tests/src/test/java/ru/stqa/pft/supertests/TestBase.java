package ru.stqa.pft.supertests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "/Users/nikitastrahov/Documents/GitHub/testOfTheTest/web-tests/src/test/resources/chromedriver");
      driver = new ChromeDriver();
      driver.get("https://stepik.org/catalog");
      Thread.sleep(3000);
      login("nikitastrakhov1@gmail.com", "cjhjrfctvbvbkkbvtnhjdsq");
    }

    private void login(String username, String password) throws InterruptedException {
      driver.findElement(By.id("ember234")).click();
      driver.findElement(By.id("id_login_email")).sendKeys(username);
      driver.findElement(By.id("id_login_password")).sendKeys(password);
      driver.findElement(By.xpath("//form[@id = 'login_form']/button")).click();
      Thread.sleep(2000);
    }

    protected void myEducationPage() {
        driver.findElement(By.id("ember13")).click();
    }

    @AfterMethod
  public void tearDown() {
    driver.quit();
  }

  public static boolean isAlertPresent (WebDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
  }

    protected void getTeachPage() {
        driver.findElement(By.linkText("Преподавание")).click();
    }
}
