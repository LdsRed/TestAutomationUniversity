package rahulshettyAcademy.addproductTest;

import org.testng.annotations.Test;
import pages.rahulShettyAcademy.GreenKart;
import rahulshettyAcademy.base.BaseTests;

import java.util.ArrayList;

public class AddProductToKartTest extends BaseTests {

    @Test
    public void addToCartTest(){
        int amountOfItemsNeeded;
<<<<<<< HEAD
        String[] products = {"Brocolli", "Cucumber", "Carrot", "Pista", "Capsicum"};
=======
        String[] products = {"Brocolli", "Cucumber", "Carrot"};
>>>>>>> 7739b21f30b5dee43957a925bbf43fa74e8983b4
        var greenCart = greenKart;
        amountOfItemsNeeded = 4;
        greenCart.addToCart(products, amountOfItemsNeeded);
    }
}
