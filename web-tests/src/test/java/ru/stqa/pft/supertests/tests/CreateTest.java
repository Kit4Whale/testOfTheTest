package ru.stqa.pft.supertests.tests;

import org.testng.annotations.Test;

public class CreateTest extends TestBase {

    @Test
    public void testAuthorization() {
        app.getGroupHelper().myEducationPage();

    }

}
