/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana2dia2proyecto4;

import javax.swing.JOptionPane;

/**
 *
 * @author valbu
 */
public class Semana2Dia2Proyecto4 {

    public static void main(String[] args) {
        int num;
        int x = 50;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog ("Digite un numero"));
            if (num > x){
                JOptionPane.showMessageDialog(null, "El numero es mayor que: " + x);
                
            }
            else if (num != 20 && num <80 ){
                        JOptionPane.showMessageDialog(null, "El numero es diferente a 20 y menos que 80");
            }
         
        
        
    }
}
