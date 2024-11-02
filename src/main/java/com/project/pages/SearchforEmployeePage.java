package com.project.pages;

import com.project.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchforEmployeePage extends Base {

    public WebElement Click_Employee_List_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a"));
    }


    public WebElement Add_Employee_Name_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
    }

    public WebElement Click_Search_Button_Ele(WebDriver webDriver){
        return webDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
    }
}
