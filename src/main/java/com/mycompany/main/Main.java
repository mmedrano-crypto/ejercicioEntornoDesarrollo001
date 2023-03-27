/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);

        // Mostramos el saldo actual de la cuenta
        System.out.println("El saldo actual es: " + cuenta1.getSaldo());

        // Realizamos una operativa de ingreso y retirada de dinero
        operativa_cuenta(cuenta1, 2300, "retirar");
        operativa_cuenta(cuenta1, 695, "ingresar");
    }

    // Método para realizar operaciones de ingreso y retirada de dinero en una cuenta
    //que engloba las operaciones de la clase Main en su antigua codificación
    //se añade a operativa_cuenta parámetro cantidad tipo float
    public static void operativa_cuenta(CCuenta cuenta, float cantidad, String operacion) {
        try {
            // Realizamos la operación de ingreso o retirada dependiendo del parámetro "operacion"
            if (operacion.equals("ingresar")) {
                cuenta.ingresar(cantidad);
                System.out.println("Se ha ingresado " + cantidad + " euros en la cuenta.");
            } else if (operacion.equals("retirar")) {
                cuenta.retirar(cantidad);
                System.out.println("Se ha retirado " + cantidad + " euros de la cuenta.");
            } else {
                System.out.println("Operación no válida.");
            }

            // Mostramos el saldo actual de la cuenta después de realizar la operación
            System.out.println("El saldo actual es: " + cuenta.getSaldo());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

