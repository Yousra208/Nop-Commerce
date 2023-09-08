package testcases;

import javafx.scene.text.Text;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static testcases.TC01_Registeration.*;
import static testcases.TC01_Registeration.PASSWORD;
import static testcases.TC13_BillingAddress.*;

public class TC14_ShippingMethod extends Test_Base {

    @Test
    public void ShippingMethod_P() throws InterruptedException {
        new P01_Registration(driver).openRegistrationPage().addFirst_name(First_Name).addLast_name(Last_Name).addBirth_day().addBirth_month().addBirth_year().addEmail(EMAIL).addPassword(PASSWORD).addConfirm_password(PASSWORD).clickRegisterBtn();
        new P02_LoginPage(driver).cLickonloginPage().addUserEmail(EMAIL).addUserPassword(PASSWORD).ClickLoginBtn();
        new P11_AddToCart(driver).AddFirstProductToCart().OpenCartPage();
        new P12_Checkout(driver).CheckTermsCheckbox().ClickCheckOutButton();
        new P13_BillingAddress(driver).addAddress1(address).addCompany(company).addCountry().addCity(city).addPostalCode(postalCode).addPhoneNumber(phoneNumber);
        new P13_BillingAddress(driver).clickContinuButton();
        new P14_ShippingMethod(driver).addShippingMethod().clickContinueShippingButton();

        Assert.assertTrue(new P14_ShippingMethod(driver).shippingMethodSuccess());

    }

}
