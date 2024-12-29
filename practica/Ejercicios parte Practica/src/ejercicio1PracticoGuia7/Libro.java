/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el número de páginas.
 */
package ejercicio1PracticoGuia7;

import java.util.Scanner;

public class Libro {
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int NumPaginas;

    public Libro(String ISBN, String Titulo, String Autor, int NumPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPaginas = NumPaginas;
    }

    public Libro() {

    }

    public Libro crearLibro() { //Metodo para crear el Libro(Objeto)
        Scanner leer = new Scanner(System.in);
        Libro libro = new Libro();
        System.out.println("Ingresa el ISBN:");
        libro.setISBN(leer.nextLine());
        System.out.println("Ingresa el título:");
        libro.setTitulo(leer.nextLine());
        System.out.println("Ingresa el autor:");
        libro.setAutor(leer.nextLine());
        System.out.println("Ingresa la cantidad de páginas:");
        libro.setNumPaginas(leer.nextInt());
        return libro;
    }

    public void mostrarLibro(Libro libro) { //Metodo mostar el Objeto Libro
        System.out.println("---------------------------");
        System.out.println(libro.getISBN());
        System.out.println(libro.getTitulo());
        System.out.println(libro.getAutor());
        System.out.println(libro.getNumPaginas());
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        NumPaginas = numPaginas;
    }

}
