    /**
     * Crear una clase Rectángulo que modele rectángulos por medio de un
     * atributo privado base y un atributo privado altura. La clase incluirá un
     * método para crear el rectángulo con los datos del Rectángulo dados por el
     * usuario. También incluirá un método para calcular la superficie del
     * rectángulo y un método para calcular el perímetro del rectángulo. Por
     * último, tendremos un método que dibujará el rectángulo mediante
     * asteriscos usando la base y la altura. Se deberán además definir los
     * métodos getters, setters y constructores correspondientes. 
     * Superficie = base * altura / Perímetro = (base + altura) * 2.
     */
package ejercicio4_guia7;

import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public Rectangulo crearRectangulo() {  //Se ingresan los datos del rectangulo 
        Scanner leer = new Scanner(System.in);
        Rectangulo rectangulo2 = new Rectangulo();

        System.out.println("Ingrese la longitud de la base ");
        rectangulo2.setBase(leer.nextInt());

        System.out.println("Ingrese la longitud de la altura ");
        rectangulo2.setAltura(leer.nextInt());

        return rectangulo2;
    }

    public void calcularSuperficie(Rectangulo rectangulo2) {
        int superficie = base * altura;
        System.out.println("La superficie del rectangulo es " + superficie);

    }

    public void calcularPerimetro(Rectangulo rectangulo2) {
        int perimetro = (base * altura) * 2;
        System.out.println("El perimetro del rectangulo es " + perimetro);
    }

    public void dibujoRectangulo(Rectangulo rectangulo2) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }

    public float getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
