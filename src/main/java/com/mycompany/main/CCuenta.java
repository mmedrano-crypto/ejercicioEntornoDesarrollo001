/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
/**
 * Clase que representa una cuenta bancaria. 
 */
public class CCuenta {  
/**Encapsulación de atributos con acceso por getter y setter
 * 
 */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
   /**
     * Crea una cuenta bancaria con los datos especificados.
     * @param nombre El nombre del titular de la cuenta.
     * @param cuenta El número de cuenta bancaria.
     * @param saldo El saldo inicial de la cuenta.
     * @param tipoInteres El tipo de interés de la cuenta.
     */
    public CCuenta() {
    }

    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }
    /**
     * Obtiene el nombre del titular de la cuenta.
     * @return El nombre del titular de la cuenta.  
     * Métodos getter y setter para el atributo nombre
     */
  
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre del titular de la cuenta.
     * @param nombre El nuevo nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el número de cuenta bancaria.
     * @return El número de cuenta bancaria.
     * Métodos getter y setter para el atributo cuenta
     */
    
    public String getCuenta() {
        return cuenta;
    }
    /**
     * Establece el número de cuenta bancaria.
     * @param cuenta El nuevo número de cuenta bancaria.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * Obtiene el saldo actual de la cuenta.
     * @param saldo El nuevo saldo actual de la cuenta.
     *  Métodos getter y setter para el atributo saldo
     */
   
    public double getSaldo() {
        return saldo;
    }
    /**
     * Establece el saldo actual de la cuenta.
     * @param saldo El nuevo saldo actual de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
  /**
     * Obtiene el tipo de interés de la cuenta.
     * @return El tipo de interés de la cuenta.
     * Métodos getter y setter para el atributo tipoInteres
     */
    
    public double getTipoInteres() {
        return tipoInteres;
    }
    /**
     * Establece el tipo de interés de la cuenta.
     * @return El tipo de interés de la cuenta.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    /**
     * @return saldo actual de la cuenta.
     */
    public double estado() {
        return saldo;
    }
     /**
     * Realiza un ingreso en la cuenta.
     * 
     * @param cantidad La cantidad a ingresar.
     * @throws java.lang.Exception
     */
     
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }
    /**
     * Realiza una retirada de fondos en la cuenta.
     * 
     * @param cantidad La cantidad a sacar.
     * @throws java.lang.Exception
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }
}

