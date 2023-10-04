import java.util.LinkedList;

public class Biblioteca {
    /**
     * Lista que contiene los libros disponibles en la Biblioteca Konrad Lorenz
     * Complejidad constante: O(1)
     */
    LinkedList<Libro> librosDisponibles = new LinkedList<Libro>();

    /**
     * Método para registrar un nuevo libro en la Biblioteca Konrad Lorenz
     * Complejidad constante: O(1)
     * @param libro Objeto que representa el libro a registrar
     */
    public void registrarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    /**
     * Método para buscar un libro por título en la Biblioteca Konrad Lorenz
     * @param titulo Título del libro a buscar
     * @return Si se encuentra el libro, se devuelve el objeto Libro; de lo contrario, se retorna null
     * Complejidad lineal: O(N)
     */
    public Libro buscarLibro(String titulo) {
        for (Libro libro : librosDisponibles) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Retorna la lista de libros disponibles en la Biblioteca Konrad Lorenz
     * Complejidad constante: O(1)
     * @return Lista de libros disponibles
     */
    public LinkedList<Libro> mostrarLibrosDisponibles() {
        return librosDisponibles;
    }
}
