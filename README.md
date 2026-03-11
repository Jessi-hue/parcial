
# Sistema de Biblioteca en Java

## Descripción

Este proyecto implementa un sistema simple de gestión de biblioteca utilizando Programación Orientada a Objetos (POO) en Java.

El sistema permite manejar diferentes tipos de libros y aplicar conceptos como herencia, encapsulamiento y abstracción.

## Clases del proyecto

### Libro

Clase base que contiene la información de un libro:

* título
* autor
* número de ejemplares
* número de ejemplares prestados

### LibroTexto

Hereda de la clase Libro y añade el atributo:

* curso

### LibroTextoUNIAC

Hereda de LibroTexto y añade:

* facultad

### Novela

Hereda de Libro y añade:

* tipo de novela

## Conceptos utilizados

* Programación Orientada a Objetos
* Herencia
* Encapsulamiento
* Constructores
* Métodos

### Realizar la UML#
           Libro
---------------------------------
- titulo : String
- autor : String
- numeroEjemplares : int
- numeroPrestados : int
---------------------------------
+ prestamo() : boolean
+ devolucion() : boolean
+ toString() : String


             ▲
             |
         LibroTexto
---------------------------------
- curso : String
---------------------------------
+ toString()


             ▲
             |
      LibroTextoUNIAC
---------------------------------
- facultad : String
---------------------------------
+ toString()


             ▲
             |
            Novela
---------------------------------
- tipo : String
---------------------------------
+ toString()