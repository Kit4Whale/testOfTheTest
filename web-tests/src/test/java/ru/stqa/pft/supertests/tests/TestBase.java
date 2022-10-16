package ru.stqa.pft.supertests.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.supertests.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws InterruptedException {
        app.init();
    }

    @AfterMethod
  public void tearDown() {
        app.stop();
    }

}
