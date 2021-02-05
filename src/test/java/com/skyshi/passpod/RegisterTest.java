package com.skyshi.passpod;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Register;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class RegisterTest {
    WebDriver driver = Utils.getDriver();
    Register register = new Register(driver);

    public RegisterTest() throws InterruptedException, IOException {
    }

    //register with valid data
    @Test
    public void RegisterWithValidData() throws InterruptedException {
        Utils.openWebsite("https://passpod.com/id/register");
        Utils.maximizeWindow();
        register.inputFirstName("Almas");
        register.inputLastName("Aqmarina");
        register.inputEmail("almasaqmarina@gmail.com");
        register.inputPassword("Aqmarina18@");
        register.inputConfirmPassword("Aqmarina18@");
        register.clickCheckboxTnc();
        register.submitRegister();
        Utils.closeWebsite();
    }
}
