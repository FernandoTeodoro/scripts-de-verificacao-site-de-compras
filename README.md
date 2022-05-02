  <p>
  Criação de scripts para a automação de alguns fluxos presentes nesse <a href="http://automationpractice.com/">site de compras</a>
utilizando Selenium WebDriver com Java.
  </p>
  
  <p>
  Abaixo tem uma lista com os scripts criados até o momento:
  </p>
  
  <blockquote>
    <ol>
      <li> LoginTests:
        <ol>
          <li><strong>criarUmaNovaContaComSucesso()</strong></br></li>
          <li><strong>criarContaComEmailInvalido()</strong></li>
          <li><strong>criarContaComEmailRepetido()</strong></li>
        </ol>
      </li>
      <li> CadastroTests:
        <ol>
          <li><strong>cadastrarUmNovoPerfilComSucesso()</strong></br></li>
          <li><strong>cadastrarUmPerfilPreenchendoCamposObrigatorios()</strong></li>
          <li><strong>cadastrarUmPerfilSemTelefone()</strong></li>
          <li><strong>cadastrarUmPerfilComCodigoPostalInvalido()</strong></li>
          <li><strong>cadastrarUmPerfilSemSelcionarUmEstado()</strong></li>
          <li><strong>cadastrarUmPerfilExcedendoOTamanhoDaMensagenDoCampoInformacaoAdicional()</strong></li>
        </ol>
      </li>
  </ol>
  </blockquote>
  
  <p>
  Para o preenchimento de algumas informações eu optei por utilizar a biblioteca <a href="https://mvnrepository.com/artifact/com.github.javafaker/javafaker/1.0.2">Faker</a>.
  </p>
  
  <p>
  Para rodar os scripts primeiro é preciso clonar o projeto ou baixa-lo na sua maquina, abrir o projeto com o <a href="https://www.jetbrains.com/pt-br/idea/">InteliJ IDEA</a>. Apos isso navegue ate a pasta tests (src/test/java/com/javaseleniumtemplate/tests) e então execute os métodos existentes nas classes LoginTests e CadastroTests.
  </p>

  <p>
  A base utilizada nesse projeto foi disponibilizada pela <a href="https://www.base2.com.br/">Base2 Tecnologia</a> durante o bootcamp de automação de testes oferecido pela empresa.
  </p> 
