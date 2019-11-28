package com.carlos.AppSixPack.definitions;

import java.net.MalformedURLException;

import com.carlos.AppSixPack.steps.steps__appSixPack;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class definitions_appSixPack {
	@Steps
	steps__appSixPack objStepApp;

	@Given("^Iniciar app$")
	public void iniciar_app() throws MalformedURLException, InterruptedException {
		objStepApp.iniciar_app();
	}

	@When("^Entrar a la pestana Ejercicios$")
	public void entrar_a_la_pestana_Ejercicios()  {
		objStepApp.entrar_a_la_pestaña_Ejercicios();
	}

	@Then("^Verificar swipe en los tres niveles de dificultad$")
	public void verificar_swipe_en_los_tres_niveles_de_dificultad() {
		objStepApp.verificar_swipe_en_los_tres_niveles_de_dificultad();
	}

	@When("^Entrar al nivel Principiante y dar tap al boton Prepadados$")
	public void entrar_al_nivel_Principiante_y_dar_tap_al_boton_Prepadados() throws InterruptedException {
		objStepApp.entrar_al_nivel_Principiante_y_dar_tap_al_boton_Prepadados();
	}

	@Then("^Verificar que se visualiza la rutina de ejercicios del nivel Principiante$")
	public void verificar_que_se_visualiza_la_rutina_de_ejercicios_del_nivel_Principiante() throws InterruptedException {
		objStepApp.verificar_que_se_visualiza_la_rutina_de_ejercicios_del_nivel_Principiante();
	}

	@When("^Entrar al nivel Intermedio y dar tap al boton Prepadados$")
	public void entrar_al_nivel_Intermedio_y_dar_tap_al_boton_Prepadados() throws InterruptedException {
		objStepApp.entrar_al_nivel_Intermedio_y_dar_tap_al_boton_Prepadados();
	}

	@Then("^Verificar que se visualiza la rutina de ejercicios del nivel Intermedio$")
	public void verificar_que_se_visualiza_la_rutina_de_ejercicios_del_nivel_Intermedio() throws InterruptedException {
		objStepApp.verificar_que_se_visualiza_la_rutina_de_ejercicios_del_nivel_Intermedio();
	}

	@When("^Entrar al nivel Avanzado y dar tap al boton Prepadados$")
	public void entrar_al_nivel_Avanzado_y_dar_tap_al_boton_Prepadados() {
		objStepApp.entrar_al_nivel_Avanzado_y_dar_tap_al_boton_Prepadados();
	}

	@Then("^Verificar que se visualiza la rutina de ejercicios del nivel Avanzado$")
	public void verificar_que_se_visualiza_la_rutina_de_ejercicios_del_nivel_Avanzado() throws InterruptedException {
		objStepApp.verificar_que_se_visualiza_la_rutina_de_ejercicios_del_nivel_Avanzado();
	}

	@When("^Entrar al nivel Principiante y dar tap en Inicio del diaUno$")
	public void entrar_al_nivel_Principiante_y_dar_tap_en_Inicio_del_diaUno() {
		objStepApp.entrar_al_nivel_Principiante_y_dar_tap_en_Inicio_del_diaUno();
	}

	@Then("^Verificar la cantidad de ejercicios del nivel Principiante$")
	public void verificar_la_cantidad_de_ejercicios_del_nivel_Principiante() {
		objStepApp.verificar_la_cantidad_de_ejercicios_del_nivel_Principiante();
	}

	@When("^Entrar al nivel Intermedio y dar tap en Inicio del diaUno$")
	public void entrar_al_nivel_Intermedio_y_dar_tap_en_Inicio_del_diaUno() {
		objStepApp.entrar_al_nivel_Intermedio_y_dar_tap_en_Inicio_del_diaUno();
	}

	@Then("^Verificar la cantidad de ejercicios del nivel Intermedio$")
	public void verificar_la_cantidad_de_ejercicios_del_nivel_Intermedio() {
		objStepApp.verificar_la_cantidad_de_ejercicios_del_nivel_Intermedio();
	}

	@When("^Entrar al nivel Avanzado y dar tap en Inicio del diaUno$")
	public void entrar_al_nivel_Avanzado_y_dar_tap_en_Inicio_del_diaUno() {
		objStepApp.entrar_al_nivel_Avanzado_y_dar_tap_en_Inicio_del_diaUno();
	}

	@Then("^Verificar la cantidad de ejercicios del nivel Avanzado$")
	public void verificar_la_cantidad_de_ejercicios_del_nivel_Avanzado() {
		objStepApp.verificar_la_cantidad_de_ejercicios_del_nivel_Avanzado();
	}

	@When("^Entrar al nivel Principiante e iniciar rutina$")
	public void entrar_al_nivel_Principiante_e_iniciar_rutina() throws InterruptedException {
		objStepApp.entrar_al_nivel_Principiante_e_iniciar_rutina();
	}

	@Then("^Verificar cuenta regresiva inicio rutina nivel Principiante$")
	public void verificar_cuenta_regresiva_inicio_rutina_nivel_Principiante() {
		objStepApp.verificar_cuenta_regresiva_inicio_rutina_nivel_Principiante();
	}

	@When("^Entrar al nivel Intermedio e iniciar rutina$")
	public void entrar_al_nivel_Intermedio_e_iniciar_rutina() throws InterruptedException {
		objStepApp.entrar_al_nivel_Intermedio_e_iniciar_rutina();
	}

	@Then("^Verificar cuenta regresiva inicio rutina nivel Intermedio$")
	public void verificar_cuenta_regresiva_inicio_rutina_nivel_Intermedio() {
		objStepApp.verificar_cuenta_regresiva_inicio_rutina_nivel_Intermedio();
	}

	@When("^Entrar al nivel Avanzado e iniciar rutina$")
	public void entrar_al_nivel_Avanzado_e_iniciar_rutina() throws InterruptedException {
		objStepApp.entrar_al_nivel_Avanzado_e_iniciar_rutina();
	}

	@Then("^Verificar cuenta regresiva inicio rutina nivel Avanzado$")
	public void verificar_cuenta_regresiva_inicio_rutina_nivel_Avanzado() {
		objStepApp.verificar_cuenta_regresiva_inicio_rutina_nivel_Avanzado();
	}

	@When("^Entrar a la pestana Mio y realizar el cambio de idioma a Ingles$")
	public void entrar_a_la_pestana_Mio_y_realizar_el_cambio_de_idioma_a_Ingles() throws InterruptedException {
		objStepApp.entrar_a_la_pestaña_Mio_y_realizar_el_cambio_de_idioma_a_Ingles();
	}

	@Then("^Verificar el cambio de idioma a Ingles$")
	public void verificar_el_cambio_de_idioma_a_Ingles() throws InterruptedException {
		objStepApp.verificar_el_cambio_de_idioma_a_Ingles();
	}

	@When("^Entrar a la pestana Mio y realizar el cambio de idioma a Espanol$")
	public void entrar_a_la_pestana_Mio_y_realizar_el_cambio_de_idioma_a_Espanol() {
		objStepApp.entrar_a_la_pestaña_Mio_y_realizar_el_cambio_de_idioma_a_Español();
	}
	
	@Then("^Verificar el cambio de idioma a Espanol$")
	public void verificar_el_cambio_de_idioma_a_Espanol()  throws InterruptedException {
		objStepApp.verificar_el_cambio_de_idioma_a_Español();
	}

	@When("^Entrar al nivel Principiante, dar tap al dia uno y luego al primer ejercicio$")
	public void entrar_al_nivel_Principiante_dar_tap_al_dia_uno_y_luego_al_primer_ejercicio() throws InterruptedException {
		objStepApp.entrar_al_nivel_Principiante_dar_tap_al_dia_uno_y_luego_al_primer_ejercicio();
	}

	@Then("^Verificar que se visualice una descripcion de ese ejercicio del nivel Principiante\\.$")
	public void verificar_que_se_visualice_una_descripcion_de_ese_ejercicio_del_nivel_Principiante() throws InterruptedException {
		objStepApp.verificar_que_se_visualice_una_descripcion_de_ese_ejercicio_del_nivel_Principiante();
	}

	@When("^Entrar al nivel Intermedio, dar tap al dia uno y luego al primer ejercicio$")
	public void entrar_al_nivel_Intermedio_dar_tap_al_dia_uno_y_luego_al_primer_ejercicio() throws InterruptedException {
		objStepApp.entrar_al_nivel_Intermedio_dar_tap_al_dia_uno_y_luego_al_primer_ejercicio();
	}

	@Then("^Verificar que se visualice una descripcion de ese ejercicio del nivel Intermedio\\.$")
	public void verificar_que_se_visualice_una_descripcion_de_ese_ejercicio_del_nivel_Intermedio() throws InterruptedException {
		objStepApp.verificar_que_se_visualice_una_descripcion_de_ese_ejercicio_del_nivel_Intermedio();
	}

	@When("^Entrar al nivel Avanzado, dar tap al dia uno y luego al primer ejercicio$")
	public void entrar_al_nivel_Avanzado_dar_tap_al_dia_uno_y_luego_al_primer_ejercicio() throws InterruptedException {
		objStepApp.entrar_al_nivel_Avanzado_dar_tap_al_dia_uno_y_luego_al_primer_ejercicio();
	}

	@Then("^Verificar que se visualice una descripcion de ese ejercicio del nivel Avanzado\\.$")
	public void verificar_que_se_visualice_una_descripcion_de_ese_ejercicio_del_nivel_Avanzado() throws InterruptedException {
		objStepApp.verificar_que_se_visualice_una_descripcion_de_ese_ejercicio_del_nivel_Avanzado();
	}
}
