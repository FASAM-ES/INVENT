/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasam.figurasgeometricasapp;

import TrianguloKhalil;

/**
 *
 * @author carlos
 */

public class FiguraMain {
    public static void main(String[] args){
        System.out.println("Bora Trabalhaaaaarrrrrrr");

        
        TrianguloKhalil t = new TrianguloKhalil(4,8,10);
        System.out.print("Area do triangulo: ");        
        System.out.println(t.calulaArea());


        System.out.println("VTC");

    }
}
