package src.main.java;

public class Libro {

    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numeroEjemplares, int numeroPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroPrestados = numeroPrestados;
    }

    public boolean prestamo() {
        if (numeroPrestados < numeroEjemplares) {
            numeroPrestados++;
            return true;
        }
        return false;
    }

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

    @Override
    public String toString() {
        return "Titulo: " + titulo +
                " Autor: " + autor +
                " Ejemplares: " + numeroEjemplares +
                " Prestados: " + numeroPrestados;
    }
}