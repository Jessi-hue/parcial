package src.main.java;

/**
 * Clase LibroTextoUNIAJC - Extiende LibroTexto para representar libros de texto
 * especializados en la Universidad UNIAJC.
 * Agrega información sobre la facultad a la que pertenece el libro.
 */
public class LibroTextoUNIAJC extends LibroTexto {

    private String facultad;

    /**
     * Constructor con parámetros
     * @param titulo el título del libro
     * @param autor el autor del libro
     * @param ejemplares cantidad total de ejemplares disponibles
     * @param prestados cantidad de ejemplares actualmente prestados
     * @param curso el nombre del curso al que pertenece
     * @param facultad la facultad a la que pertenece el libro
     */
    public LibroTextoUNIAJC(String titulo, String autor, int ejemplares, int prestados, String curso, String facultad) {
        super(titulo, autor, ejemplares, prestados, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return super.toString() + " Facultad: " + facultad;
    }
}