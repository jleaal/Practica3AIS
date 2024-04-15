# AIS-Practica-3-2024

Nombre de los alumnos: Jorge Leal y Javier Laureano Ochoa

### Test generico


### Ejemplo 1

**INPUT y OUTPUT**: "1M 4M" -> "Gana jugador 2"

**R1_1. Código de test**
```java
@Test
@DisplayName("Test R1 (1M 4M)")
public void TestR1_1 (){
    testR1("Gana jugador 2", "1M 4M");
}
```

**R1_1. Mensaje del test añadido que NO PASA**

```log
org.opentest4j.AssertionFailedError: 
Expected :null
Actual:Gana jugador 2
```

**R1_1. Código mínimo para que el test pase**

public String play(String ronda){
if (ronda.equals("1M 4M"))
return "Gana jugador 2";
return null;
}
Describe brevemente el código mínimo implementado

```java
public String convert(int number){
    return "I";
}
```

**EJ1. Captura de que TODOS los test PASAN**

![Pasa](capturas/Ejemplo_1_PASA.png "Pasa")

**EJ1. Refactorización**
> [BORRAR]  Solo si se considera necesario

Justificar vuestra refactorización aquí.

```java
public String convert(int number){
    return "I"; // Imaginemos que hemos refactorizado aquí
}
```
**EJ1. Captura de que TODOS los tests PASAN tras la refactorización**
> [BORRAR]  Solo si se ha realizado una refactorización

![Pasa](capturas/Ejemplo_1_PASA.png "Pasa")