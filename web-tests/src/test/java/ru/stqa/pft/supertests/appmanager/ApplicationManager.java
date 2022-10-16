package ru.stqa.pft.supertests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.supertests.model.GroupData;

public class ApplicationManager {
    public WebDriver driver;

    public static boolean isAlertPresent (WebDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
  }

    public void init() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/nikitastrahov/Documents/GitHub/testOfTheTest/web-tests/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://stepik.org/catalog");
        Thread.sleep(3000);
        login(new GroupData("nikitastrakhov1@gmail.com", "cjhjrfctvbvbkkbvtnhjdsq"));
    }

    private void login(GroupData groupData) throws InterruptedException {
      driver.findElement(By.id("ember234")).click();
      driver.findElement(By.id("id_login_email")).sendKeys(groupData.getUsername());
      driver.findElement(By.id("id_login_password")).sendKeys(groupData.getPassword());
      driver.findElement(By.xpath("//form[@id = 'login_form']/button")).click();
      Thread.sleep(2000);
    }

    public void myEducationPage() {
        driver.findElement(By.id("ember13")).click();
    }

    public void stop() {
        driver.quit();
    }

    public void getTeachPage() {
        driver.findElement(By.linkText("Преподавание")).click();
    }
}
