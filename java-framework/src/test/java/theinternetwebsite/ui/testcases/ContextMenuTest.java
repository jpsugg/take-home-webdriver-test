package theinternetwebsite.ui.testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import theinternetwebsite.ui.UITest;
import theinternetwebsite.ui.pageobjects.ContextMenuPage;

public class ContextMenuTest extends UITest {

    public ContextMenuTest() {
        System.setProperty("java.awt.headless", "false");
    }

    @Test(description="Expected alert popup opens on right click over box")
    public void triggerPopupOnContextClick() {

        if (this.getCurrentBrowser().equals("remote-chrome")) {
            throw new SkipException("Skipping this test case; Github Actions doesn't support it yet"); }

        String expectedPopupText = "You selected a context menu";
        ContextMenuPage contextMenuPage = new ContextMenuPage(this);

        // Validate page loaded
        Assert.assertTrue(contextMenuPage.isPageOpen(), "Page not open");

        // Validate popup opens
        contextMenuPage.rightClickBox();
        String actualPopupText = contextMenuPage.getAlertPopupText();
        contextMenuPage.closeAlertPopup();
        Assert.assertEquals(actualPopupText, expectedPopupText);
    }
}