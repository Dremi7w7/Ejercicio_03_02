/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_03_02;

/**
 *
 * @author Dremi7w7
 */
public class Ejercicio_03_02 {

    public static void main(String[] args) {
        //ventanas
        Ventana_1 v1= new Ventana_1();
        Ventana_2 v2= new Ventana_2();
        Ventana_3 v3= new Ventana_3();
        var ventana = new VentanaCrearGrupo("Ventana_4");
        var ventana5=new Ventanas32("Ventana_5");
        
        
        //mostrar ventanas
        v1.setVisible(true); 
        v2.setVisible(true); 
        v3.setVisible(true); 
        ventana.setVisible(true);
        ventana5.setVisible(true);
    }
}
