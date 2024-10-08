/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import javax.swing.JOptionPane;

public class Validador {
    
    public Validador (){
        
    }
    
    public boolean validaCajatextoCadena(javax.swing.JTextField cajatexto){
        
        if(cajatexto.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Urgente campo requerido");
            return false;
        }
        return true;
    }
    
    public boolean validaCajatextoEntero(javax.swing.JTextField cajatexto){
        
        if(cajatexto.getText().isBlank()){
           JOptionPane.showMessageDialog(null, "Urgente campo requerido");
           return false;
        }else{
            try{
                
               int a =Integer.parseInt(cajatexto.getText());
                
            }catch (Exception e  ){
                System.err.println("Error de conversion de datos");
                JOptionPane.showMessageDialog(null, "Valor no permitido, debe ser un numero"); 
                return false;
            }
            return true;
        }
         
    }
    
    public boolean validaCadena(String cadena){
        
        if(cadena.isBlank()){
            JOptionPane.showMessageDialog(null, "Campo requerido de la cadena");
            return false;
        }
        return true;
    }
    
}
