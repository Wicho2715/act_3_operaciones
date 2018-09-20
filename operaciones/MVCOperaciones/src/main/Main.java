/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controllers.Controllers_Operaciones;
import models.Modelo_Operaciones;
import views.Views_Operaciones;

public class Main {
    private static Views_Operaciones views_operaciones;
    private static Modelo_Operaciones modelo_operaciones;
    private static Controllers_Operaciones controllers_operaciones;

    public static void main(String[] args) {
        
       views_operaciones = new  Views_Operaciones();
       modelo_operaciones = new Modelo_Operaciones();
       controllers_operaciones = new Controllers_Operaciones(modelo_operaciones, views_operaciones);
       controllers_operaciones.initView();
       views_operaciones.setVisible(true);
        
        
    }
    
}
