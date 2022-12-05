package theinternetwebsite.ui.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import theinternetwebsite.ui.UITest;
import theinternetwebsite.ui.pageobjects.FloatingMenuPage;

public class FloatingMenuTest extends UITest {

    public FloatingMenuTest() { }

    @Test(description = "Scrolls down the page and the menu is still there")
    public void scrollTest() {
        FloatingMenuPage floatingMenuPage = new FloatingMenuPage(this);

        // Validate page loaded
        Assert.assertTrue(floatingMenuPage.isPageOpen(), "Page not open");

        // Move
        String initialPosition = floatingMenuPage.getMenuPosition();
        floatingMenuPage.scrollToBottom();
        String finalPosition = floatingMenuPage.getMenuPosition();

        // Validate menu behaviour
        Assert.assertNotEquals(initialPosition, finalPosition, "Menu position didn't change");
        Assert.assertTrue(floatingMenuPage.validateMenuVisibility(), "Menu not showing");
    }
}