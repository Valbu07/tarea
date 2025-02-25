/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.pkg14febre;

import javax.swing.JOptionPane;

/**
 *
 * @author Ambiente
 */
public class Ejercicio114febre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad ;
        int ciclo;
        do {
            
            do {
                edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
            }while (edad < 0 || edad > 110); //Verificamos si la edad es correspondiente
            
            
        JOptionPane.showMessageDialog(null,(edad>=18) ? ("Puede Votar") : ("No puede votar"));
        ciclo = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para repetir o 2 para terminar"));

        }while (ciclo ==1);
              
    }
    
}



 