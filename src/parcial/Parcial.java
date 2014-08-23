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
}
