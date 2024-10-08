/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Estudiante;
import Vista.EstudianteConsulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author angel
 */
public class ControladorEstudianteConsulta implements ActionListener {

    EstudianteConsulta ObjEstudianteConsulta;
    Estudiante objEstudiante;

    public ControladorEstudianteConsulta(EstudianteConsulta ObjEstudianteConsulta) {

        this.ObjEstudianteConsulta = ObjEstudianteConsulta;

        ObjEstudianteConsulta.jButton1.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ObjEstudianteConsulta.jButton1) {

            System.out.println("EScuchador del boton consulta estudiante");
            /*
            DefaultTableModel objModeloTabla = (DefaultTableModel)this.jTable1.getModel();
        objModeloTabla.addRow(new Object[]{"1","1","1","1"});
             */
        }
    }

}
