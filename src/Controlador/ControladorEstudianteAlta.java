/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.EstudianteAlta;
import Vista.EstudianteConsulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Modelo.Estudiante;
import Vista.MenuEscuela;
import java.util.ArrayList;

/**
 *
 * @author angel
 */                                     //implements son para heredar interfaces, los metodos son abstractos(vacios, no tienen cuerpo)
public class ControladorEstudianteAlta implements ActionListener {

    //EstudianteConsulta objConsulta;
    EstudianteAlta objEstudianteAlta;
    Validador objValidador;
    operacionEstudianteLista objOpListaEstudiante;
    Estudiante objEstudiante;
    MenuEscuela objMenuEscuela;
    OperacionesBDEstudiante objOperacionesBD;
   // ArrayList<Estudiante> listaEst;   no va aqui

    //recibe como parametro estudiante alta:)
    public ControladorEstudianteAlta(EstudianteAlta objEstudianteAlta) {
       //listaEst = new ArrayList();
        objValidador = new Validador();
        
        this.objEstudianteAlta = objEstudianteAlta;
        
        objEstudianteAlta.jButton1.addActionListener(this);
        //objEstudianteAlta.jButton2.addActionListener(this);  esto ya no va porque es del boton de consulta
        objOpListaEstudiante = new operacionEstudianteLista();
        /*objEstudianteAlta.jTextField1.addActionListener(this);
        objEstudianteAlta.jTextField2.addActionListener(this);
        objEstudianteAlta.jTextField3.addActionListener(this);
        objEstudianteAlta.jTextField4.addActionListener(this);
        objEstudianteAlta.jTextField5.addActionListener(this);*/
        objOperacionesBD = new OperacionesBDEstudiante();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == objEstudianteAlta.jButton1) {
            System.out.println("Escuchador del boton");
            if (!this.objValidador.validaCajaTextoEntero(objEstudianteAlta.getjTextField1())) {
                return;
            }
            else if(!this.objValidador.validaCajaTextoCadena(objEstudianteAlta.getjTextField2())){
                return;
            }
            else if(!this.objValidador.validaCajaTextoCadena(objEstudianteAlta.getjTextField3())){
                return;
            }
            else if(!this.objValidador.validaCajaTextoCadena(objEstudianteAlta.getjTextField4())){
                return;
            }
            else if(!this.objValidador.validaCajaTextoEnteroEdad(objEstudianteAlta.getjTextField5())){
                return;
            }
            
            
            
            
            objEstudiante = new Estudiante();
            objEstudiante.setMatricula(Integer.parseInt(objEstudianteAlta.getjTextField1().getText()));
            objEstudiante.setNombre(objEstudianteAlta.getjTextField2().getText());
            objEstudiante.setApPaterno(objEstudianteAlta.getjTextField3().getText());
            objEstudiante.setApMaterno(objEstudianteAlta.getjTextField4().getText());
            objEstudiante.setEdad(Integer.parseInt(objEstudianteAlta.getjTextField5().getText()));
            
            objOpListaEstudiante.setObjEstudiante(objEstudiante);
            //listaEst.add(objEstudiante);
            objOpListaEstudiante.create();
            limpiar();
            //imprimirLista();

            objOperacionesBD.setObjEstudiante(this.objEstudiante);
            objOperacionesBD.create();
            /*
            System.out.println("Resultado tamaño: "+this.jTextField1.getText().length());//checa de que tamaño es el string
        System.out.println("Resultado Empty: "+this.jTextField1.getText().isEmpty()); //valida cualquier caracter (incluyendo esapcios, si hay espacios NO esta vacio)
        System.out.println("Resultado blank: "+this.jTextField1.getText().isBlank()); //solo acepta caracteres invisibles(si hay espacios marca vacio)
        
        
        //if(!this.validaCamposTextos()){
            
           // return;
        //}   
        
        
        this.validaCamposTextos2();
        objEstudiante =new Estudiante(); //aqui se soluciona el programa
        
        System.out.println("Matricula: "+ this.jTextField1.getText());
        System.out.println("Nombre: "+ this.jTextField2.getText());
        System.out.println("Apellido Paterno: "+ this.jTextField3.getText());
        System.out.println("Apellido Materno: "+ this.jTextField4.getText());
        System.out.println("Edad: "+ this.jTextField5.getText());
        objEstudiante.setMatricula(Integer.parseInt(this.jTextField1.getText()));
        objEstudiante.setNombre(this.jTextField2.getText());
        objEstudiante.setApPaterno(this.jTextField3.getText());
        objEstudiante.setApMaterno(this.jTextField4.getText());
        objEstudiante.setEdad(Integer.parseInt(this.jTextField5.getText()));
        
        //listaEst.add(objEstudiante);
        this.objOpeEstudianteLista.setObjEstudiante(objEstudiante);
        this.objOpeEstudianteLista.create();
        //limpiar();
        //imprimirLista();
             */
             System.out.println("Se ha guardado correctamente en la tabla");
             return;
        }
        if(e.getSource()==this.objEstudianteAlta.botonAltaRegresar){
            
            return;
        }
        //boton de consultar
       /* if (e.getSource() == objEstudianteAlta.jButton2) {
            
                if(objConsulta == null){
                objConsulta = new EstudianteConsulta(this.objOpListaEstudiante);
                objConsulta.setSize(500, 500);
                objConsulta.setVisible(true);
                }else{
                    objConsulta.llenado();
                    objConsulta.setVisible(true);
                }

            /*EstudianteConsulta objConsulta =  new EstudianteConsulta(this.objEstudianteAlta);
            objConsulta.setzi
        }*/
        
    }

    public void limpiar() {
        objEstudianteAlta.jTextField1.setText("");
        objEstudianteAlta.jTextField2.setText("");
        objEstudianteAlta.jTextField3.setText("");
        objEstudianteAlta.jTextField4.setText("");
        objEstudianteAlta.jTextField5.setText("");
    }
    
 
//    public void imprimirLista() {
//        Estudiante objAux;
//        for (int i = 0; i < listaEst.size(); i++) {
//            objAux = listaEst.get(i);
//            System.out.println("Valores del objeto" + (i + 1) + ":");
//            System.out.println("Matricula:" + objAux.getMatricula());
//            System.out.println("Nombre:" + objAux.getNombre());
//            System.out.println("Apellido Paterno:" + objAux.getApPaterno());
//            System.out.println("Apellido Materno:" + objAux.getApMaterno());
//            System.out.println("Edad:" + objAux.getEdad());
//        }
//    }

    /* public void validaCamposTextos2() {
        
        if(!objValidador.validaCajatextoEntero(jTextField1)){
            return;
        }
        if(!objValidador.validaCajatextoCadena(jTextField2)){
            
            
        }
       
        if (!objValidador.validaCajatextoCadena(jTextField3)) {
            return;
        }
        if (!objValidador.validaCajatextoCadena(jTextField4)) {
            return;
        }
        if (!objValidador.validaCajatextoEntero(jTextField5)) {
            return;
        }

        //objValidador.validaCadena(jTextField1.getText());
        
        
        
    }*/
 /*
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;*/

    public MenuEscuela getObjMenuEscuela() {
        return objMenuEscuela;
    }

    public void setObjMenuEscuela(MenuEscuela objMenuEscuela) {
        this.objMenuEscuela = objMenuEscuela;
    }
    
    
    
}
