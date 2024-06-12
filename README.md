# Projeto de Automatização de Testes em Java

Este projeto é uma aplicação Java para automação de testes utilizando as bibliotecas Selenium, Faker e Commons. Ele permite automatizar testes em páginas da web de forma eficiente e confiável.

## Bibliotecas Utilizadas

- **Selenium**: Utilizada para interagir com elementos da página web e simular ações do usuário.
- **Faker**: Utilizada para gerar dados falsos de forma realista, útil para preencher formulários automaticamente durante os testes.
- **Commons**: Utilizada para fornecer funcionalidades utilitárias adicionais para facilitar o desenvolvimento dos testes.

## Como Utilizar

Para utilizar este projeto, siga os passos abaixo:

1. Clone este repositório em sua máquina local.
2. Importe o projeto em sua IDE favorita.
3. Certifique-se de ter configurado as dependências corretamente ou importado os arquivos de biblioteca para o projeto.

## Exemplo de Uso

Aqui está um exemplo simples de como utilizar este projeto para automatizar um teste de login em uma página web:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class TesteLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/caminho/para/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.exemplo.com");

        // Preencher campos de login
        WebElement campoUsuario = driver.findElement(By.id("usuario"));
        campoUsuario.sendKeys("nome_de_usuario");

        WebElement campoSenha = driver.findElement(By.id("senha"));
        campoSenha.sendKeys("senha_secreta");

        // Clicar no botão de login
        WebElement botaoLogin = driver.findElement(By.id("botao-login"));
        botaoLogin.click();

        // Realizar verificações
        // ...

        // Fechar o navegador
        driver.quit();
    }
}
```

## Contato

Este projeto foi criado por Hugo L. Ruffo. Para entrar em contato, envie um e-mail para hlruffo@gmail.com.