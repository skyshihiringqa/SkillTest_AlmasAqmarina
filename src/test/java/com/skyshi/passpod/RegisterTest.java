package com.skyshi.passpod;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Login;
import com.sekolahqa.pages.Register;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class RegisterTest {
    WebDriver driver = Utils.getDriver();
    Login login = new Login(driver);
    Register register = new Register(driver);

    private String emailRegistered = "Email already registered";
    private String passwordNotSame = "Password doesn't match";

    public RegisterTest() throws InterruptedException, IOException {
    }

    //register with valid data
    @Test
    public void RegisterWithValidData() throws InterruptedException {
        Utils.openWebsite("https://passpod.com/id/register");
        Utils.maximizeWindow();
        register.inputFirstName("Almas");
        register.inputLastName("Aqmarina");
        register.inputEmail("almasaqmarina+skyshi5@gmail.com");
        register.inputPassword("Aqmarina18@");
        register.inputConfirmPassword("Aqmarina18@");
        register.clickCheckboxTnc();
        register.submitRegister();
        Utils.closeWebsite();
    }

    //register with same email
    @Test
    public void RegisterWithSameEmail() throws InterruptedException {
        Utils.openWebsite("https://passpod.com/id/register");
        Utils.maximizeWindow();
        register.inputFirstName("Almas");
        register.inputLastName("Aqmarina");
        register.inputEmail("almasaqmarina@gmail.com");
        register.inputPassword("Aqmarina18@");
        register.inputConfirmPassword("Aqmarina18@");
        register.clickCheckboxTnc();
        register.submitRegister();
        register.userSeeAlertError();
        String alertError =driver.findElement(By.xpath("//*[@id=\"jsWrap\"]/div[3]/section/div/div[1]/h6")).getText();
        if (emailRegistered.contains(alertError))
            System.out.println("Same as expected -> "+alertError);
        else System.out.println("Not same as expected ->"+alertError);
        Utils.closeWebsite();
    }

    // Register with password doesn't match
    @Test
    public void RegisterWithDiffPassword() throws InterruptedException {
        Utils.openWebsite("https://passpod.com/id/register");
        Utils.maximizeWindow();
        register.inputFirstName("Almas");
        register.inputLastName("Aqmarina");
        register.inputEmail("almasaqmarina+skyshi3@gmail.com");
        register.inputPassword("Aqmarina18@");
        register.inputConfirmPassword("Aqmarina1");
        register.clickCheckboxTnc();
        register.submitRegister();
        register.userSeeAlertError();
        String alertError =driver.findElement(By.xpath("//*[@id=\"jsWrap\"]/div[3]/section/div/div[2]/div/form/div[4]/span[1]")).getText();
        if (passwordNotSame.contains(alertError))
            System.out.println("Same as expected -> "+alertError);
        else System.out.println("Not same as expected ->"+alertError);
        Utils.closeWebsite();
    }
}
