/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana2dia2proyecto3;

import javax.swing.JOptionPane;

/**
 *
 * @author valbu
 */
//** Desarrolle el programa que permita determinar área y volumen de un cilindro dado su radio y altura. Repita el proceso mediante un bucle.*/
public class Semana2Dia2Proyecto3 {

    public static void main(String[] args) {
        double radio;
        double altura;
        int ciclo;
        
        JOptionPane.showMessageDialog(null,"Vamos a calcular el area y el volumen de un cilindro");

        do {
            radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el radio"));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Digite la altura"));
            
            JOptionPane.showMessageDialog(null, "El Volumen es: "+ procedimientoVolumen (radio, altura));
            JOptionPane.showMessageDialog(null, "El Area es: "+ procedimientoArea (radio, altura));



            ciclo = Integer.parseInt(JOptionPane.showInputDialog("Presione \n 1. Para volver a calular \n Otro numero para terminar"));

        }while(ciclo ==1);
    }
    
    public static double procedimientoVolumen (double radio , double altura){
        double resultadovolumen;

        resultadovolumen = (Math.PI  * Math.pow(radio, 2)) * altura;
        return resultadovolumen;
        
    }
    
    public static double procedimientoArea (double radio , double altura){
        double resultadoarea;
        
        resultadoarea= (2*Math.PI * radio * altura)+ (2*Math.PI* Math.pow(radio, 2));  
        return resultadoarea;
    }
    
}
