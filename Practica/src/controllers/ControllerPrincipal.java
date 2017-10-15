/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import views.*;
import models.*;

/**
 *
 * @author mark
 */
public class ControllerPrincipal {
    private ModelPrincipal modelp;
    private ViewPrincipal viewp;
    private ViewMayor view_mayor;
    private ViewOrde vieworde;
    private ViewEditorTexto vet;
    private ViewCalcu view_calcu;
    private ControllerPrincipal controllerp;
    
     
    public ControllerPrincipal(ModelPrincipal modelp, Object views[]){
            this.modelp = modelp;
            this.viewp = (ViewPrincipal) views[4];
            this.view_mayor = (ViewMayor) views[0];
            this.vieworde = (ViewOrde) views[1];
            this.vet = (ViewEditorTexto) views[2];
            this.view_calcu = (ViewCalcu) views[3];
            
            viewp.jmi_mayor.addActionListener(e -> jmi_mayorActionPerformed());
            viewp.jmi_ordenar.addActionListener(e -> jmi_ordenarActionPerformed());
            viewp.jmi_bloc.addActionListener(e -> jmi_blocActionPerformed());
            viewp.jmi_operaciones.addActionListener(e -> jmi_operacionesActionPerformed());
            
            initView();
            
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewp.jmi_mayor)
            jmi_mayorActionPerformed();
        if(e.getSource()==viewp.jmi_ordenar)
           jmi_ordenarActionPerformed();
        if(e.getSource()==viewp.jmi_bloc)
           jmi_blocActionPerformed();
        if(e.getSource()==viewp.jmi_operaciones)
           jmi_operacionesActionPerformed();
    }
    public void jmi_mayorActionPerformed(){
        this.viewp.setContentPane(view_mayor);
        this.viewp.revalidate();
        this.viewp.repaint();
    }
    
     public void jmi_ordenarActionPerformed(){
        this.viewp.setContentPane(vieworde);
        this.viewp.revalidate();
        this.viewp.repaint();
    }
      public void jmi_blocActionPerformed(){
        this.viewp.setContentPane(vet);
        this.viewp.revalidate();
        this.viewp.repaint();
      }
      
       public void jmi_operacionesActionPerformed(){
        this.viewp.setContentPane(view_calcu);
        this.viewp.revalidate();
        this.viewp.repaint();
      }
       
       private void initView(){
       this.viewp.setLocationRelativeTo(null);
       this.viewp.setVisible(true);
    }
     
  
}//class 
