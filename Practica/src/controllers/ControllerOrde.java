/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultListModel;
import views.ViewOrde;
import models.ModelOrde;


/**
 *
 * @author mark
 */
public class ControllerOrde {
    DefaultListModel models = new DefaultListModel();
    List<Integer> lista = new ArrayList();
    ViewOrde vieworde;
    ModelOrde modelorde;
    
    public ControllerOrde(ModelOrde modelorde, ViewOrde vieworde){
            this.modelorde = modelorde;
            this.vieworde = vieworde;
            vieworde.jbtn_agregar.addActionListener(e -> this.jbtn_agregar_click());
            vieworde.jbtn_asc.addActionListener(e -> this.jbtn_asc_click());
            
            
            
            initView();
    
    }//final del contructor 
    
    public void initView(){
    vieworde.setVisible(true);
     }//final del initView
    
    public void jbtn_agregar_click(){
     modelorde.setNum(Integer.parseInt(vieworde.jtf_valor.getText()));
        models.addElement(modelorde.getValor());
        lista.add(modelorde.getValor());
        vieworde.jl_lista.setModel(models);
    }//final del boton de agregar
    
    public void jbtn_asc_click(){
            models.removeAllElements();
        Collections.sort(lista);
        for (int i=0; i<lista.size();i++){
            Integer val = lista.get(i);
            models.addElement(val);
        } 
    
    
    }
    
    
    
    
    
}//final de la clase
