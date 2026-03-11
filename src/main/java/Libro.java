package src.main.java;

/**
 * Clase Libro - Clase base del sistema de gestión de biblioteca.
 * Representa un libro genérico con atributos básicos y funcionalidades
 * de préstamo y devolución.
 */
public class Libro {

    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroPrestados;

    /**
     * Constructor por defecto
     */
    public Libro() {
    }

    /**
     * Constructor con parámetros
     * @param titulo el título del libro
     * @param autor el autor del libro
     * @param numeroEjemplares cantidad total de ejemplares disponibles
     * @param numeroPrestados cantidad de ejemplares actualmente prestados
     */
    public Libro(String titulo, String autor, int numeroEjemplares, int numeroPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroPrestados = numeroPrestados;
    }

    /**
     * Realiza un préstamo de un ejemplar si hay disponibles
     * @return true si el préstamo fue exitoso, false si no hay ejemplares disponibles
     */
    public boolean prestamo() {
        if (numeroPrestados < numeroEjemplares) {
            numeroPrestados++;
            return true;
        }
        return false;
    }

    /**
     * Realiza la devolución de un ejemplar prestado
     * @return true si la devolución fue exitosa, false si no hay ejemplares prestados
     */
    public boolean devolucion() {
        if (numeroPrestados > 0) {
            numeroPrestados--;
            return true;
        }
        return false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroPrestados() {
        return numeroPrestados;
    }

    public void setNumeroPrestados(int numeroPrestados) {
        this.numeroPrestados = numeroPrestados;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo +
                " Autor: " + autor +
                " Ejemplares: " + numeroEjemplares +
                " Prestados: " + numeroPrestados;
    }
}