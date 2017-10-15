/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import views.ViewEditorTexto;
import models.ModelEditorTexto;

/**
 *
 * @author mark
 */
public class ControllerEditorTexto {
    private ViewEditorTexto view_editortexto;
    private ModelEditorTexto model_editortexto;
    private FileReader fr = null;
    private JFileChooser jfc = new JFileChooser();
    private FileWriter  fw;
    
    
public ControllerEditorTexto(ModelEditorTexto model_editortexto, ViewEditorTexto view_editortexto){
       this.model_editortexto = model_editortexto;
       this.view_editortexto = view_editortexto;
   //    view_editortexto.jmi_abrir.addActionListener(e -> jmi_abrirclick());
     //  view_editortexto.jmi_guardar.addActionListener(e -> jmi_guardarclick());
       //view_editortexto.jmi_salir.addActionListener(e -> jmi_salirclick());
      

 initView();
}
    
    
    
  private void jmi_abrir(){
  try{
      jfc.showOpenDialog(view_editortexto);
      
      model_editortexto.setArchivo(jfc.getSelectedFile());
      
      fr = new FileReader (model_editortexto.getArchivo());
      int character = 0;
      String texto = "";
      while((character = fr.read())!=-1){
          texto +=(char) character;
      
      }
      fr.close();
      view_editortexto.jta_archivo.setText(texto);
      
  } catch (FileNotFoundException e){
  
      System.err.println("Archivo no encontrado");
  }
  catch(IOException e){
          System.err.println("Error en el archivo");
     }
  finally{
          try{
          fr.close();
          }
          catch(IOException err){
            System.err.println("Error al correr");
          }
          
          }//finally 
  
   }//abrir 
  
    private void jmi_guardar(){
  try{
     fw = new FileWriter(model_editortexto.getArchivo(),false);
     fw.write(view_editortexto.jta_archivo.getText());
     System.out.println("se guardo el archivo sin problema "+ model_editortexto.archivo.getName());
     fw.close();
       } catch (FileNotFoundException e){
  
      System.err.println("Archivo no se pudo guardar ");
  }
  catch(IOException e){
          System.err.println("Error en el archivo");
     }
  finally{
          try{
          fr.close();
          }
          catch(IOException err){
            System.err.println("Error al correr");
          }
          
          }//finally 
  
   }//abrir 
    
    private void jmi_salir(){
     
    
    }
  
  
  

    private void initView() {
 //       this.view_editortexto.setLocationRelativeTo(null);
        this.view_editortexto.setVisible(true);
        
    }
    private void jmi_abrirclick(){
        jmi_abrir();
    
    }
    private void jmi_guardarclick(){
        jmi_guardar();
    }
    private void jmi_salirclick(){
        
      
    }

    
} //class
