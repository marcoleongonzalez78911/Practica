/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers; 
import views.ViewCalcu;
import models.ModelCalcu;

/**
 *
 * @author mark
 */
public class ControllerCalcu {
      private final  ViewCalcu view_calcu;
      private final  ModelCalcu model_calcu;

public ControllerCalcu(ModelCalcu model_calcu,ViewCalcu view_calcu){
    this.view_calcu = view_calcu;
    this.model_calcu = model_calcu;
    
    this.view_calcu.jbtnsuma.addActionListener(e -> this.jbtnsuma_click());
    this.view_calcu.jbtnentre.addActionListener(e -> this.jbtndivision_click());
    this.view_calcu.jbtnpor.addActionListener(e -> this.jbtnpor_click());
    this.view_calcu.jbtnresiduo.addActionListener(e -> this.jbtnresiduo_click());
    this.view_calcu.jbtnresta.addActionListener(e -> this.jbtnmenos_click());
    
    initView();
}
public void initView(){
   view_calcu.jtf_numero1.setText(String.valueOf(model_calcu.getNumero1()));
   view_calcu.jtf_numero2.setText(String.valueOf(model_calcu.getNumero2()));
   view_calcu.jtf_resultado.setText(String.valueOf(model_calcu.getResultado()));
   view_calcu.setVisible(true);
}

public void jbtnsuma_click(){
    model_calcu.setNumero1(Integer.parseInt(view_calcu.jtf_numero1.getText()));
    model_calcu.setNumero2(Integer.parseInt(view_calcu.jtf_numero2.getText()));
    model_calcu.setResultado(Integer.parseInt(view_calcu.jtf_resultado.getText()));
    
    model_calcu.Suma();
    view_calcu.jtf_resultado.setText(String.valueOf(model_calcu.getResultado()));

    
}//jbtsuma
public void jbtndivision_click(){
    model_calcu.setNumero1(Integer.parseInt(view_calcu.jtf_numero1.getText()));
    model_calcu.setNumero2(Integer.parseInt(view_calcu.jtf_numero2.getText()));
    model_calcu.setResultado(Integer.parseInt(view_calcu.jtf_resultado.getText()));
    
    model_calcu.division();
    view_calcu.jtf_resultado.setText(String.valueOf(model_calcu.getResultado()));

    
}//division
public void jbtnpor_click(){
    model_calcu.setNumero1(Integer.parseInt(view_calcu.jtf_numero1.getText()));
    model_calcu.setNumero2(Integer.parseInt(view_calcu.jtf_numero2.getText()));
    model_calcu.setResultado(Integer.parseInt(view_calcu.jtf_resultado.getText()));
    
    model_calcu.por();
    view_calcu.jtf_resultado.setText(String.valueOf(model_calcu.getResultado()));

    
}//por
public void jbtnresiduo_click(){
    model_calcu.setNumero1(Integer.parseInt(view_calcu.jtf_numero1.getText()));
    model_calcu.setNumero2(Integer.parseInt(view_calcu.jtf_numero2.getText()));
    model_calcu.setResultado(Integer.parseInt(view_calcu.jtf_resultado.getText()));
    
    model_calcu.residuo();
    view_calcu.jtf_resultado.setText(String.valueOf(model_calcu.getResultado()));

    
}//residuo

public void jbtnmenos_click(){
    model_calcu.setNumero1(Integer.parseInt(view_calcu.jtf_numero1.getText()));
    model_calcu.setNumero2(Integer.parseInt(view_calcu.jtf_numero2.getText()));
    model_calcu.setResultado(Integer.parseInt(view_calcu.jtf_resultado.getText()));
    
    model_calcu.menos();
    view_calcu.jtf_resultado.setText(String.valueOf(model_calcu.getResultado()));

    
}//menos



   
    
}//class
