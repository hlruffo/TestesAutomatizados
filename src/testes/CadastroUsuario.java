package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroUsuario {

	@Test
	public void test() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver-win64\\chromedriver.exe");
		//atalho para importar ctrl+shift+O
		WebDriver driver = new ChromeDriver();
		driver.get("http://hlruffo-002-site2.ctempurl.com/Account/Register");		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"Nome\"]")).sendKeys("Hugo L Ruffo");
		driver.findElement(By.id("Nome")).sendKeys("Hugo L Ruffo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("hlruffo15195869@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Senha\"]")).sendKeys("@Admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SenhaConfirmacao\"]")).sendKeys("@Admin123");
		Thread.sleep(2000);
		driver.findElement(By.className("btn-primary")).click();
		String mensagem = driver.findElement(By.xpath("/html/body/div[1]/strong")).getText();
		assertEquals("Alerta! O email informado já está cadastrado. Por favor verifique.", mensagem);
	}
}