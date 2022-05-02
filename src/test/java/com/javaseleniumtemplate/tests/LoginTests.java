package com.javaseleniumtemplate.tests;

import com.github.javafaker.Faker;
import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.CadastroPage;
import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTests extends TestBase {
    //Objects
    String URL_DEFAULT = GlobalParameters.URL_DEFAULT;
    LoginPage loginPage;
    LoginFlows loginFlows;
    CadastroPage cadastroPage;
    Faker faker;

    //Tests
    @Test
    public void criarContaComEmailRepetido(){
        //Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();
        faker = new Faker();

        //Parameteres
        String email = "emailteste@teste.com";
        String mensagemEmailRepetido = "An account using this email address has already been registered. Please " +
                "enter a valid password or request a new one.";

        //Test
        loginPage.navigateTo(URL_DEFAULT + "?controller=authentication&back=my-account#account-creation");
        loginFlows.criarNovaConta(email);

        Assert.assertEquals(loginPage.retornarMensagemEmailRepetido(), mensagemEmailRepetido);
    }

    @Test
    public void criarContaComEmailInvalido(){
        //Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();

        //Parameteres
        String email = "blahblahblah";
        String mensagemEmailInvalido = "Invalid email address.";

        //Test
        loginPage.navigateTo(URL_DEFAULT + "?controller=authentication&back=my-account#account-creation");

        loginFlows.criarNovaConta(email);

        Assert.assertEquals(loginPage.retornarMensagemEmailInvalido(), mensagemEmailInvalido);
    }

    @Test
    public void criarUmaNovaContaComSucesso(){
        //Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();
        cadastroPage = new CadastroPage();
        faker = new Faker();

        //Parameteres
        String email = faker.name().firstName() + faker.name().lastName() + "@teste.com";

        //Test
        loginPage.navigateTo(URL_DEFAULT + "?controller=authentication&back=my-account#account-creation");
        loginFlows.criarNovaConta(email);

        cadastroPage.esperarCarregamentoDoFormulario();

        Assert.assertEquals(cadastroPage.retornarEmailPresenteNoFormulario(), email);
    }
}
