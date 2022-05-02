package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class MyAccountPage extends PageBase {
    //Mapping
    By paginaMyAccount = By.id("my-account");

    //Actions
    public void esperarCarregamentoPaginaMyAccount(){
        waitForElement(paginaMyAccount);
    }
}
