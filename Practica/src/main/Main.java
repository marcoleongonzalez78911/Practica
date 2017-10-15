/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.*;
import views.*;
import controllers.*;

/**
 *
 * @author mark
 */
public class Main {
     public static void main(String mar[]){
         ModelMayor  model_mayor = new ModelMayor();
         ViewMayor   view_mayor = new ViewMayor();
         ControllerMayor controller_mayor = new ControllerMayor(model_mayor, view_mayor);
         ModelOrde model_orde = new ModelOrde();
         ViewOrde  view_orde = new ViewOrde();
         ControllerOrde controller_orde = new ControllerOrde(model_orde, view_orde);
         ModelCalcu model_calcu = new ModelCalcu();
         ViewCalcu view_calcu = new ViewCalcu();
         ModelEditorTexto model_editortexto = new ModelEditorTexto();
         ViewEditorTexto  view_editortexto = new ViewEditorTexto();
         ControllerEditorTexto controller_editortexto = new ControllerEditorTexto(model_editortexto, view_editortexto);
         
         ControllerCalcu controller_calcu = new ControllerCalcu(model_calcu, view_calcu);
         ModelPrincipal modelp = new ModelPrincipal();
         ViewPrincipal viewp = new  ViewPrincipal();
         Object views[] = new Object[5];
         views[0] = view_mayor;    views[2] = view_editortexto;        views[4] = viewp;
         views[1] = view_orde;     views[3] = view_calcu; 
         
         ControllerPrincipal controllerp = new ControllerPrincipal(modelp, views);
         
    
    
    }
}
