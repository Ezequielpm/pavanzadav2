/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Estudiante;
import Vista.EstudianteConsulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author angel
 */
public class ControladorEstudianteConsulta implements ActionListener {

    EstudianteConsulta ObjEstudianteConsulta;
    Estudiante objEstudiante;

    
    OperacionesBDEstudiante objBDEstudiante;
    
    public ControladorEstudianteConsulta(EstudianteConsulta ObjEstudianteConsulta) {

        this.ObjEstudianteConsulta = ObjEstudianteConsulta;

        ObjEstudianteConsulta.jButton1.addActionListener(this);

        
        objBDEstudiante = new OperacionesBDEstudiante();
        llenado();
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
    
    public void llenado(){
        DefaultTableModel modelo = (DefaultTableModel)this.ObjEstudianteConsulta.jTable1.getModel();
        modelo.setRowCount(0);
        ArrayList<Estudiante> objListaEstudianteLocal =  objBDEstudiante.read();
        
        for(int i=0;i<objListaEstudianteLocal.size(); i++){
            modelo.addRow(new Object[]{objListaEstudianteLocal.get(i).getMatricula(), objListaEstudianteLocal.get(i).getNombre(),
                objListaEstudianteLocal.get(i).getApPaterno(),objListaEstudianteLocal.get(i).getApMaterno(),objListaEstudianteLocal.get(i).getEdad()});
        }
    }

}
