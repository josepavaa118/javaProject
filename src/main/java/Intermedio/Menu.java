/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Intermedio;

import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class Menu {
    
    public void menuInicio(){
       int seleccion=0;
       while (seleccion<4) {
         do{   
         seleccion=Integer.parseInt(JOptionPane.showInputDialog(null,"Select any of the following options:"+"\n"+
                 "1- Iniciar Votaciones"+"\n"+
                 "2- Realizar Consultas"+"\n"+
                 "3- Imprimir Resultados de Votacion"+"\n"+
                 "4- Salir"));
         }while (seleccion>4);
         switch (seleccion){
             case 1:
                
             case 2:
                 
             case 3:
                
             case 4:
                 JOptionPane.showMessageDialog(null, "Thanks for using our system");
                 break;
             default:
                 JOptionPane.showMessageDialog(null, "Invalid Option, Try again");

                         
         }
        }
    }
}
