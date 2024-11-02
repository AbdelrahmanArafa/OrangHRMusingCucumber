package com.project.pages;

import com.project.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditEmployeeDetailsPage extends Base {


    public WebElement Click_Employee_field_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div"));
    }


    public WebElement Add_Employee_License_Number_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input"));
    }

    public WebElement Add_License_Expiry_Date_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input"));
    }


    public WebElement Click_Nationality_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]"));
    }

    public WebElement Select_Nationality_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]"));
    }


    public WebElement Click_Martial_Status_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]"));
    }

    public WebElement Select_Martial_Status_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[1]"));
    }

    public WebElement Add_Date_of_Birth_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input"));
    }

    public WebElement Select_Gender_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span"));
    }


    public WebElement Click_Save_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button"));
    }
}
