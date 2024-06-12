package testes;

//import java.io.File;

//import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

import helpers.ChromeHelper;
import helpers.ScreenshotHelper;

public class CadastrarUsuarioFaker {

	@Test
	public void test() {
		//informar onde está o chromedriver
		//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver-win64\\chromedriver.exe");
		
		//criar instancia do webdriver
		 WebDriver driver = ChromeHelper.create("http://hlruffo-002-site1.ctempurl.com/Account/Register");
		 
		 //informando ao navegador qual página iremos acessar
		 //driver.get("http://hlruffo-002-site1.ctempurl.com/Account/Register");
		 
		 //maximizando a tela 
		 //driver.manage().window().maximize();
		 
		 //instanciando o Faker
		 Faker faker = new Faker();
		 
		 //criando um nome 
		 String nome = faker.name().fullName();
		 
		 //passando o nome para o campo do formulário 
		 driver.findElement(By.xpath("//*[@id=\"Nome\"]")).sendKeys(nome);
		 
		 //criar um email com Faker
		 String email = faker.internet().emailAddress();
		 
		 //passar o email para o campo do formulário
		 driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
		 
		 //criar uma senha com o Faker
		 String senha = faker.internet().password(8, 10, true, true, true);
		 
		 //enviando senha para o campo
		 driver.findElement(By.xpath("//*[@id=\"Senha\"]")).sendKeys(senha);
		 
		 //enviar a senha para o campo de confirmação de senha
		 driver.findElement(By.xpath("//*[@id=\"SenhaConfirmacao\"]")).sendKeys(senha);
		 
		 //clicar no botão 
		 driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/form/div[5]/input")).click();
	
		 //criando evidencia de teste utilizando try/catch
		 //try {
		//	 File arquivo = ((TakesScreenshot)driver ).getScreenshotAs(OutputType.FILE);
		//	 FileUtils.copyFile(arquivo ,  new File("Evidencia de teste.png"));
		// }
		// catch(Exception e){
		//	 e.printStackTrace();
		// }
		 
		 String NomeArquivo = faker.name().fullName();
		 ScreenshotHelper.create(driver, NomeArquivo );
	
	
	}

}
