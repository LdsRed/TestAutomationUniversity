package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownUsingJscript extends BaseTests {

    @Test
    public void testAddMultipleAttributeDropdown() {
       var dropDownPage = homePage.clickDropdownPage();
       dropDownPage.addMultipleAttribute();

       var optionsToSelect = List.of("Option 1", "Option 2");
       optionsToSelect.forEach(dropDownPage::selectFromDropdown);

       var selectedOptions = dropDownPage.getSelectedOptions();
       assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
       assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected selected items");
    }
}
