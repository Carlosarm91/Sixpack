package com.carlos.AppSixPack.steps;

import java.net.MalformedURLException;
import com.carlos.AppSixPack.pageObjects.page__appSixPack;
import net.thucydides.core.annotations.Step;

public class steps__appSixPack {

	page__appSixPack objPageApp;

	@Step
	public void iniciar_app() throws MalformedURLException, InterruptedException {
		objPageApp.iniciarApp();
	}

	@Step
	public void entrar_a_la_pestaña_Ejercicios() {

	}

	@Step
	public void verificar_swipe_en_los_tres_niveles_de_dificultad() {
		objPageApp.nivel();
	}

	@Step
	public void entrar_al_nivel_Principiante_y_dar_tap_al_boton_Prepadados() throws InterruptedException {
		objPageApp.btnPreparados();
	}

	@Step
	public void verificar_que_se_visualiza_la_rutina_de_ejercicios_del_nivel_Principiante()
			throws InterruptedException {
		objPageApp.verificarInicioRutina();
	}

	@Step
	public void entrar_al_nivel_Intermedio_y_dar_tap_al_boton_Prepadados() {
		objPageApp.swipe();
		objPageApp.btnPreparados();
	}

	@Step
	public void verificar_que_se_visualiza_la_rutina_de_ejercicios_del_nivel_Intermedio() throws InterruptedException {
		objPageApp.verificarInicioRutina();
	}

	@Step
	public void entrar_al_nivel_Avanzado_y_dar_tap_al_boton_Prepadados() {
		objPageApp.swipe();
		objPageApp.swipe();
		objPageApp.btnPreparados();
	}

	@Step
	public void verificar_que_se_visualiza_la_rutina_de_ejercicios_del_nivel_Avanzado() throws InterruptedException {
		objPageApp.verificarInicioRutina();
	}

	@Step
	public void entrar_al_nivel_Principiante_y_dar_tap_en_Inicio_del_diaUno() {
		objPageApp.ejerciciosIni();
		objPageApp.diaPrincip();
	}

	@Step
	public void verificar_la_cantidad_de_ejercicios_del_nivel_Principiante() {
		objPageApp.cantEjercicios();
		objPageApp.compararCant();
	}

	@Step
	public void entrar_al_nivel_Intermedio_y_dar_tap_en_Inicio_del_diaUno() {
		objPageApp.swipe();
		objPageApp.ejerciciosIni();
		objPageApp.diaPrincip();
	}

	@Step
	public void verificar_la_cantidad_de_ejercicios_del_nivel_Intermedio() {
		objPageApp.cantEjercicios();
		objPageApp.compararCant();
	}

	@Step
	public void entrar_al_nivel_Avanzado_y_dar_tap_en_Inicio_del_diaUno() {
		objPageApp.swipe();
		objPageApp.swipe();
		objPageApp.ejerciciosIni();
		objPageApp.diaPrincip();
	}

	@Step
	public void verificar_la_cantidad_de_ejercicios_del_nivel_Avanzado() {
		objPageApp.cantEjercicios();
		objPageApp.compararCant();
	}

	@Step
	public void entrar_al_nivel_Principiante_e_iniciar_rutina() throws InterruptedException {
		objPageApp.diaPrincip();
		objPageApp.btnInicio();
	}

	@Step
	public void verificar_cuenta_regresiva_inicio_rutina_nivel_Principiante() {
		objPageApp.verifIniEjerc();
	}

	@Step
	public void entrar_al_nivel_Intermedio_e_iniciar_rutina() throws InterruptedException {
		objPageApp.swipe();
		objPageApp.diainterAvanz();
		objPageApp.btnInicio();
	}

	@Step
	public void verificar_cuenta_regresiva_inicio_rutina_nivel_Intermedio() {
		objPageApp.verifIniEjerc();
	}

	@Step
	public void entrar_al_nivel_Avanzado_e_iniciar_rutina() throws InterruptedException {
		objPageApp.swipe();
		objPageApp.swipe();
		objPageApp.diainterAvanz();
		objPageApp.btnInicio();
	}

	@Step
	public void verificar_cuenta_regresiva_inicio_rutina_nivel_Avanzado() {
		objPageApp.verifIniEjerc();
	}

	@Step
	public void entrar_a_la_pestaña_Mio_y_realizar_el_cambio_de_idioma_a_Ingles() throws InterruptedException {
		objPageApp.btnMio();
		objPageApp.scroll();
		objPageApp.btnOpcionIdioma();
		objPageApp.idiomaEnglish();
	}

	@Step
	public void verificar_el_cambio_de_idioma_a_Ingles() throws InterruptedException {
		objPageApp.comprobarIdiomaIngles();
	}

	@Step
	public void entrar_a_la_pestaña_Mio_y_realizar_el_cambio_de_idioma_a_Español() {
		objPageApp.btnMio();
		objPageApp.scroll();
		objPageApp.btnOpcionIdioma();
		objPageApp.idiomaEspanol();
	}

	@Step
	public void verificar_el_cambio_de_idioma_a_Español() throws InterruptedException {
		objPageApp.comprobarIdiomaEspañol();
	}

	@Step
	public void entrar_al_nivel_Principiante_dar_tap_al_dia_uno_y_luego_al_primer_ejercicio() throws InterruptedException {
		objPageApp.diaPrincip();
		objPageApp.tapEjercicio();
	}

	@Step
	public void verificar_que_se_visualice_una_descripcion_de_ese_ejercicio_del_nivel_Principiante() throws InterruptedException {
		objPageApp.confirmarTxtEjercicio();
	}

	@Step
	public void entrar_al_nivel_Intermedio_dar_tap_al_dia_uno_y_luego_al_primer_ejercicio() throws InterruptedException {
		objPageApp.swipe();
		objPageApp.diainterAvanz();
		objPageApp.tapEjercicio();
	}

	@Step
	public void verificar_que_se_visualice_una_descripcion_de_ese_ejercicio_del_nivel_Intermedio() throws InterruptedException {
		objPageApp.confirmarTxtEjercicio();
	}

	@Step
	public void entrar_al_nivel_Avanzado_dar_tap_al_dia_uno_y_luego_al_primer_ejercicio() throws InterruptedException {
		objPageApp.swipe();
		objPageApp.swipe();
		objPageApp.diainterAvanz();
		objPageApp.tapEjercicio();
	}

	@Step
	public void verificar_que_se_visualice_una_descripcion_de_ese_ejercicio_del_nivel_Avanzado() throws InterruptedException {
		objPageApp.confirmarTxtEjercicio();
	}

}
