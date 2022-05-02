package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    //Mapping
    By campoEmail = By.id("email_create");
    By botaoCriarNovaConta = By.id("SubmitCreate");
    By mensagemErroEmailRepetido = By.id("create_account_error");
    By mensagemErroEmailInvalido = By.id("create_account_error");

    //Actions
    public void preencherEmail(String email){
        sendKeys(campoEmail, email);
    }

    public void clicarEmCriarNovaConta(){
        click(botaoCriarNovaConta);
    }

    public String retornarMensagemEmailRepetido(){
        waitForElement(mensagemErroEmailRepetido);
        return getText(mensagemErroEmailRepetido);
    }

    public String retornarMensagemEmailInvalido(){
        waitForElement(mensagemErroEmailInvalido);
        return getText(mensagemErroEmailInvalido);
    }
}
