package theinternetwebsite.ui.testcases;

import java.util.List;
import org.testng.Assert;
import theinternetwebsite.ui.UITest;
import theinternetwebsite.ui.pageobjects.DropdownPage;
import org.testng.annotations.Test;

public class DropdownTest extends UITest {

    public DropdownTest() { }

    @Test(description="Dropdown options can be selected")
    public void selectAllOptions() {
        DropdownPage dropdownPage = new DropdownPage(this);
        List<String> options = dropdownPage.getDropdownOptions();

        // Validate page loaded
        Assert.assertTrue(dropdownPage.isPageOpen(), "Page not open");

        // Validate selectable options
        for (String option : options) {
            dropdownPage.setDropdownOption(option);
            Assert.assertTrue(dropdownPage.isDropdownOptionSelected(option), "Dropdown option not selected");
        }
    }
}