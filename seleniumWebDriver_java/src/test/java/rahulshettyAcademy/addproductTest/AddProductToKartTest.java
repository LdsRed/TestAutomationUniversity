package rahulshettyAcademy.addproductTest;

import org.testng.annotations.Test;
import pages.rahulShettyAcademy.CartPage;
import pages.rahulShettyAcademy.GreenKart;
import rahulshettyAcademy.base.BaseTests;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class AddProductToKartTest extends BaseTests {

    @Test
    public void addToCartTest(){
        int amountOfItemsNeeded;
        String[] products = {"Brocolli", "Cucumber", "Carrot", "Pista", "Capsicum"};
        var greenCart = greenKart;
        amountOfItemsNeeded = 5;
        greenCart.addToCart(products, amountOfItemsNeeded);
        var checkOutPage = greenCart.clickProceedButton();

        checkOutPage.inputCode("rahulshettyacademy");
        assertEquals("Error!", "Code applied ..!", checkOutPage.getText());

    }
}
