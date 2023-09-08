package rahulshettyAcademy.addproductTest;

import org.testng.annotations.Test;
import pages.rahulShettyAcademy.GreenKart;
import rahulshettyAcademy.base.BaseTests;

import java.util.ArrayList;

public class AddProductToKartTest extends BaseTests {

    @Test
    public void addToCartTest(){
        int amountOfItemsNeeded;
        String[] products = {"Brocolli", "Cucumber", "Carrot"};
        var greenCart = greenKart;
        amountOfItemsNeeded = 4;
        greenCart.addToCart(products, amountOfItemsNeeded);
    }
}
