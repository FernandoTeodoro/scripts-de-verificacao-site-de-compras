package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.pages.CadastroPage;

public class CadastroFlows {
    //Objects and constructor
    CadastroPage cadastroPage;

    public CadastroFlows(){
        cadastroPage = new CadastroPage();
    }

    //Flows
    public void preencherFormularioMalePersonalInformation(String nome, String sobrenome, String senha,
                                    String diaNascimento, String mesNascimento, String anoNascimento){
        cadastroPage.esperarCarregamentoDoFormulario();
        cadastroPage.selecionarGeneroMasculino();
        cadastroPage.preencherCampoNome(nome);
        cadastroPage.preencherCampoSobrenome(sobrenome);
        cadastroPage.preencherCampoSenha(senha);
        cadastroPage.preencherCampoDiaNascimento(diaNascimento);
        cadastroPage.preencherCampoMesNascimento(mesNascimento);
        cadastroPage.preencherCampoAnoNascimento(anoNascimento);
        cadastroPage.clicarNoCheckboxDeNewsletter();
        cadastroPage.clicarNoCheckboxOfertas();
    }

    public void preencherFormularioFemalePersonalInformation(String nome, String sobrenome, String senha,
                                    String diaNascimento, String mesNascimento, String anoNascimento){
        cadastroPage.esperarCarregamentoDoFormulario();
        cadastroPage.selecionarGeneroFeminino();
        cadastroPage.preencherCampoNome(nome);
        cadastroPage.preencherCampoSobrenome(sobrenome);
        cadastroPage.preencherCampoSenha(senha);
        cadastroPage.preencherCampoDiaNascimento(diaNascimento);
        cadastroPage.preencherCampoMesNascimento(mesNascimento);
        cadastroPage.preencherCampoAnoNascimento(anoNascimento);
        cadastroPage.clicarNoCheckboxDeNewsletter();
        cadastroPage.clicarNoCheckboxOfertas();
    }

    public void preencherFormularioAddress(String empresa, String endereco, String complemento, String cidade,
                                           String estado, String codigoPostal, String pais, String informacaoAdicional,
                                           String telfoneFixo, String celular, String responsavelAdicional){
        cadastroPage.preencherCampoEmpresa(empresa);
        cadastroPage.preencherCampoEnderco(endereco);
        cadastroPage.preencherCampoComplemento(complemento);
        cadastroPage.preencherCampoCidade(cidade);
        cadastroPage.preencherCampoEstado(estado);
        cadastroPage.preencherCampoCodigoPostal(codigoPostal);
        cadastroPage.preencherCampoPais(pais);
        cadastroPage.preencherCampoInformacaoAdicional(informacaoAdicional);
        cadastroPage.preencherCampoTelefoneFixo(telfoneFixo);
        cadastroPage.preencherCampoCelular(celular);
        cadastroPage.preencherCampoResponsavelAdicional(responsavelAdicional);
        cadastroPage.clicarEmSubmeterFormularioDeCadastro();
    }
}
