package src.main.java;

import java.util.Scanner;

/**
 * Clase Main - Sistema de Gestión de Biblioteca
 * Demuestra el funcionamiento del sistema con cuatro tipos de libros
 * y aplica los conceptos de herencia y polimorfismo.
 */
public class Main {

    public static void main(String[] args) {
        // Try-with-resources para cerrar automáticamente el Scanner
        try (Scanner sc = new Scanner(System.in)) {
            
            // ========== LIBRO 1: Novela clásica ==========
            Libro libro1 = new Libro(
                "El diablo de la botella", 
                "Robert Louis Stevenson", 
                5, 
                0
            );
            
            // ========== LIBRO 2: Libro personalizado por entrada del usuario ==========
            Libro libro2 = new Libro();
            
            System.out.println("\n--- CREAR LIBRO PERSONALIZADO ---");
            System.out.print("Ingrese titulo: ");
            libro2.setTitulo(sc.nextLine());
            
            System.out.print("Ingrese autor: ");
            libro2.setAutor(sc.nextLine());
            
            System.out.print("Ingrese numero de ejemplares: ");
            try {
                libro2.setNumeroEjemplares(Integer.parseInt(sc.nextLine()));
            } catch (NumberFormatException e) {
                System.out.println("Numero invalido. Se asigna 0.");
                libro2.setNumeroEjemplares(0);
            }
            
            System.out.print("Ingrese numero de prestados: ");
            try {
                libro2.setNumeroPrestados(Integer.parseInt(sc.nextLine()));
            } catch (NumberFormatException e) {
                System.out.println("Numero invalido. Se asigna 0.");
                libro2.setNumeroPrestados(0);
            }
            
            // ========== LIBRO 3: Libro de Texto Especializado ==========
            LibroTextoUNIAJC libroUni = new LibroTextoUNIAJC(
                "POO",
                "Profesor Gabriel Perez Moreno",
                10,
                2,
                "Programacion",
                "Ingenieria"
            );
            
            // ========== LIBRO 4: Novela de Género ==========
            Novela novela = new Novela(
                "El coronel no tiene quien le escriba",
                "Gabriel Garcia Marquez",
                8,
                1,
                "Romantica"
            );
            
            // ========== PRUEBA DE MÉTODOS ==========
            System.out.println("\n--- PRUEBA DE PRESTAMO Y DEVOLUCION ---");
            System.out.println("Prestamo de libro1: " + libro1.prestamo());
            System.out.println("Prestamo de libro1: " + libro1.prestamo());
            System.out.println("Devolucion de libro1: " + libro1.devolucion());
            System.out.println("Devolucion de novela: " + novela.devolucion());
            
            // ========== SALIDA DE LIBROS ==========
            System.out.println("\n--- INFORMACION DE LIBROS ---");
            System.out.println("Libro 1: " + libro1);
            System.out.println("Libro 2: " + libro2);
            System.out.println("Libro 3: " + libroUni);
            System.out.println("Libro 4: " + novela);
            
        } catch (Exception e) {
            System.err.println("Error durante la ejecucion: " + e.getMessage());
            e.printStackTrace();
        }
    }
}