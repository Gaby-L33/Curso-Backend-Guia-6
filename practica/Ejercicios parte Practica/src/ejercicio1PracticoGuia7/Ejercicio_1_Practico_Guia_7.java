/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, 
 * y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
 * Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método 
 * el número de ISBN, el título, el autor del libro y el número de páginas.
 */
package ejercicio1PracticoGuia7;

public class Ejercicio_1_Practico_Guia_7 {

    public static void main(String[] args) {
        
        Libro libro1 = new Libro().crearLibro(); //Instanciar objeto y llamar al metodo crearLibro
        libro1.mostrarLibro(libro1); //Llemar al metodo mostrarLibro
    }
    
}
