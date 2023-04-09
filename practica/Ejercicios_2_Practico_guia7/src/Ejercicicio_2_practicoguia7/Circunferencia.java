package Ejercicicio_2_practicoguia7;


import java.util.Scanner;



/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado
 * el radio de tipo real. A continuación, se deben crear los siguientes
 * métodos: 
 * a) Método constructor que inicialice el radio pasado como parámetro. 
 * b) Métodos get y set para el atributo radio de la clase Circunferencia. 
 * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto. 
 * d) Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2). 
 * e) Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }
    
    public Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        Circunferencia circulo = new Circunferencia();
        
        System.out.println("Ingrese el radio ");
        circulo.setradio(leer.nextDouble());
        
        return circulo;
    }
    
    public void area(Circunferencia circulo1){
        double area1 = Math.pow((Math.PI*radio),2);
        System.out.println("El area del circulo es "+area1);
    }
    
    public void perimetro(Circunferencia circulo){
        double perimetro1 = 2*(Math.PI*radio);
        System.out.println("El perimetro del circulo es "+perimetro1);
    }

    public void setradio(double radio) {
        this.radio = radio;
    }

    public double gerRadio() {
        return radio;
    }

}
