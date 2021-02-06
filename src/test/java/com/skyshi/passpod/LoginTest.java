package com.skyshi.passpod;

import com.skyshi.password.config.Utils;
import com.skyshi.password.pages.Login;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginTest {
    WebDriver driver = Utils.getDriver();
    Login login = new Login(driver);

    private String emailNotRegistered = "User not registered";
    private String invalidPassword = "Incorrect Email or Password";

    public LoginTest() throws IOException {
    }

    //login with valid email and password
    @Test
    public void LoginWithValidFormat() throws InterruptedException {
        Utils.openWebsite("https://passpod.com/id/login");
        Utils.maximizeWindow();
        login.inputEmail("almasaqmarina@gmail.com");
        login.inputPassword("Aqmarina18@");
        login.clickBtnSubmitMasuk();
        Utils.closeWebsite();
    }

    //login with email not registered
    @Test
    public void LoginWithEmailNotRegistered() throws InterruptedException {
        Utils.openWebsite("https://passpod.com/id/login");
        Utils.maximizeWindow();
        login.inputEmail("almasaqmarina1@gmail.com");
        login.inputPassword("Aqmarina18@");
        login.clickBtnSubmitMasuk();
        login.userSeeErrorAlert();
        String alertError =driver.findElement(By.xpath("//*[@id=\"jsWrap\"]/div[3]/section/div/div[1]/h6")).getText();
        if (emailNotRegistered.contains(alertError))
            System.out.println("Same as expected -> "+alertError);
        else System.out.println("Not same as expected ->"+alertError);
        Utils.closeWebsite();
    }

    //login with invalid password
    @Test
    public void LoginWithInvalidPassword() throws InterruptedException {
        Utils.openWebsite("https://passpod.com/id/login");
        Utils.maximizeWindow();
        login.inputEmail("almasaqmarina@gmail.com");
        login.inputPassword("Aqmarina1");
        login.clickBtnSubmitMasuk();
        login.userSeeErrorAlert();
        String alertError =driver.findElement(By.xpath("//*[@id=\"jsWrap\"]/div[3]/section/div/div[1]/h6")).getText();
        if (invalidPassword.contains(alertError))
            System.out.println("Same as expected -> "+alertError);
        else System.out.println("Not same as expected ->"+alertError);
        Utils.closeWebsite();
    }
}
