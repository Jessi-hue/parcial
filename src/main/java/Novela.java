package src.main.java;

public class Novela extends Libro {

    private String tipo;

    public Novela(String titulo, String autor, int ejemplares, int prestados, String tipo) {
        super(titulo, autor, ejemplares, prestados);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " Tipo: " + tipo;
    }
}