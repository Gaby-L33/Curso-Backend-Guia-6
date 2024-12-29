/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos.
 */
package ejercicio_extra_2_guia7;

import Entidades.Puntos;

public class Ejercicio_extra_2_Guia7 {

    public static void main(String[] args) {
        Puntos coordenadas = new Puntos();
        
        coordenadas.crearPuntos(coordenadas);
        double distancia = coordenadas.calcularPuntos(coordenadas);
        System.out.println("La distancia entre el P1 y el P2 es " + distancia);
    }
    
}
