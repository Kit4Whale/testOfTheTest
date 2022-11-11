package ru.stqa.pft.supertests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper {
    private WebDriver driver;

    public GroupHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void myEducationPage() {
        driver.findElement(By.id("ember13")).click();
    }

    public void getTeachPage() {
        driver.findElement(By.linkText("Преподавание")).click();
    }
}
