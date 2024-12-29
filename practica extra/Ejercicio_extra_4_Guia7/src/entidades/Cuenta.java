/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
package entidades;

import java.util.Scanner;

public class Cuenta {
    private float Saldo;
    private String Titular;

    public Cuenta() {
    }

    public Cuenta(float Saldo, String Titular) {
        this.Saldo = Saldo;
        this.Titular = Titular;
    }

    public void retirar_dinero(Cuenta persona1){
        Scanner leer = new Scanner(System.in);
        //Ingresa los datos
        System.out.println("Buenos Dias!!!");
        System.out.println("Por favor ingrese su nombre de titular");
        persona1.setTitular(leer.next()); 
        System.out.println("Ahora por favor ingrese cuanto es su saldo en la cuenta");
        persona1.setSaldo(leer.nextFloat());
        float retiro;
        do{ //Se resta dinero del saldo si es menor o igual al mismo
            System.out.println("Cuanto dinero quiere retirar de su cuenta");
            retiro = leer.nextFloat();
            
            if(retiro<=Saldo){
                Saldo= Saldo-retiro;
                System.out.println("Su saldo es ahora de: " + Saldo);
            } else if(retiro>Saldo){
                System.out.println("Ingrese una cantidad compatible");
                System.out.println("Intentelo de nuevo!!");
            }
        }while(retiro>Saldo);
    }
    
    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }
    
    
}
