    /**
     * Desarrollar una clase Cancion con los siguientes atributos: título y
     * autor. Se deberá definir además dos constructores: uno vacío que
     * inicializa el título y el autor a cadenas vacías y otro que reciba como
     * parámetros el título y el autor de la canción. Se deberán además definir
     * los métodos getters y setters correspondientes.
     */
package ejercicio_extra_1_guia7;

public class Ejercicio_extra_1_Guia7 {

    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        
        cancion1.crearTitulo(cancion1);
        cancion1.crearAutor(cancion1);
        cancion1.mostrarCancion(cancion1);
    }

}
