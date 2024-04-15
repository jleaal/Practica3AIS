# AIS-Practica-3-2024

Nombre de los alumnos: Jorge Leal y Javier Laureano Ochoa

### Función comparativa
```java
public void funcionComparativa (String salida, String ronda) {
    PiratesURJC partida = new PiratesURJC();
    String resultado = partida.play(ronda);
    assertEquals(resultado, salida);
}
```
Descripción: 

### R1_1

**INPUT y OUTPUT**: "1M 4M" -> "Gana jugador 2"

**R1_1. Código de test**
```java
@Test
@DisplayName("Test R1_1 (1M 4M)")
public void TestR1_1 (){
    funcionComparativa("Gana jugador 2", "1M 4M");
}
```

**R1_1. Mensaje del test añadido que NO PASA**

```log
org.opentest4j.AssertionFailedError: 
Expected :null
Actual:Gana jugador 2
```

**R1_1. Código mínimo para que el test pase**

```java
public String play(String ronda){
    return "Gana jugador 2";
}
```
Descripción: Como no hay requisitos, simplemente necesitamos un return con la salida deseada

**EJ1. Captura de que TODOS los test PASAN**

![Pasa](capturas/R1_1_PASA.png "Pasa")

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

### R1_2

**INPUT y OUTPUT**: "5M 2M" -> "Gana jugador 1"

**R1_2. Código de test**
```java
@Test
@DisplayName("Test R1_2 (5M 2M)")
public void TestR1_2 (){
    funcionComparativa("Gana jugador 1", "5M 2M");
}
```

**R1_1. Mensaje del test añadido que NO PASA**

```log
org.opentest4j.AssertionFailedError: 
Expected :Gana jugador 2
Actual   :Gana jugador 1
```

**R1_1. Código mínimo para que el test pase**

```java
public String play(String ronda){
    if (ronda.equals("5M 2M"))
        return "Gana jugador 1";
    return "Gana jugador 2";
}
```
Descripción: Ahora disponemos de dos salidas en base a entradas diferentes, por lo que con un if y una condición gestionamos la salida

**EJ1. Captura de que TODOS los test PASAN**

![Pasa](capturas/R1_1_PASA.png "Pasa")

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

