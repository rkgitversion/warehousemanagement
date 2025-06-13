package com.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    // Page objects or WebElement Locators using FindBy

    @FindBy(xpath = "/h2")
    public WebElement createAccounth2;
    @FindBy(id = "firstName")
    public WebElement firstNameTxtBox;
    @FindBy(id = "lastName")
    public WebElement lastNameTxtBox;
    @FindBy(id = "email")
    public WebElement emailTxtBox;
    @FindBy(id = "password")
    public WebElement passwordTxtBox;
    @FindBy(id = "confirmPassword")
    public WebElement confirmPasswordTxtBox;
    @FindBy(id = "role")
    public WebElement roleDrpdwn;
    @FindBy(className = "btn")
    public WebElement registerButton;

    public String getCreateAccounth2(){
        return createAccounth2.getText();
    }

    // Page actions
    public void enterFirstName(String fname){
         firstNameTxtBox.sendKeys(fname);
    }

    public void enterLastName(String lname){
        lastNameTxtBox.sendKeys(lname);
    }

    public void enterEmail(String email){
        emailTxtBox.sendKeys(email);
    }

    public void enterPassword(String pwd) {
        passwordTxtBox.sendKeys(pwd);
    }

    public void enterConfirmPassword(String cpwd) {
        confirmPasswordTxtBox.sendKeys(cpwd);
    }

    public void selectRole(String role) {
        Select select = new Select(roleDrpdwn);
        select.selectByVisibleText(role);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }
}
