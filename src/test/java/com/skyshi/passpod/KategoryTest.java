package com.skyshi.passpod;

import com.skyshi.password.config.Utils;
import com.skyshi.password.pages.Kategory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class KategoryTest {
    WebDriver driver = Utils.getDriver();
    Kategory kategory = new Kategory(driver);

    public KategoryTest() throws IOException {
    }

    // search other pocket wifi
    @Test
    public void UserSearchPasspodKategory() throws InterruptedException {
        Utils.openWebsite("https://passpod.com/id/home");
        Utils.maximizeWindow();
        kategory.inputKeyword("Jepang");
        kategory.clickBtnSearch();
        kategory.userSeeSearchPage();
        kategory.clickActivities();
        kategory.clickDayTours();
        kategory.clickPackages();
        kategory.clickEvent();
        kategory.clickSemuaAktivitas();
    }

    //filter urutan hasil pencarian
    @Test
    public void UserFilterSort() throws InterruptedException {
        Utils.openWebsite("https://passpod.com/id/home");
        Utils.maximizeWindow();
        kategory.inputKeyword("Jepang");
        kategory.clickBtnSearch();
        kategory.userSeeSearchPage();
        kategory.clickFilterDropdown();
        kategory.clickTitleFilter();
        kategory.clickFilterDropdown();
        kategory.clickPopularityFilter();
        kategory.clickFilterDropdown();
        kategory.clickPriceFilter();
        Utils.closeWebsite();
    }
}
