package ru.stqa.pft.supertests.tests;

import org.testng.annotations.Test;

public class TeachingPageTest extends TestBase {

    @Test
    public void testTeachingPage() {

        app.getGroupHelper().getTeachPage();
    }
}
