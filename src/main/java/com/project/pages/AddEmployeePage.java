package com.project.pages;

import com.project.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEmployeePage extends Base {


    public WebElement Click_PIM_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
    }

    public WebElement Click_Add_Button_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
    }


    public WebElement Fill_Employee_FirstName_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input"));
    }

    public WebElement Fill_Employee_MiddleName_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input"));
    }

    public WebElement Fill_Employee_LastName_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input"));
    }

    public WebElement Click_Save_Button_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
    }
}
