package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class DropDownTest extends BaseTests {


    @Test
    public void testSelectedOption(){
        var dropDownPage = homePage.clickDropDown();

        String option = "Option 1";

        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue("Option not selected", selectedOptions.contains(option));

    }
}
