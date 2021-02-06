package com.skyshi.password.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends BasePage{
    private By btnMasuk = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/header/div[1]/div/div[5]/div[3]/div/div[2]/a[1]");
    private By fieldEmail = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div[5]/div/form/div[1]/div/input");
    private By fieldPassword = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div[5]/div/form/div[2]/input");
    private By btnSubmitMasuk = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div[5]/div/form/button");
    private By errorAlert = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div[1]");

    public Login (WebDriver driver) { super(driver); }

    public void userSeeLoginPage() throws InterruptedException{
        clickButton(btnMasuk);
    }
    public void inputEmail(String email) throws InterruptedException {
        inputText(fieldEmail, email);
    }
    public void inputPassword(String password) throws InterruptedException {
        inputText(fieldPassword, password);
    }
    public void clickBtnSubmitMasuk() throws InterruptedException {
        clickButton(btnSubmitMasuk);
    }
    public void userSeeErrorAlert() throws InterruptedException {
        waitUntilElementIsVisible(errorAlert);
    }
}
