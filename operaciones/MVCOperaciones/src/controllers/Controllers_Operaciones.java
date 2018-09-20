
package controllers;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import models.Modelo_Operaciones;
import views.Views_Operaciones;
import extras.DataValidation;


public class Controllers_Operaciones {
    private final Modelo_Operaciones modelo_operaciones;
    private final Views_Operaciones views_operaciones;
    DataValidation datavalidation = new DataValidation();
    
    MouseListener ml = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource() == views_operaciones.jbt_suma){
                jbt_suma_actionPerformed();
            }if(e.getSource() == views_operaciones.jbt_resta){
                jbt_resta_actionPerformed();
            }if(e.getSource() == views_operaciones.jbt_multi){
                jbt_multiplicacion_actionPerformed();
            }if(e.getSource() == views_operaciones.jbt_divicion){
                jbt_divicion_actionPerformed();
            }if(e.getSource() == views_operaciones.jbt_por){
                jbt_porcentaje_actionPerformed();
            }
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
        
        }

        @Override
        public void mouseReleased(MouseEvent e) {
       
        }

        @Override
        public void mouseEntered(MouseEvent e) {
          
        }

        @Override
        public void mouseExited(MouseEvent e) {
           
        }
    };
            
    public Controllers_Operaciones(Modelo_Operaciones modelo_operaciones, Views_Operaciones views_operaciones) {
        this.modelo_operaciones = modelo_operaciones;
        this.views_operaciones = views_operaciones;
        this.views_operaciones.jbt_suma.addMouseListener(ml);
        this.views_operaciones.jbt_resta.addMouseListener(ml);
        this.views_operaciones.jbt_multi.addMouseListener(ml);
        this.views_operaciones.jbt_divicion.addMouseListener(ml);
        this.views_operaciones.jbt_por.addMouseListener(ml);
      
    }
    
    public void jbt_suma_actionPerformed(){
        modelo_operaciones.setNumero1(datavalidation.string2Float(views_operaciones.jtf_numero1.getText()));
        modelo_operaciones.setNumero2(datavalidation.string2Float(views_operaciones.jtf_numero2.getText()));
         modelo_operaciones.suma();
         views_operaciones.jtf_resultado.setText(String.valueOf(modelo_operaciones.getResultado()));
    }
      public void jbt_resta_actionPerformed(){
        modelo_operaciones.setNumero1(datavalidation.string2Float(views_operaciones.jtf_numero1.getText()));
        modelo_operaciones.setNumero2(datavalidation.string2Float(views_operaciones.jtf_numero2.getText()));
         modelo_operaciones.resta();
         views_operaciones.jtf_resultado.setText(String.valueOf(modelo_operaciones.getResultado()));
    }
        public void jbt_multiplicacion_actionPerformed(){
        modelo_operaciones.setNumero1(datavalidation.string2Float(views_operaciones.jtf_numero1.getText()));
        modelo_operaciones.setNumero2(datavalidation.string2Float(views_operaciones.jtf_numero2.getText()));
         modelo_operaciones.multiplicacion();
         views_operaciones.jtf_resultado.setText(String.valueOf(modelo_operaciones.getResultado()));
    }
          public void jbt_divicion_actionPerformed(){
        modelo_operaciones.setNumero1(datavalidation.string2Float(views_operaciones.jtf_numero1.getText()));
        modelo_operaciones.setNumero2(datavalidation.string2Float(views_operaciones.jtf_numero2.getText()));
         modelo_operaciones.divicion();
         views_operaciones.jtf_resultado.setText(String.valueOf(modelo_operaciones.getResultado()));
    }
            public void jbt_porcentaje_actionPerformed(){
        modelo_operaciones.setNumero1(datavalidation.string2Float(views_operaciones.jtf_numero1.getText()));
        modelo_operaciones.setNumero2(datavalidation.string2Float(views_operaciones.jtf_numero2.getText()));
         modelo_operaciones.porcentaje();
         views_operaciones.jtf_resultado.setText(String.valueOf(modelo_operaciones.getResultado()));
    }
      public final void initView(){
        views_operaciones.setTitle("Calculadora");
        views_operaciones.setLocationRelativeTo(null);
    }
}
