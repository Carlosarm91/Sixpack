package com.carlos.AppSixPack.pageObjects;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.webdriver.WebDriverFacade;

public class page__appSixPack extends MobilePageObject {

	String nivel = "";
	String verificar = "";
	String cantIni = "";
	String cantidad = "";
	String preparado = "";
	String verifIdioma = "";
	String confirmTxt = "";
	int cant1 = 0, cant2 = 0;
	String txt_seleccionaPlan = "(//*[@class='android.widget.ImageView'])[1]";
	String txt_btnPreparados = "//*[@resource-id='sixpack.sixpackabs.absworkout:id/tv_start']";
	String txt_btnInicio_Id = "sixpack.sixpackabs.absworkout:id/btn_start";
	String txt_verificarInicioRutiona = "//*[@resource-id='sixpack.sixpackabs.absworkout:id/tv_title']";
	String txt_btnEjercicios = "sixpack.sixpackabs.absworkout:id/view_training_click";
	String txt_diaPrincip = "(//*[@class='android.view.ViewGroup'])[5]";
	String txt_diaInterAvanz = "(//*[@class='android.view.ViewGroup'])[6]";
	String txt_cantEjercicios = "//*[@resource-id='sixpack.sixpackabs.absworkout:id/tv_count']";
	String txt_cantEjerciciosIni = "(//*[@resource-id='sixpack.sixpackabs.absworkout:id/tv_detail'])[1]";
	String txt_comprobIniEjerc = "//*[@resource-id='sixpack.sixpackabs.absworkout:id/tv_curr_time']";
	String txt_btnMio = "//*[@resource-id='sixpack.sixpackabs.absworkout:id/view_setting_click']";
	String txt_OpcIdiomas = "//*[@resource-id='sixpack.sixpackabs.absworkout:id/item_detail']";
	String txt_english = "(//*[@resource-id='android:id/text1'])[1]";
	String txt_espanol = "(//*[@resource-id='android:id/text1'])[5]";
	String txt_confirmarTxt = "//*[@resource-id='sixpack.sixpackabs.absworkout:id/btn_close']";
	
	WebDriverWait wait = new WebDriverWait(getDriver(), 100);

	public page__appSixPack(WebDriver driver) {
		super(driver);
	}

	public void iniciarApp() throws MalformedURLException, InterruptedException {
		Thread.sleep(1000);
		if (element(By.xpath(txt_seleccionaPlan)).isVisible())
			element(By.xpath(txt_seleccionaPlan)).click();
	}

	public void diaPrincip() {
		element(By.xpath(txt_diaPrincip)).click();
	}

	public void diainterAvanz() {
		element(By.xpath(txt_diaInterAvanz)).click();
	}

	public void btnEjercicios() {
		element(By.xpath(txt_btnEjercicios)).click();
	}

	public void btnPreparados() {
		element(By.xpath(txt_btnPreparados)).click();
	}

	public void btnInicio() {
		WebElement explicit;
		explicit = wait.until(ExpectedConditions.elementToBeClickable(By.id(txt_btnInicio_Id)));
		element(By.id(txt_btnInicio_Id)).click();
	}

	public void swipe() {
		Dimension size = getDriver().manage().window().getSize();
		WebDriver facade = getDriver();
		WebDriver driver = ((WebDriverFacade) facade).getProxiedDriver();
		int startX = (int) (size.width * 0.9);
		int endX = (int) (size.width * 0.1);
		int pointY = (int) (size.height * 0.5);
		TouchAction ta = new TouchAction((PerformsTouchActions) driver);
		ta.press(new PointOption().withCoordinates(startX, pointY)).waitAction()
				.moveTo(new PointOption().withCoordinates(endX, pointY)).release().perform();
	}

	public void scroll() {
		Dimension size = getDriver().manage().window().getSize();
		WebDriver facade = getDriver();
		WebDriver driver = ((WebDriverFacade) facade).getProxiedDriver();
		int startY = (int) (size.height * 0.9);
		int endY = (int) (size.height * 0.1);
		int pointX = (int) (size.width * 0.5);
		System.out.println("x: " + pointX + "y1: " + startY + "y2: " + endY);
		TouchAction ta = new TouchAction((PerformsTouchActions) driver);
		ta.press(new PointOption().withCoordinates(pointX, startY)).waitAction()
				.moveTo(new PointOption().withCoordinates(pointX, endY)).release().perform();
	}

	public void nivel() {
		int a = 0;
		for (int i = 1; i <= 3; i++) {
			String txt_nivel_Id = "sixpack.sixpackabs.absworkout:id/tv_level";
			nivel = element(By.id(txt_nivel_Id)).getText();
			System.out.println("Nivel encontrado: " + nivel);
			if (nivel.equalsIgnoreCase("Principiante")) {
				swipe();
				a++;
			} else if (nivel.equalsIgnoreCase("Intermedio")) {
				swipe();
				a++;
			} else if (nivel.equalsIgnoreCase("Avanzado")) {
				a++;
			}
		}
		assertEquals(3, a, 0.1);
	}

	public void verificarInicioRutina() throws InterruptedException {
		Thread.sleep(10000);
		verificar = element(By.xpath(txt_verificarInicioRutiona)).getText();
		assertEquals("Ejercicios", verificar);
	}

	public int ejerciciosIni() {
		while (cantIni.isEmpty()) {
			cantIni = element(By.xpath(txt_cantEjerciciosIni)).getText();
		}
		cantIni = cantIni.substring(0, 2);
		cant1 = Integer.parseInt(cantIni);
		return cant1;
	}

	public int cantEjercicios() {
		while (cantidad.isEmpty()) {
			cantidad = element(By.xpath(txt_cantEjercicios)).getText();
		}
		cantidad = cantidad.substring(1, 3);
		cant2 = Integer.parseInt(cantidad);
		return cant2;
	}

	public void compararCant() {
		System.out.println("La cantidad de ejercicios en este nivel es: " + cant1);
		assertEquals(cant1, cant2, 0);
	}

	public void verifIniEjerc() {
		while (preparado.isEmpty()) {
			preparado = element(By.xpath(txt_comprobIniEjerc)).getText();
		}
		assertEquals("Preparados", preparado);
	}

	public void btnMio() {
		element(By.xpath(txt_btnMio)).click();
	}

	public void btnOpcionIdioma() {
		element(By.xpath(txt_OpcIdiomas)).click();
	}

	public void idiomaEnglish() {
		element(By.xpath(txt_english)).click();
	}

	public void idiomaEspanol() {
		element(By.xpath(txt_espanol)).click();
	}

	public void comprobarIdiomaIngles() throws InterruptedException {
		Thread.sleep(6000);
		verifIdioma = element(By.xpath(txt_cantEjerciciosIni)).getText();
		verifIdioma = verifIdioma.substring(3, verifIdioma.length());
		assertEquals("Exercises", verifIdioma);
	}

	public void comprobarIdiomaEspañol() throws InterruptedException {
		Thread.sleep(6000);
		verifIdioma = element(By.xpath(txt_cantEjerciciosIni)).getText();
		verifIdioma = verifIdioma.substring(3, verifIdioma.length());
		assertEquals("Ejercicios", verifIdioma);
	}

	public void tapEjercicio() throws InterruptedException {
		Thread.sleep(2000);
		WebDriver facade = getDriver();
		WebDriver driver = ((WebDriverFacade) facade).getProxiedDriver();
		TouchAction ta = new TouchAction((PerformsTouchActions) driver);
		ta.tap(point(500,900))
        .waitAction(waitOptions(Duration.ofMillis(250))).perform();
	}
	
	public void confirmarTxtEjercicio () throws InterruptedException {
		Thread.sleep(2000);
		confirmTxt = element(By.xpath(txt_confirmarTxt)).getText();
		assertEquals("CERRAR", confirmTxt);
	}
}
