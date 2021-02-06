package com.sekolahqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Kategory extends BasePage {
    private By searchBox = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/header/div[1]/div/div[3]/form/div/input");
    private By btnSearch = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/header/div[1]/div/div[3]/form/div/div[1]/button");
    private By searchPage = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div/div[1]/div/div[1]/div");
    private By btnSemuaAktivitas = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div/div[2]/div/ul/li[1]/a");
    private By btnActivities = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div/div[2]/div/ul/li[3]/a");
    private By btnDayTours = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div/div[2]/div/ul/li[4]/a");
    private By btnPackages = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div/div[2]/div/ul/li[5]/a");
    private By btnEvent = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div/div[2]/div/ul/li[6]/a");
    private By dropdownFilter = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div/div[1]/div/div[2]/div/select");
    private By filterTitle = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div/div[1]/div/div[2]/div/select/option[1]");
    private By filterPrice = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div/div[1]/div/div[2]/div/select/option[2]");
    private By filterPopularity = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div/div[1]/div/div[2]/div/select/option[3]");

    public Kategory (WebDriver driver) { super(driver); }

    public void inputKeyword(String keyword) throws InterruptedException {
        inputText(searchBox, keyword);
    }
    public void clickBtnSearch() throws InterruptedException{
        clickButton(btnSearch);
    }
    public void userSeeSearchPage() throws InterruptedException {
        waitUntilElementIsVisible(searchPage);
    }
    public void clickSemuaAktivitas() throws InterruptedException {
        waitUntilElementIsVisible(btnSemuaAktivitas);
        clickButton(btnSemuaAktivitas);
    }
    public void clickActivities() throws InterruptedException {
        waitUntilElementIsVisible(btnActivities);
        clickButton(btnActivities);
    }
    public void clickDayTours() throws InterruptedException {
        waitUntilElementIsVisible(btnDayTours);
        clickButton(btnDayTours);
    }
    public void clickPackages() throws InterruptedException {
        waitUntilElementIsVisible(btnPackages);
        clickButton(btnPackages);
    }
    public void clickEvent() throws InterruptedException {
        waitUntilElementIsVisible(btnEvent);
        clickButton(btnEvent);
    }
    public void clickFilterDropdown() throws InterruptedException {
        waitUntilElementIsVisible(dropdownFilter);
        clickButton(dropdownFilter);
    }
    public void clickTitleFilter() throws InterruptedException {
        waitUntilElementIsVisible(filterTitle);
        clickButton(filterTitle);
    }
    public void clickPopularityFilter() throws InterruptedException {
        waitUntilElementIsVisible(filterPopularity);
        clickButton(filterPopularity);
    }
    public void clickPriceFilter() throws InterruptedException {
        waitUntilElementIsVisible(filterPrice);
        clickButton(filterPrice);
    }
}
