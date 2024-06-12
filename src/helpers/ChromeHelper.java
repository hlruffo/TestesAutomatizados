package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeHelper {
	//metodo para abrir o navegador e acesar uma pagina 
	public static WebDriver create(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver-win64\\chromedriver.exe");
		
		//abrindo o navegador e acessando o cadastro de usuarios
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
}
