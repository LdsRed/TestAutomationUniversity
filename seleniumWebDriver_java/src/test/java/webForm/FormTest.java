package webForm;

import formSubmit.FormBase;
import org.testng.annotations.Test;
import pages.formypages.WebForm;

public class FormTest extends FormBase {

    @Test
    public void formTest() {
        WebForm formWeb = formHomePage.clickWebForm();
        formWeb.fillForm("erik", "larcher", "qc analyst");
        formWeb.selectYearsOfExeprience("0-1");
        formWeb.submitForm();

    }
}
