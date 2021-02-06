package com.skyshi.password.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register extends BasePage {
    private By btnDaftar = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/header/div[1]/div/div[5]/div[3]/div/div[2]/a[2]");
    private By fieldFirstName = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div[2]/div/form/div[1]/div[1]/input");
    private By fieldLastName = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div[2]/div/form/div[1]/div[2]/input");
    private By fieldEmail = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div[2]/div/form/div[2]/input");
    private By fieldPassword = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div[2]/div/form/div[3]/input");
    private By fieldConfirmPassword = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div[2]/div/form/div[4]/input");
    private By checkboxTnc = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div[2]/div/form/div[5]/input");
    private By btnSubmitRegister = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div[2]/div/form/button");
    private By alertError = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div[1]");
    private By errorPassword = new By.ByXPath("//*[@id=\"jsWrap\"]/div[3]/section/div/div[2]/div/form/div[4]/span[1]");

    public Register (WebDriver driver) { super(driver); }

    public void userSeeRegisterPage() throws InterruptedException {
        clickButton(btnDaftar);
    }
    public void inputFirstName(String firstName) throws InterruptedException {
        inputText(fieldFirstName, firstName);
    }
    public void inputLastName(String lastName) throws InterruptedException {
        inputText(fieldLastName, lastName);
    }
    public void inputEmail(String email) throws InterruptedException {
        inputText(fieldEmail, email);
    }
    public void inputPassword(String password) throws InterruptedException {
        inputText(fieldPassword, password);
    }
    public void inputConfirmPassword(String confirmPassword) throws InterruptedException {
        inputText(fieldConfirmPassword, confirmPassword);
    }
    public void clickCheckboxTnc() throws InterruptedException {
        clickButton(checkboxTnc);
    }
    public void submitRegister() throws InterruptedException {
        clickButton(btnSubmitRegister);
    }
    public void userSeeAlertError() throws InterruptedException {
        waitUntilElementIsVisible(alertError);
    }
    public void userSeeErrorPassword() throws InterruptedException {
        waitUntilElementIsVisible(errorPassword);
    }
}
