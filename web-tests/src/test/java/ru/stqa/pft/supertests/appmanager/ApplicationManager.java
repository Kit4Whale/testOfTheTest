package ru.stqa.pft.supertests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.supertests.model.GroupData;

public class ApplicationManager {

    public WebDriver driver;
    private  GroupHelper groupHelper;
    private SessionHelper sessionHelper;

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
        groupHelper = new GroupHelper(driver);
        sessionHelper = new SessionHelper(driver);
        Thread.sleep(3000);
        sessionHelper.login(new GroupData("nikitastrakhov1@gmail.com", "cjhjrfctvbvbkkbvtnhjdsq"));
    }

    public void stop() {
        driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
}
