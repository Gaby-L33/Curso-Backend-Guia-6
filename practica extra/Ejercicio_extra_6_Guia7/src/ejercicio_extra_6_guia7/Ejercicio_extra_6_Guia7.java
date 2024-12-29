/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
 */
package ejercicio_extra_6_guia7;

import entidades.Rectangulo;

public class Ejercicio_extra_6_Guia7 {

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(4,6);
        
        int area = rectangulo1.calcular_area(rectangulo1); //El return del area del rectangulo
        
        System.out.println("Los lados del rectangulo son 4 y 6, y su area es " + area );
    }
    
}
