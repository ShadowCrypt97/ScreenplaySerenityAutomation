#Author: Sergio Andrés Gómez Roa
 @HistoriaDeUsuario
Feature: Verificar que un usuario puede iniciar sesión correctamente

  Como usuario quiero entrar dentro de Serenity App demo para verificar si puedo acceder correctamente

  Background:
    Given que voy a ingresar a la pagina Serenity App Demo

    @CasoLoginCorrecto
    Scenario Outline: Verificar inicio de sesion correcto
      And Elimino las credenciales por default
      And que voy a ingresar mis credenciales de acceso
        |username  |password    |
        |<username>|<password>  |
      When complete el inicio de sesion
      Then Se debe visualizar el dashboard del usuario
      Examples:
        |username|password|
        |admin   |serenity|