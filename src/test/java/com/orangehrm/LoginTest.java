package com.orangehrm;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Login;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class LoginTest {
    WebDriver driver = Utils.getDriver();
    Login login = new Login(driver);

    public LoginTest() throws IOException {
    }

    // Login with valid username and  valid password
    @Test
    public void LoginWithValidFormatAdmin() throws InterruptedException {
        Utils.openWebsite("https://passpod.com/");
        Utils.maximizeWindow();
        Utils.closeWebsite();
    }
}


