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

    public Rectangulo crearRectangulo() {
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
