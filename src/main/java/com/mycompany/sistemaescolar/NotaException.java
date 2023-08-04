/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaescolar;

/**
 *
 * @author die-g
 */
public class NotaException extends Exception {
    public NotaException (String nota){
        super("A Nota " + nota + " Não é um numero");
    }
    
}
