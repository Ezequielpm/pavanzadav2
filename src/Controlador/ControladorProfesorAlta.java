/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.ProfesorAlta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorProfesorAlta implements ActionListener {

    ProfesorAlta objProfesorAlta;

    public ControladorProfesorAlta(ProfesorAlta objProfesorAlta) {

        this.objProfesorAlta = objProfesorAlta;

        objProfesorAlta.jButton1.addActionListener(this);
        objProfesorAlta.jTextField1.addActionListener(this);
        objProfesorAlta.jTextField2.addActionListener(this);
        objProfesorAlta.jTextField3.addActionListener(this);
        objProfesorAlta.jTextField4.addActionListener(this);
        objProfesorAlta.jTextField1.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == objProfesorAlta.jButton1) {
            System.out.println("escuchador de boton profesor alta");
            /*
            System.out.println("Resultado tamaño: "+this.jTextField1.getText().length());//checa de que tamaño es el string
        System.out.println("Resultado Empty: "+this.jTextField1.getText().isEmpty()); //valida cualquier caracter (incluyendo esapcios, si hay espacios NO esta vacio)
        System.out.println("Resultado blank: "+this.jTextField1.getText().isBlank()); //solo acepta caracteres invisibles(si hay espacios marca vacio)
        
        
        //if(!this.validaCamposTextos()){
            
           // return;
        //}   
       
        this.validaCamposTextos2();
        
        System.out.println("Matricula: "+ this.jTextField1.getText());
        System.out.println("Nombre: "+ this.jTextField2.getText());
        System.out.println("Apellido Paterno: "+ this.jTextField3.getText());
        System.out.println("Apellido Materno: "+ this.jTextField4.getText());
        System.out.println("Edad: "+ this.jTextField5.getText());
        this.jTextField1.setText("");
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        this.jTextField4.setText("");
        this.jTextField5.setText("");
             */

        }

        if (e.getSource() == objProfesorAlta.jTextField1) {

        }

        if (e.getSource() == objProfesorAlta.jTextField2) {

        }

        if (e.getSource() == objProfesorAlta.jTextField3) {

        }

        if (e.getSource() == objProfesorAlta.jTextField4) {

        }

        if (e.getSource() == objProfesorAlta.jTextField5) {

        }

    }
    
        

}
