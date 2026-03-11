package src.main.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Libro libro1 = new Libro("El diablo de la botella", "Robert Louis Stevenson", 5, 0);

        Libro libro2 = new Libro();

        System.out.println("Ingrese titulo:");
        libro2.setTitulo(sc.nextLine());

        System.out.println("Ingrese autor:");
        libro2.setAutor(sc.nextLine());

        LibroTextoUNIAJC libroUni = new LibroTextoUNIAJC(
                "POO", "Profesor Gabriel Perez Moreno", 10, 2, "Programacion", "Ingenieria"
        );

        Novela novela = new Novela(
                "El coronel no tiene quien le escriba", "Gabriel Garcia Marquez", 8, 1, "Terror"
        );

        libro1.prestamo();
        libro1.devolucion();

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libroUni);
        System.out.println(novela);
    }
}