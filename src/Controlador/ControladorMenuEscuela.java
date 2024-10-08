/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.EstudianteAlta;
import Vista.EstudianteConsulta;
import Vista.MenuEscuela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author angel
 */
public class ControladorMenuEscuela implements ActionListener {
    MenuEscuela objMenuEscuela;
    EstudianteAlta objEstudianteAlta;
    EstudianteConsulta objEstudianteConsulta;
    public ControladorMenuEscuela(){
        
    }
    
    public ControladorMenuEscuela(MenuEscuela objMenuEscuela){
        this.objMenuEscuela = objMenuEscuela;
        this.objMenuEscuela.jButton1.addActionListener(this);
        this.objMenuEscuela.jButton2.addActionListener(this);
        this.objEstudianteAlta = new EstudianteAlta();
        this.objEstudianteConsulta = new EstudianteConsulta();
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.objMenuEscuela.jButton1){
            // escuchador del boton de alta
            this.objMenuEscuela.setVisible(false);
            this.objEstudianteAlta.setVisible(true);
            return;
        }
        if(e.getSource()==this.objMenuEscuela.jButton2){
            //escuchador del boton de consulta
            this.objMenuEscuela.setVisible(false);
            this.objEstudianteConsulta.setVisible(true);
            return;
        }
        
    }
    
}
