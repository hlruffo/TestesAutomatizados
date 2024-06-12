package testes;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExemploDeTeste {

	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cotiinformatica.com.br/");
		
		driver.manage().window().maximize();
		
	}

}
