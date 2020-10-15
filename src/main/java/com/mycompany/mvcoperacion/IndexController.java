/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvcoperacion;
import Modelo.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Jose Luis
 * @author Sergio Sabogal
 * @since 15/10/2020
 * @version 1.0.0
 */
public class IndexController implements Initializable {

    @FXML
    private TextField num1;
    @FXML
    private TextField num2;
    @FXML
    private Label resultado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    /**
     * Este metodo se encarga de hacer las operaciones de Suma
     * @param event 
     */
    @FXML
    private void sumar(ActionEvent event) {
        try{
            validar();
            double numero1 =    Double.parseDouble(num1.textProperty().get());
            double numero2 =    Double.parseDouble(num2.textProperty().get());
            resultado.setText( new Operaciones(numero1, numero2).sumar()+ " ");
            
        }catch(ArithmeticException ex){
            resultado.setText("Error en datos");    
        }catch(Exception exi){
            resultado.setText("Error en datos");    
        } 
    }
     /**
     * Este metodo se encarga de hacer las operaciones de Resta
     * @param event 
     */
    @FXML
    private void Restar(ActionEvent event) {
        try{
            validar();
            double numero1 =    Double.parseDouble(num1.textProperty().get());
            double numero2 =    Double.parseDouble(num2.textProperty().get());
            resultado.setText( new Operaciones(numero1, numero2).restar()+ " ");
            
        }catch(ArithmeticException ex){
            resultado.setText("Error en datos");    
        }catch(Exception exi){
            resultado.setText("Error en datos");    
        }
    }

    /**
     * Este metodo se encarga de hacer las operaciones de Multiplicar
     * @param event 
     */
    @FXML
    private void Multiplicar(ActionEvent event) {
        try{
            validar();
            double numero1 =    Double.parseDouble(num1.textProperty().get());
            double numero2 =    Double.parseDouble(num2.textProperty().get());
            resultado.setText( new Operaciones(numero1, numero2).multiplicar()+ " ");
        }catch(ArithmeticException ex){
            resultado.setText("Error en datos");    
        }catch(Exception exi){
            resultado.setText("Error en datos");    
        }
    }
    /**
     * Este metodo se encarga de hacer la validación de los campos para que no esten vacios
     * @param event 
     */
    public void validar(){
        if(num1.textProperty().get().isEmpty() || num2.textProperty().get().isEmpty()){
            resultado.setText("ingresa los datos");    
        }
    }
    
}
