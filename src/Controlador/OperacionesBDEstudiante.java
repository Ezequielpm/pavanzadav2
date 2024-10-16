/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.CRUD;
import Modelo.Estudiante;
import Modelo.JavaPostgreSQL;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ezequielpena
 */
public class OperacionesBDEstudiante extends CRUD {

    Estudiante objEstudiante;
    JavaPostgreSQL objJavaPostgreSQL;
    //Statement stmt;

    public OperacionesBDEstudiante() {
        objJavaPostgreSQL = new JavaPostgreSQL();
        objJavaPostgreSQL.connectDatabase();
        
        //stmt = new Statement();
    }

    @Override
    public void create() {
        try {
            objJavaPostgreSQL.stmt.execute("INSERT INTO estudiante(matricula,nombre,apellido_paterno,apellido_materno,edad) VALUES"
                    + "(" + objEstudiante.getMatricula()
                    + ","+ "'"+objEstudiante.getNombre()+"'"
                   // + ")"+";")
                    +","+"'"+objEstudiante.getApPaterno()+"'"+","+"'"+objEstudiante.getApMaterno()+"'"+","+objEstudiante.getEdad()+
                    ");");
//                    + "," + objEstudiante.getApPaterno()
//                    + "," + objEstudiante.getApMaterno()
//                    + "," + objEstudiante.getEdad()
//                    +")");
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesBDEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList read() {
        ArrayList<Estudiante> objListaEstudiante = new ArrayList<>();
        Estudiante objEstudiante;
        try {
            ResultSet resultado = objJavaPostgreSQL.stmt.executeQuery("SELECT * FROM estudiante;");
            while(resultado.next()){
                objEstudiante = new Estudiante();
                objEstudiante.setMatricula( resultado.getInt("matricula"));
                objEstudiante.setNombre( resultado.getString("nombre"));
                objEstudiante.setApPaterno(resultado.getString("apellido_paterno"));
                objEstudiante.setApMaterno(resultado.getString("apellido_paterno"));
                objEstudiante.setEdad(resultado.getInt("edad"));
                objListaEstudiante.add(objEstudiante);
                
                //objListaEstudiante.add(objEstudiante);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesBDEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
    
    // Tarea: Hacer uso de PreparedStatement
    
    public void readPrepared(){
        ArrayList<Estudiante> objListaEstudiante = new ArrayList<>();
        Estudiante objEstudiante;
        String consulta = "SELECT * FROM estudiante;"; // aqui es donde deben ir los ? dependiendo que queremos consultar
        try(PreparedStatement ps = objJavaPostgreSQL.connection.prepareStatement(consulta)){
            //ps.setString(1, "estudiante");
            try(ResultSet rs = ps.executeQuery()){
                 while(rs.next()){
                      int matricula = rs.getInt("matricula");
                      String nombre = rs.getString("nombre");
                      System.out.println("Matricula: "+matricula+" Nombre: "+nombre);
                 }
            }
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesBDEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
//        try {
//            ResultSet resultado = objJavaPostgreSQL.stmt.executeQuery("SELECT * FROM estudiante;");
//            while(resultado.next()){
//                objEstudiante = new Estudiante();
//                objEstudiante.setMatricula( resultado.getInt("matricula"));
//                objEstudiante.setNombre( resultado.getString("nombre"));
//                objListaEstudiante.add(objEstudiante);
//                
//                //objListaEstudiante.add(objEstudiante);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(OperacionesBDEstudiante.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return objListaEstudiante;
    public static void main(String[] args) {
        OperacionesBDEstudiante ob = new OperacionesBDEstudiante();
        ob.readPrepared();
    }
}

