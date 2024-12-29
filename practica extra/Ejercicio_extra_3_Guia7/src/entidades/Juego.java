/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
 */
package entidades;

import java.util.Scanner;

public class Juego {
    private int juga1, juga2, num, intentosJugador2 = 0;

    public Juego() {
    }

    public Juego(int juga1, int juga2, int num) {
        this.juga1 = juga1;
        this.juga2 = juga2;
        this.num = num;
    }

    public int getJuga1() {
        return juga1;
    }

    public void iniciar_juego(Juego juego1){
        int intentos = 5;
        int adi;
        String seguir = "si";
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Empieza el jugador 1");
        
        do{
            //jugador 1 ingresa el numero
            System.out.println("Jugador por favor ingrese un numero");
            num = leer.nextInt();
            
            System.out.println("Ahora jugador 2 intente adivinar el numero elegido");
            intentosJugador2 =1;
            for (int i = 1; i <= intentos; i++) {
                adi = leer.nextInt();
                //Verifica si el intento del jugador 2 es el mismo que el de jugador 1
                if(adi==num && i<=intentos){
                    System.out.println("El numero elegido es el correcto");
                    juga2++;
                    break;
                } else if(adi<num && i<intentos){
                    System.out.println("El numero es MENOR al elejido");
                } else if(adi>num && i<intentos){
                    System.out.println("El numero es Mayor al elejido");
                } else if(i==intentos){
                    System.out.println("Ya no le quedan intentos!!");
                    juga1++;
                    break;
                }
                intentosJugador2 = i + 1; //Cuenta la cantidad de intentos del jugador 2
            }
            System.out.println("Jugador 2: Número de intentos necesarios para adivinar: " + intentosJugador2);
           
            System.out.println("Usted desea seguir jugando? si/no");
            seguir = leer.next();
            
        }while (seguir.equalsIgnoreCase("si")); //Indica si se repite o no el juego
        

        System.out.println("Jugador 1: Número de veces que ha ganado: " + juga1);
        System.out.println("Jugador 2: Número de veces que ha ganado: " + juga2);
    }
    
    public void setJuga1(int juga1) {
        this.juga1 = juga1;
    }

    public int getJuga2() {
        return juga2;
    }

    public void setJuga2(int juga2) {
        this.juga2 = juga2;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
    
    
}
