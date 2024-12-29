    /**
     * Crear una clase llamada Operacion que tenga como atributos privados
     * numero1 y numero2. A continuación, se deben crear los siguientes métodos:
     * a) Método constructor con todos los atributos pasados por parámetro. 
     * b) Método constructor sin los atributos pasados por parámetro.
     * c) Métodos get y set.
     * d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto. 
     * e) Método sumar(): calcular la suma de los números y devolver el resultado al main. 
     * f) Método restar(): calcular la resta de los números y devolver el resultado al main 
     * g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
     * si fuera a multiplicar por cero, el método devuelve 0 y se le informa al
     * usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main 
     * h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
     * el método devuelve 0 y se le informa al usuario el error se le informa al usuario.
     * Si no, se hace la división y se devuelve el resultado al main.
     */
package ejercicio_3_practico_guia7;

import java.util.Scanner;
import oracle.jrockit.jfr.events.Bits;

public class Operacion {
    
    private int num1;
    private int num2;
    
    public Operacion(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    
    public Operacion(){
        
    }
    
    public Operacion crearOperacion (){
        Scanner leer = new Scanner(System.in);
        Operacion operacion1 = new Operacion();
        
        System.out.println("Ingrese el primer numero ");
        operacion1.setnum1(leer.nextInt());
        
        System.out.println("Ingrese otro numero ");
        operacion1.setNum2(leer.nextInt());
        
        return operacion1;
    }
    
    public int sumar (Operacion operacion1){
        int suma = num1 + num2;
        System.out.println("La suma es: ");
        
        return suma;
    }
    
    public int restar (Operacion operacion){
        int resta = num1 - num2;
        System.out.println("La resta es: ");
       
        return resta;
    }
    
    public int multiplicador (Operacion operacion){
        int multiplicacion = num1 * num2;
        
        if (num1 == 0 || num2 == 0) {
            System.out.println("Se ha intentado multiplicar por 0");
        } else{
            System.out.println("La multipilicacion es: ");
        }
       
        return multiplicacion;
    }
    
    public float divisor (Operacion operacion){
        float division;
        
        if (num1 == 0 || num2 == 0) {
          division = 0;
          
            System.out.println("Se ha intentado dividir por 0");
            
        } else{
           division = Bits.floatValue(num1) / Bits.floatValue(num2);
            System.out.println("La division es: ");
        }
        
        return division;
    }
    
    public void setnum1(int num1){
        this.num1=num1;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    
}
