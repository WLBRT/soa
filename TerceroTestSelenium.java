package wam.com.selenium.case1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TerceroTestSelenium {
	


	@Test
	public void caso_abrirNavegadroFireFox_urlIntranetSOA() throws InterruptedException {
		List<String> items = new ArrayList<>();
		items.add("ESTO");
		items.add("ES");
		items.add("UN");
		items.add("TEST");
		items.add("PARA");
		items.add("COMPRENDER");
		items.add("EL");
		items.add("USO");
		items.add("DE");
		items.add("findElement");
		items.add("CON");
		items.add("SELENIUM");
		items.add(".::GRACIAS::.");
		
		System.setProperty("webdriver.gecko.driver","C:\\cursoSelenium\\drivers\\64\\geckodriver.exe"); //Tipo de controlador y Ubicacion del controlador
		WebDriver d = new FirefoxDriver();
		d.get("https://intranet.grupocmc.es/"); //URL para prueba
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.getTitle();
		System.out.println(d.getTitle());
		System.out.println("username");
		System.out.println(d.findElement(By.id("username")).isDisplayed());
		
		System.out.println("credential");
		System.out.println(d.findElement(By.id("credential")).getLocation());
		
		for(String item : items){
//			d.findElement(By.id("username")).clear();
			d.findElement(By.id("username")).sendKeys(" "+item);
			Thread.sleep(1000);
		}
		
		
		
		d.quit();
	}
	
	
}
