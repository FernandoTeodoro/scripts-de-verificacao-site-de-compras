package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class CadastroPage extends PageBase {
    //Mapping

    //Formulario "YOUR PERSONAL INFORMATION"
    By formularioNovaConta = By.id("account-creation_form");
    By radioGeneroMasculino = By.id("id_gender1");
    By campoNome = By.id("customer_firstname");
    By campoSobrenome = By.id("customer_lastname");
    By campoEmail = By.id("email");
    By campoSenha = By.id("passwd");
    By campoDiaNascimento = By.id("days");
    By campoMesNascimento = By.id("months");
    By campoAnoNascimento = By.id("years");
    By checkboxNewsletter = By.id("newsletter");
    By checkboxOfertas = By.id("optin");

    //Formulario "YOUR ADDRESS"
    By campoFirstName = By.id("firstname");
    By campoLastName = By.id("lastname");
    By campoEmpresa = By.id("company");
    By campoEndereco = By.id("address1");
    By campoComplemento = By.id("address2");
    By campoCidade = By.id("city");
    By campoEstado = By.id("id_state");
    By campoCodigoPostal = By.id("postcode");
    By campoPais = By.id("id_country");
    By campoInformacaoAdicional = By.id("other");
    By campoTelefoneFixo = By.id("phone");
    By campoCelular = By.id("phone_mobile");
    By campoResponsavel = By.id("alias");
    By botaoSubmeterCadastro = By.id("submitAccount");


}
