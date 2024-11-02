package com.project.pages;

import com.project.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends Base {

    public WebElement User_Name_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
    }

    public WebElement Password_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
    }

    public String Error_Message_Ele(WebDriver webDriver){
        WebElement error_message_ele = webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p"));
        return error_message_ele.getText();
    }

    public WebElement Login_Button_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
    }

    public String UserName_Required_Hint_Ele(WebDriver webDriver){
        WebElement username_required_hint_ele = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span"));
        return username_required_hint_ele.getText();
    }

    public String Password_Required_Hint_Ele(WebDriver webDriver){
        WebElement password_required_hint_ele = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span"));
        return password_required_hint_ele.getText();
    }

    public String Dashboard_Ele(WebDriver webDriver){
        WebElement dashboard_ele = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
        return dashboard_ele.getText();
    }
}
