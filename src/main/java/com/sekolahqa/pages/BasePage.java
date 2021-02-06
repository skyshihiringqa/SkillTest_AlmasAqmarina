package com.sekolahqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    private static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public static void inputText(By by, String text) throws InterruptedException {
        WebElement element = driver.findElement(by);
        Thread.sleep(200);
        element.sendKeys(text);
    }

    public static void clickButton(By by) throws InterruptedException {
        WebElement element = driver.findElement(by);
        Thread.sleep(200);
        element.click();
    }

    public static By waitUntilElementIsVisible(By by) throws InterruptedException {
        Thread.sleep(300);
        WebElement element = driver.findElement(by);
        return by;
    }

    public static By getElementText(By by) throws InterruptedException {
        Thread.sleep(100);
        String text = driver.findElement(by).getText();
        return by;
    }
}
