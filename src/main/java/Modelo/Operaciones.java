/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Clase encargada de realizar las operaciones
 * @author Jose Luis Soriano Roa
 * @since 15/10/2020
 * @version  1.0.0
 */
public class Operaciones {

    private double numeroUno;
    private double numeroDos;
    
    /**
     * Constuctor de la clase
     * @param numeroUno numero uno de la operacion
     * @param numeroDos numero dos de la operacion
     */
    
    public Operaciones(double numeroUno, double numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }
    
    /**+
     * Retonra el numero uno
     * @return numerouno
     */
    
    public double getNumeroUno() {
        return numeroUno;
    }
    
    /**
     * recibe el numero uno de la operacion
     * @param numeroUno numero uno de la operacion
     */
    public void setNumeroUno(double numeroUno) {
        this.numeroUno = numeroUno;
    }
    /**
     * retorna el numero dos de la operacion
     * @return numero dos de la operacion
     */
    public double getNumeroDos() {
        return numeroDos;
    }
    /**
     * recibe el numero dos de la operacion
     * @param numeroDos 
     */
    public void setNumeroDos(double numeroDos) {
        this.numeroDos = numeroDos;
    }
    public double sumar(){
        return this.numeroDos + this.numeroUno;
    }
    public double restar(){
        return this.numeroDos - this.numeroUno;
    }
    public double multiplicar(){
        return this.numeroDos * this.numeroUno;
    }
    
}
