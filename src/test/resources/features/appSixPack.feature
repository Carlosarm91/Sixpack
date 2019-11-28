#Author: Carlos Enrique Sarmiento Aguilera
@tag
Feature: app six pack

  @CP002
  Scenario: Visualizar los niveles de dificultad
    Given Iniciar app
    When Entrar a la pestana Ejercicios
    Then Verificar swipe en los tres niveles de dificultad

  @CP003
  Scenario: boton Preparados nivel Principiante
    Given Iniciar app
    When Entrar al nivel Principiante y dar tap al boton Prepadados
    Then Verificar que se visualiza la rutina de ejercicios del nivel Principiante

  @CP004
  Scenario: boton Preparados nivel Intermedio
    Given Iniciar app
    When Entrar al nivel Intermedio y dar tap al boton Prepadados
    Then Verificar que se visualiza la rutina de ejercicios del nivel Intermedio

  @CP005
  Scenario: boton Preparados nivel Avanzado
    Given Iniciar app
    When Entrar al nivel Avanzado y dar tap al boton Prepadados
    Then Verificar que se visualiza la rutina de ejercicios del nivel Avanzado

  @CP006
  Scenario: Verificar la cantidad de ejercicios nivel Principiante
    Given Iniciar app
    When Entrar al nivel Principiante y dar tap en Inicio del diaUno
    Then Verificar la cantidad de ejercicios del nivel Principiante

  @CP007
  Scenario: Verificar la cantidad de ejercicios nivel Intermedio
    Given Iniciar app
    When Entrar al nivel Intermedio y dar tap en Inicio del diaUno
    Then Verificar la cantidad de ejercicios del nivel Intermedio

  @CP008
  Scenario: Verificar la cantidad de ejercicios nivel Avanzado
    Given Iniciar app
    When Entrar al nivel Avanzado y dar tap en Inicio del diaUno
    Then Verificar la cantidad de ejercicios del nivel Avanzado

  @CP009
  Scenario: Verificar inicio rutina del nivel Principiante
    Given Iniciar app
    When Entrar al nivel Principiante e iniciar rutina
    Then Verificar cuenta regresiva inicio rutina nivel Principiante

  @CP010
  Scenario: Verificar inicio rutina del nivel Intermedio
    Given Iniciar app
    When Entrar al nivel Intermedio e iniciar rutina
    Then Verificar cuenta regresiva inicio rutina nivel Intermedio

  @CP011
  Scenario: Verificar inicio rutina del nivel Avanzado
    Given Iniciar app
    When Entrar al nivel Avanzado e iniciar rutina
    Then Verificar cuenta regresiva inicio rutina nivel Avanzado

  @CP012
  Scenario: Verificar cambio de Idioma a Ingles
    Given Iniciar app
    When Entrar a la pestana Mio y realizar el cambio de idioma a Ingles
    Then Verificar el cambio de idioma a Ingles

  @CP013
  Scenario: Verificar cambio de Idioma a Espanol
    Given Iniciar app
    When Entrar a la pestana Mio y realizar el cambio de idioma a Espanol
    Then Verificar el cambio de idioma a Espanol

  @CP014
  Scenario: Verificar descripcion de rutina nivel Principiante
    Given Iniciar app
    When Entrar al nivel Principiante, dar tap al dia uno y luego al primer ejercicio
    Then Verificar que se visualice una descripcion de ese ejercicio del nivel Principiante.

  @CP015
  Scenario: Verificar descripcion de rutina nivel Intermedio
    Given Iniciar app
    When Entrar al nivel Intermedio, dar tap al dia uno y luego al primer ejercicio
    Then Verificar que se visualice una descripcion de ese ejercicio del nivel Intermedio.

  @CP016
  Scenario: Verificar descripcion de rutina nivel Avanzado
    Given Iniciar app
    When Entrar al nivel Avanzado, dar tap al dia uno y luego al primer ejercicio
    Then Verificar que se visualice una descripcion de ese ejercicio del nivel Avanzado.
