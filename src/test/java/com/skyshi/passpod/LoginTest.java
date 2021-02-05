package com.skyshi.passpod;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Login;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginTest {
    WebDriver driver = Utils.getDriver();
    Login login = new Login(driver);

    private String textAkunSaya = "Akun Saya";

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
        login.userBerhasilLogin();
        String profileText =driver.findElement(By.xpath("//*[@id=\"dropdownProfile\"]")).getText();
        if (textAkunSaya.equals(profileText))
            System.out.println("Same as expected -> "+profileText);
        else System.out.println("Not same as expected ->"+profileText);
        Utils.closeWebsite();
    }
}
