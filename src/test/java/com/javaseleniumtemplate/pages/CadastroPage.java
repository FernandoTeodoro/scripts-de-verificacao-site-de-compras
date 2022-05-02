package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class CadastroPage extends PageBase {
    //Mapping

    //Formulario "YOUR PERSONAL INFORMATION"
    By formularioNovaConta = By.id("account-creation_form");
    By radioGeneroMasculino = By.id("id_gender1");
    By radioGeneroFeminino = By.id("id_gender2");
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
    By campoResponsavelAdicional = By.id("alias");
    By botaoSubmeterCadastro = By.id("submitAccount");

    By mensagemDeErro = By.xpath("//div[@class='alert alert-danger']/ol/li");



    //Actions Formulario "YOUR PERSONAL INFORMATION"
    public void esperarCarregamentoDoFormulario(){
        waitForElement(formularioNovaConta);
    }

    public void selecionarGeneroMasculino(){
        click(radioGeneroMasculino);
    }

    public void selecionarGeneroFeminino(){
        click(radioGeneroFeminino);
    }

    public void preencherCampoNome(String nome){
        sendKeys(campoNome, nome);
    }

    public void preencherCampoSobrenome(String sobrenome){
        sendKeys(campoSobrenome, sobrenome);
    }

    public String retornarEmailPresenteNoFormulario(){
        return getValue(campoEmail);
    }

    public void preencherCampoSenha(String senha){
        sendKeys(campoSenha, senha);
    }

    public void preencherCampoDiaNascimento(String dia){
        sendKeysWithoutWaitVisible(campoDiaNascimento, dia);
    }

    public void preencherCampoMesNascimento(String mes){
        sendKeysWithoutWaitVisible(campoMesNascimento, mes);
    }

    public void preencherCampoAnoNascimento(String ano){
        sendKeysWithoutWaitVisible(campoAnoNascimento, ano);
    }

    public void clicarNoCheckboxDeNewsletter(){
        click(checkboxNewsletter);
    }

    public void clicarNoCheckboxOfertas(){
        click(checkboxOfertas);
    }

    //Actions Formulario "YOUR ADDRESS"
    public void preencherCampoEmpresa(String empresa){
        sendKeys(campoEmpresa, empresa);
    }

    public void preencherCampoEnderco(String endereco){
        sendKeys(campoEndereco, endereco);
    }

    public void preencherCampoComplemento(String complemento){
        sendKeys(campoComplemento, complemento);
    }

    public void preencherCampoCidade(String cidade){
        sendKeys(campoCidade, cidade);
    }

    public void preencherCampoEstado(String estado){
        sendKeysWithoutWaitVisible(campoEstado, estado);
    }

    public void preencherCampoCodigoPostal(String codigoPostal){
        sendKeys(campoCodigoPostal, codigoPostal);
    }

    public void preencherCampoPais(String pais){
        sendKeysWithoutWaitVisible(campoPais, pais);
    }

    public void preencherCampoInformacaoAdicional(String informacaoAdicional){
        sendKeys(campoInformacaoAdicional, informacaoAdicional);
    }

    public void preencherCampoTelefoneFixo(String telefoneFixo){
        sendKeys(campoTelefoneFixo, telefoneFixo);
    }

    public void preencherCampoCelular(String celular){
        sendKeys(campoCelular, celular);
    }

    public void preencherCampoResponsavelAdicional(String responsavelAicional){
        sendKeys(campoResponsavelAdicional, responsavelAicional);
    }

    public void clicarEmSubmeterFormularioDeCadastro(){
        click(botaoSubmeterCadastro);
    }

    public String pegarMensagemDeErro(){
        return getText(mensagemDeErro);
    }

}
