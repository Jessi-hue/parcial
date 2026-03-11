package src.main.java;

/**
 * Clase LibroTexto - Extiende Libro para representar libros de texto.
 * Agrega información sobre el curso al que pertenece el libro.
 */
public class LibroTexto extends Libro {

    private String curso;

    /**
     * Constructor con parámetros
     * @param titulo el título del libro
     * @param autor el autor del libro
     * @param ejemplares cantidad total de ejemplares disponibles
     * @param prestados cantidad de ejemplares actualmente prestados
     * @param curso el nombre del curso al que pertenece
     */
    public LibroTexto(String titulo, String autor, int ejemplares, int prestados, String curso) {
        super(titulo, autor, ejemplares, prestados);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + " Curso: " + curso;
    }
}