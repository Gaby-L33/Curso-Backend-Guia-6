    /**
     * Desarrollar una clase Cancion con los siguientes atributos: título y
     * autor. Se deberá definir además dos constructores: uno vacío que
     * inicializa el título y el autor a cadenas vacías y otro que reciba como
     * parámetros el título y el autor de la canción. Se deberán además definir
     * los métodos getters y setters correspondientes.
     */
package ejercicio_extra_1_guia7;

import java.util.Scanner;

public class Cancion {
    private String titulo;
    private String autor;

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion() {
    }
    //Se ingresa el titulo con el objeto del main
    public Cancion crearTitulo(Cancion cancion1){ 
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el titulo de la cancion ");
        cancion1.setTitulo(leer.nextLine());
        
        return cancion1;
    }
    //Se ingresa el autor
    public Cancion crearAutor(Cancion cancion1){ 
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el autor de la cancion ");
        cancion1.setAutor(leer.nextLine());
        
        return cancion1;
    }
    
    public void mostrarCancion(Cancion cancion1){
        System.out.println("------------------------------------------");
        System.out.println("El titulo de la cancion es " + titulo);
        System.out.println("El autor de la cancion es " + autor);
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
    
    
}
