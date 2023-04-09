/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ip.gp7_ejerc2;

import Entidad.Circunferencia;

/**
 *
 * @author iptal
 */
public class Gp7_Ejerc2 {

    public static void main(String[] args) {
        
        Circunferencia c1= new Circunferencia();
        
        c1.crearCircunsferencia();
        System.out.println("El area es: "+ c1.area());
        System.out.println("El perímetro es: "+ c1.perimetro());
        
    }
}
