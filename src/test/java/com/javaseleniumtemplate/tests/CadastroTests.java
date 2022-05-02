package com.javaseleniumtemplate.tests;

import com.github.javafaker.Faker;
import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.CadastroPage;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.MyAccountPage;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class CadastroTests extends TestBase {
    //Objects
    String URL_DEFAULT = GlobalParameters.URL_DEFAULT;
    LoginPage loginPage;
    LoginFlows loginFlows;
    CadastroPage cadastroPage;
    MyAccountPage myAccountPage;
    Faker faker;

    //Tests
    @Test
    public void cadastrarUmNovoPerfilComSucesso(){
        //Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();
        cadastroPage = new CadastroPage();
        myAccountPage = new MyAccountPage();
        faker = new Faker(new Locale("en-US"));

        //Parameteres
        String email = faker.name().firstName() + faker.name().lastName() + "@teste.com";

        //Test
        loginPage.navigateTo(URL_DEFAULT + "?controller=authentication&back=my-account#account-creation");
        loginFlows.criarNovaConta(email);

        cadastroPage.esperarCarregamentoDoFormulario();

        Assert.assertEquals(cadastroPage.retornarEmailPresenteNoFormulario(), email);

        //Preencher Personal Information
        cadastroPage.selecionarGeneroFeminino();
        cadastroPage.preencherCampoNome(faker.name().firstName());
        cadastroPage.preencherCampoSobrenome(faker.name().lastName());
        cadastroPage.preencherCampoSenha(faker.random().hex(5));
        cadastroPage.preencherCampoDiaNascimento("13");
        cadastroPage.preencherCampoMesNascimento("June");
        cadastroPage.preencherCampoAnoNascimento("1995");

        //Preencher Address
        cadastroPage.preencherCampoEmpresa(faker.company().name());
        cadastroPage.preencherCampoEnderco(faker.address().firstName());
        cadastroPage.preencherCampoComplemento(faker.address().buildingNumber());
        cadastroPage.preencherCampoCidade(faker.address().cityName());
        cadastroPage.preencherCampoEstado(faker.address().state());
        cadastroPage.preencherCampoCodigoPostal(faker.number().digits(5));
        cadastroPage.preencherCampoPais("United States");
        cadastroPage.preencherCampoInformacaoAdicional(faker.lorem().characters(200));
        cadastroPage.preencherCampoTelefoneFixo(faker.phoneNumber().cellPhone());
        cadastroPage.preencherCampoCelular(faker.phoneNumber().cellPhone());
        cadastroPage.preencherCampoResponsavelAdicional(faker.name().fullName());
        cadastroPage.clicarEmSubmeterFormularioDeCadastro();

        myAccountPage.esperarCarregamentoPaginaMyAccount();

        Assert.assertEquals(cadastroPage.getURL(), URL_DEFAULT+"index.php?controller=my-account");
    }

    @Test
    public void cadastrarUmPerfilPreenchendoCamposObrigatorios(){
        //Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();
        cadastroPage = new CadastroPage();
        myAccountPage = new MyAccountPage();
        faker = new Faker(new Locale("en-US"));

        //Parameteres
        String email = faker.name().firstName() + faker.name().lastName() + "@teste.com";

        //Test
        loginPage.navigateTo(URL_DEFAULT + "?controller=authentication&back=my-account#account-creation");
        loginFlows.criarNovaConta(email);

        cadastroPage.esperarCarregamentoDoFormulario();

        Assert.assertEquals(cadastroPage.retornarEmailPresenteNoFormulario(), email);

        //Preencher Personal Information
        cadastroPage.preencherCampoNome(faker.name().firstName());
        cadastroPage.preencherCampoSobrenome(faker.name().lastName());
        cadastroPage.preencherCampoSenha(faker.random().hex(5));
        cadastroPage.preencherCampoDiaNascimento("13");
        cadastroPage.preencherCampoMesNascimento("June");
        cadastroPage.preencherCampoAnoNascimento("1995");

        //Preencher Address
        cadastroPage.preencherCampoEnderco(faker.address().firstName());
        cadastroPage.preencherCampoCidade(faker.address().cityName());
        cadastroPage.preencherCampoEstado(faker.address().state());
        cadastroPage.preencherCampoCodigoPostal(faker.number().digits(5));
        cadastroPage.preencherCampoCelular(faker.phoneNumber().cellPhone());
        cadastroPage.clicarEmSubmeterFormularioDeCadastro();

        myAccountPage.esperarCarregamentoPaginaMyAccount();

        Assert.assertEquals(cadastroPage.getURL(), URL_DEFAULT+"index.php?controller=my-account");
    }

    @Test
    public void cadastrarUmPerfilSemTelefone(){
        //Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();
        cadastroPage = new CadastroPage();
        myAccountPage = new MyAccountPage();
        faker = new Faker(new Locale("en-US"));

        //Parameteres
        String email = faker.name().firstName() + faker.name().lastName() + "@teste.com";
        String mensagemDeErro = "You must register at least one phone number.";

        //Test
        loginPage.navigateTo(URL_DEFAULT + "?controller=authentication&back=my-account#account-creation");
        loginFlows.criarNovaConta(email);

        cadastroPage.esperarCarregamentoDoFormulario();

        Assert.assertEquals(cadastroPage.retornarEmailPresenteNoFormulario(), email);

        //Preencher Personal Information
        cadastroPage.selecionarGeneroMasculino();
        cadastroPage.preencherCampoNome(faker.name().firstName());
        cadastroPage.preencherCampoSobrenome(faker.name().lastName());
        cadastroPage.preencherCampoSenha(faker.random().hex(5));
        cadastroPage.preencherCampoDiaNascimento("13");
        cadastroPage.preencherCampoMesNascimento("June");
        cadastroPage.preencherCampoAnoNascimento("1995");

        //Preencher Address
        cadastroPage.preencherCampoEmpresa(faker.company().name());
        cadastroPage.preencherCampoEnderco(faker.address().firstName());
        cadastroPage.preencherCampoComplemento(faker.address().buildingNumber());
        cadastroPage.preencherCampoCidade(faker.address().cityName());
        cadastroPage.preencherCampoEstado(faker.address().state());
        cadastroPage.preencherCampoCodigoPostal(faker.number().digits(5));
        cadastroPage.preencherCampoPais("United States");
        cadastroPage.preencherCampoInformacaoAdicional(faker.lorem().characters(200));
        cadastroPage.preencherCampoResponsavelAdicional(faker.name().fullName());
        cadastroPage.clicarEmSubmeterFormularioDeCadastro();

        Assert.assertEquals(cadastroPage.pegarMensagemDeErro(), mensagemDeErro);
    }

    @Test
    public void cadastrarUmPerfilComCodigoPostalInvalido(){
        //Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();
        cadastroPage = new CadastroPage();
        myAccountPage = new MyAccountPage();
        faker = new Faker(new Locale("en-US"));

        //Parameteres
        String email = faker.name().firstName() + faker.name().lastName() + "@teste.com";
        String mensagemDeErro = "The Zip/Postal code you've entered is invalid. It must follow this format: 00000";

        //Test
        loginPage.navigateTo(URL_DEFAULT + "?controller=authentication&back=my-account#account-creation");
        loginFlows.criarNovaConta(email);

        cadastroPage.esperarCarregamentoDoFormulario();

        Assert.assertEquals(cadastroPage.retornarEmailPresenteNoFormulario(), email);

        //Preencher Personal Information
        cadastroPage.selecionarGeneroMasculino();
        cadastroPage.preencherCampoNome(faker.name().firstName());
        cadastroPage.preencherCampoSobrenome(faker.name().lastName());
        cadastroPage.preencherCampoSenha(faker.random().hex(5));
        cadastroPage.preencherCampoDiaNascimento("13");
        cadastroPage.preencherCampoMesNascimento("June");
        cadastroPage.preencherCampoAnoNascimento("1995");

        //Preencher Address
        cadastroPage.preencherCampoEmpresa(faker.company().name());
        cadastroPage.preencherCampoEnderco(faker.address().firstName());
        cadastroPage.preencherCampoComplemento(faker.address().buildingNumber());
        cadastroPage.preencherCampoCidade(faker.address().cityName());
        cadastroPage.preencherCampoEstado(faker.address().state());
        cadastroPage.preencherCampoCodigoPostal(faker.number().digits(3));
        cadastroPage.preencherCampoPais("United States");
        cadastroPage.preencherCampoInformacaoAdicional(faker.lorem().characters(200));
        cadastroPage.preencherCampoTelefoneFixo(faker.phoneNumber().cellPhone());
        cadastroPage.preencherCampoCelular(faker.phoneNumber().cellPhone());
        cadastroPage.preencherCampoResponsavelAdicional(faker.name().fullName());
        cadastroPage.clicarEmSubmeterFormularioDeCadastro();

        Assert.assertEquals(cadastroPage.pegarMensagemDeErro(), mensagemDeErro);
    }

    @Test
    public void cadastrarUmPerfilSemSelcionarUmEstado(){
        //Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();
        cadastroPage = new CadastroPage();
        myAccountPage = new MyAccountPage();
        faker = new Faker(new Locale("en-US"));

        //Parameteres
        String email = faker.name().firstName() + faker.name().lastName() + "@teste.com";
        String mensagemDeErro = "This country requires you to choose a State.";

        //Test
        loginPage.navigateTo(URL_DEFAULT + "?controller=authentication&back=my-account#account-creation");
        loginFlows.criarNovaConta(email);

        cadastroPage.esperarCarregamentoDoFormulario();

        Assert.assertEquals(cadastroPage.retornarEmailPresenteNoFormulario(), email);

        //Preencher Personal Information
        cadastroPage.selecionarGeneroMasculino();
        cadastroPage.preencherCampoNome(faker.name().firstName());
        cadastroPage.preencherCampoSobrenome(faker.name().lastName());
        cadastroPage.preencherCampoSenha(faker.random().hex(5));
        cadastroPage.preencherCampoDiaNascimento("13");
        cadastroPage.preencherCampoMesNascimento("June");
        cadastroPage.preencherCampoAnoNascimento("1995");

        //Preencher Address
        cadastroPage.preencherCampoEmpresa(faker.company().name());
        cadastroPage.preencherCampoEnderco(faker.address().firstName());
        cadastroPage.preencherCampoComplemento(faker.address().buildingNumber());
        cadastroPage.preencherCampoCidade(faker.address().cityName());
        cadastroPage.preencherCampoCodigoPostal(faker.number().digits(5));
        cadastroPage.preencherCampoPais("United States");
        cadastroPage.preencherCampoInformacaoAdicional(faker.lorem().characters(200));
        cadastroPage.preencherCampoTelefoneFixo(faker.phoneNumber().cellPhone());
        cadastroPage.preencherCampoCelular(faker.phoneNumber().cellPhone());
        cadastroPage.preencherCampoResponsavelAdicional(faker.name().fullName());
        cadastroPage.clicarEmSubmeterFormularioDeCadastro();

        Assert.assertEquals(cadastroPage.pegarMensagemDeErro(), mensagemDeErro);
    }

    @Test
    public void cadastrarUmPerfilExcedendoOTamanhoDaMensagenDoCampoInformacaoAdicional(){
        //Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();
        cadastroPage = new CadastroPage();
        myAccountPage = new MyAccountPage();
        faker = new Faker(new Locale("en-US"));

        //Parameteres
        String email = faker.name().firstName() + faker.name().lastName() + "@teste.com";
        String mensagemDeErro= "other is too long. Maximum length: 300";

        //Test
        loginPage.navigateTo(URL_DEFAULT + "?controller=authentication&back=my-account#account-creation");
        loginFlows.criarNovaConta(email);

        cadastroPage.esperarCarregamentoDoFormulario();

        Assert.assertEquals(cadastroPage.retornarEmailPresenteNoFormulario(), email);

        //Preencher Personal Information
        cadastroPage.selecionarGeneroFeminino();
        cadastroPage.preencherCampoNome(faker.name().firstName());
        cadastroPage.preencherCampoSobrenome(faker.name().lastName());
        cadastroPage.preencherCampoSenha(faker.random().hex(5));
        cadastroPage.preencherCampoDiaNascimento("13");
        cadastroPage.preencherCampoMesNascimento("June");
        cadastroPage.preencherCampoAnoNascimento("1995");

        //Preencher Address
        cadastroPage.preencherCampoEmpresa(faker.company().name());
        cadastroPage.preencherCampoEnderco(faker.address().firstName());
        cadastroPage.preencherCampoComplemento(faker.address().buildingNumber());
        cadastroPage.preencherCampoCidade(faker.address().cityName());
        cadastroPage.preencherCampoEstado(faker.address().state());
        cadastroPage.preencherCampoCodigoPostal(faker.number().digits(5));
        cadastroPage.preencherCampoPais("United States");
        cadastroPage.preencherCampoInformacaoAdicional(faker.lorem().characters(500));
        cadastroPage.preencherCampoTelefoneFixo(faker.phoneNumber().cellPhone());
        cadastroPage.preencherCampoCelular(faker.phoneNumber().cellPhone());
        cadastroPage.preencherCampoResponsavelAdicional(faker.name().fullName());
        cadastroPage.clicarEmSubmeterFormularioDeCadastro();

        Assert.assertEquals(cadastroPage.pegarMensagemDeErro(), mensagemDeErro);
    }

}
