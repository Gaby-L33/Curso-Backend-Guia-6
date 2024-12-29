/*
 * Crea tu propio proyecto con la clase Persona
 */
package Entidad;

public class Persona {
    //Atributos
    public String Nombre;
    public int Edad;
    public String Sexo;
    //Constructor = instanciar atributos
    public Persona(String Nombre) {
        this.Nombre = Nombre;
    }
    //Metodo Getter y Setter
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
