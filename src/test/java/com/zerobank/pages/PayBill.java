package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBill {

    public PayBill() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//title")
    public WebElement payBillTitle;

    /**
     * @return page name, for example: Dashboard
     */
    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears

        BrowserUtils.waitForStaleElement(payBillTitle);
        return payBillTitle.getText();
    }

    @FindBy(css = "#sp_payee")
    public WebElement selectPayee;

    @FindBy (css = "#sp_account")
    public WebElement selectPayAccount;

    @FindBy (css = "#sp_amount")
    public WebElement selectPayAmount;

    @FindBy (css = "#sp_date")
    public WebElement selectPayDate;

    @FindBy (css = "#sp_description")
    public WebElement selectPayDesc;

    @FindBy (xpath = "//input[@id='pay_saved_payees']")
    public WebElement payButton;



    @FindBy (xpath = "//div[@id='alert_content']/span")
    public WebElement payMsg;





}
