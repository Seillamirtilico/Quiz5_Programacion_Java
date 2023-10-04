public class Principal {
    /**
     * Método main para inicializar el proyecto, se crea una biblioteca y se le agregan 5 libros
     * Complejidad constante: O(1)
     * @param args Argumentos de línea de comandos (no utilizados en este caso)
     */
    public static void main(String[] args){
        Biblioteca miBiblioteca = new Biblioteca();

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);
        Libro libro2 = new Libro("El código DaVinci", "DanBrown", 656);
        Libro libro3 = new Libro("1984", "GeorgeOrwell", 326);
        Libro libro4 = new Libro("El Hobbit", "J.R.R.Tolkien", 310);
        Libro libro5 = new Libro("La Odisea", "Homero", 448);

        miBiblioteca.registrarLibro(libro1);
        miBiblioteca.registrarLibro(libro2);
        miBiblioteca.registrarLibro(libro3);
        miBiblioteca.registrarLibro(libro4);
        miBiblioteca.registrarLibro(libro5);
    }
}
