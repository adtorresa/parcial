/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial;

import javax.swing.JOptionPane;

/**
 *
 * @author F211
 */
public class Parcial {

    public Parcial() {
    }
    
    


    
    public String mayor (int A, int B){
        String cad;
        
        while ( A == B ) {
            cad = JOptionPane.showInputDialog(null,"Digite el primer numero");
            A = Integer.parseInt(cad);

            cad = JOptionPane.showInputDialog(null,"Digite el segundo numero");
            B = Integer.parseInt(cad);
        }

        if (A > B){
            cad = ( "A es el mayor");
        } 
        else {
            cad = ( "B es el mayor");
        }   
        return cad;
        
    }
    
    public String mayor2 (int A, int B, int C){
        String cad;
        
        if (A > B && A > C){
            cad = ( "A es el mayor");
        }
        else {
            if (B > A && B > C){
                cad = ( "B es el mayor");
            }
            else{
                cad = ( "C es el mayor");
            }  
        }
        return cad;
        
    }
    
    
    public String suma (int N ){
        String cad;
        int suma = 0;
        while ( N  < 10 ){
            N ++;
            suma = suma + N;
        }
        if (N == 10){
            cad = ( "suma");
        }
        else{
            cad = ( "N es mayor");
        }
          
        return cad;   
    }
    
    public double hipotenusa(int A, int B){
        double hipo;
        hipo = A + B;            
        hipo = Math.sqrt(hipo);
        return hipo;
    }
}
