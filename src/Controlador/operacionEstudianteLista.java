/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.CRUD;
import Modelo.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class operacionEstudianteLista extends CRUD {

     private ArrayList<Estudiante> objListaEstudiante;
    Estudiante objEstudiante;

    public operacionEstudianteLista() {

        objListaEstudiante = new ArrayList<>();
        
    }

    @Override
    public void create () {
       
        objListaEstudiante.add(objEstudiante);
    }

    @Override
    public ArrayList read() {
        return objListaEstudiante;
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Estudiante getObjEstudiante() {
        return objEstudiante;
    }

    public void setObjEstudiante(Estudiante objEstudiante) {
        this.objEstudiante = objEstudiante;
    }
    
    

}
