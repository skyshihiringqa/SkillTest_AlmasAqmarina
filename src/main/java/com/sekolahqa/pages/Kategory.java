package com.sekolahqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Kategory extends BasePage {
    private By btnSewaPocketWifi = new By.ByXPath("//*[@id=\"wifi\"]/div/div/div[3]/div/div/a");
    private By dropdownCountry = new By.ByXPath("//*[@id=\"country\"]");
    private By selectCountry = new By.ByXPath("//*[@id=\"country\"]/option[2]");

    public Kategory (WebDriver driver) { super(driver); }

    public void clickSewaPocketWifiBtn() throws InterruptedException {
        clickButton(btnSewaPocketWifi);
    }
    public void setDropdownCountry() throws InterruptedException {
        clickButton(dropdownCountry);
    }
}
