package com.skyshi.passpod;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Kategory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class KategoryTest {
    WebDriver driver = Utils.getDriver();
    Kategory kategory = new Kategory(driver);

    public KategoryTest() throws IOException {
    }

    // search other pocket wifi from home
    @Test
    public void SearchOtherPasspodFromHome() throws InterruptedException {
        Utils.openWebsite("https://passpod.com/id/home");
        Utils.maximizeWindow();
        kategory.clickSewaPocketWifiBtn();
    }
}
