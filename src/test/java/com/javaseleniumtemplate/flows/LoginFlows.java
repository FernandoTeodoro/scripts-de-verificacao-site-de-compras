package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.pages.LoginPage;

public class LoginFlows {
    //Objects and constructor
    LoginPage loginPage;

    public LoginFlows(){
        //Page and Steps Objects
        loginPage = new LoginPage();
    }

    //Flows
    public void criarNovaConta(String email){
        loginPage.preencherEmail(email);
        loginPage.clicarEmCriarNovaConta();
    }

}
