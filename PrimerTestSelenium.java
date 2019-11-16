package wam.com.selenium.case1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimerTestSelenium {

	@Test
	public void caso_abrirNavegadroChrome_url() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\cursoSelenium\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		((JavascriptExecutor)d).executeScript("window.open()");
		((JavascriptExecutor)d).executeScript("window.open()");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ArrayList<String> tabs = new ArrayList<String> (d.getWindowHandles());
		d.switchTo().window(tabs.get(0)); 
	    d.get("https://www.facebook.com");
	    d.switchTo().window(tabs.get(1)); 
	    d.get("https://www.facebook.com/mx");
	    d.switchTo().window(tabs.get(2));
	    d.get("https://www.google.com/");
		d.close();
		System.out.println("Termina el test");
		Thread.sleep(9000);
		d.quit();
	}
	
	@Test
	public void caso_abrirNavegadroFireFox_url() {
		System.setProperty("webdriver.gecko.driver","C:\\cursoSelenium\\drivers\\64\\geckodriver.exe"); //Tipo de controlador y Ubicacion del controlador
		WebDriver d = new FirefoxDriver();
		d.get("https://www.google.com/"); //URL para prueba
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.getTitle();
		System.out.println(d.getTitle());
		assertEquals("Google", d.getTitle());
		d.close();
		By.id("");
	}
}
