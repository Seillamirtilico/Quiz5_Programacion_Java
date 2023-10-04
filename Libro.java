public class Libro {
    /**
     * Definimos las variables privadas de título, autor y páginas (entero)
     * Complejidad constante: O(1)
     */
    private String titulo;
    private String autor;
    private int paginas;

    /**
     * Creamos el objeto Libro con información específica
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param paginas Número de páginas del libro
     * Complejidad constante: O(1)
     */
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    /**
     * Método get para obtener el título del libro
     * @return Título del libro
     * Complejidad constante: O(1)
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método set para establecer un nuevo título
     * @param titulo Nuevo título del libro
     * Complejidad constante: O(1)
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Método get para obtener el autor del libro
     * Complejidad constante: O(1)
     * @return Autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Método set para establecer un nuevo autor del libro
     * Complejidad constante: O(1)
     * @param autor Nuevo autor del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Método get para obtener el número de páginas del libro
     * Complejidad constante: O(1)
     * @return Número de páginas del libro
     */
    public int getPaginas() {
        return paginas;
    }

    /**
     * Método set para establecer el número de páginas de un libro
     * Complejidad constante: O(1)
     * @param paginas Nuevo número de páginas del libro
     */
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
