package src.main.java;

/**
 * Clase Novela - Extiende Libro para representar novelas.
 * Agrega información sobre el tipo o género de la novela.
 */
public class Novela extends Libro {

    private String tipo;

    /**
     * Constructor con parámetros
     * @param titulo el título del libro
     * @param autor el autor del libro
     * @param ejemplares cantidad total de ejemplares disponibles
     * @param prestados cantidad de ejemplares actualmente prestados
     * @param tipo el género o tipo de novela (ejemplo: Romántica, Histórica, etc)
     */
    public Novela(String titulo, String autor, int ejemplares, int prestados, String tipo) {
        super(titulo, autor, ejemplares, prestados);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " Tipo: " + tipo;
    }
}