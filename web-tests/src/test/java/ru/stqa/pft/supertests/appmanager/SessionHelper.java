package ru.stqa.pft.supertests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.supertests.model.GroupData;

public class SessionHelper {
    private WebDriver driver;

    public SessionHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void login(GroupData groupData) throws InterruptedException {
        driver.findElement(By.id("ember367")).click();
        driver.findElement(By.id("id_login_email")).sendKeys(groupData.getUsername());
        driver.findElement(By.id("id_login_password")).sendKeys(groupData.getPassword());
        driver.findElement(By.xpath("//form[@id = 'login_form']/button")).click();
        Thread.sleep(2000);
    }
}
