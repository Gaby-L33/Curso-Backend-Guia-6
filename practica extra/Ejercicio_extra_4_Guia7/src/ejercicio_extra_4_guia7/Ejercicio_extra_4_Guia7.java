/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
package ejercicio_extra_4_guia7;

import entidades.Cuenta;

public class Ejercicio_extra_4_Guia7 {

    public static void main(String[] args) {
        Cuenta persona1 = new Cuenta();
        persona1.retirar_dinero(persona1);
    }
    
}
