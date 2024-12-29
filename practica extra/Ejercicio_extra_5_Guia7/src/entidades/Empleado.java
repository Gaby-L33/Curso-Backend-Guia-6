/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 */
package entidades;

import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }

    public void calcular_aumento(Empleado empleado1){
        Scanner leer = new Scanner(System.in);
        //Ingresa los datos
        System.out.println("Hola");
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        
        System.out.println("Ingrese su edad");
        edad = leer.nextInt();
        
        System.out.println("Ingrese su salario");
        salario = leer.nextDouble();
        
        System.out.println("Ahora le agragaremos el aumento en base a su edad");
        if(edad>=30){
            salario = salario+(salario*0.10);
        } else{
            salario = salario+(salario*0.05);
        }
        System.out.println("Su salario en total es: " + salario);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
