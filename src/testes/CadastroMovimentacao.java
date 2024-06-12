package testes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CadastroMovimentacao {

    @Test
    public void testCadastroMovimentacao() throws InterruptedException {
        // Configura o caminho do driver do navegador
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver-win64\\chromedriver.exe");
        
        // Cria uma instância do ChromeDriver
        WebDriver driver = new ChromeDriver();
        try {
            // Abre a URL do formulário de cadastro de movimentações
            driver.get("http://hlruffo-002-site1.ctempurl.com/");
            Thread.sleep(1000);
            
            driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("email@email.com");
            driver.findElement(By.xpath("//*[@id=\"Senha\"]")).sendKeys("@Admin1234");
            driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/form/div[3]/input")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).click();
            Thread.sleep(1000);
            
            
            // Preenche os campos do formulário
            driver.findElement(By.id("Nome")).sendKeys("Compra de Equipamentos");
            driver.findElement(By.id("Data")).sendKeys("06-06-2024");
            driver.findElement(By.id("Valor")).sendKeys("5000");
            driver.findElement(By.id("Descricao")).sendKeys("Compra de novos computadores e periféricos para o escritório.@Admin1234");
            Thread.sleep(1000);
            
            // Seleciona uma categoria
            new Select(driver.findElement(By.id("CategoriaId"))).selectByVisibleText("DESPESAS DE CASA");
            
            // Seleciona o tipo da movimentação
            WebElement tipoReceber = driver.findElement(By.xpath("//input[@name='Tipo'][@value='1']"));
            WebElement tipoPagar = driver.findElement(By.xpath("//input[@name='Tipo'][@value='2']"));
            tipoPagar.click(); // Seleciona 'Conta a pagar'
            Thread.sleep(1000);
            
            // Envia o formulário
            driver.findElement(By.xpath("//input[@type='submit']")).click();

            // Aguarda alguns segundos para visualizar o resultado
            Thread.sleep(2000);
        } finally {
            // Fecha o navegador
            //driver.quit();
        }
    }
}
