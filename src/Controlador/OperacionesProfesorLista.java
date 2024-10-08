/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.CRUD;
import Modelo.Profesor;
import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class OperacionesProfesorLista extends CRUD {

    ArrayList<Profesor> objListaProfesor;
    Profesor objProfesor;

    public OperacionesProfesorLista() {

        objListaProfesor = new ArrayList();
    }

    @Override
    public void create() {
        objListaProfesor.add(objProfesor);
    }

    @Override
    public ArrayList read() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Profesor getObjProfesor() {
        return objProfesor;
    }

    public void setObjProfesor(Profesor objProfesor) {
        this.objProfesor = objProfesor;
    }

}
