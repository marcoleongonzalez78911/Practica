/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.ViewOrde;
import models.ModelOrde;


/**
 *
 * @author mark
 */
public class ControllerOrde {
    ViewOrde vieworde;
    ModelOrde modelorde;
    
    public ControllerOrde(ModelOrde modelorde, ViewOrde vieworde){
            this.modelorde = modelorde;
            this.vieworde = vieworde;
    
    }
    
}
