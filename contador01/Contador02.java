/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject.contador01;

/**
 *
 * @author everton.riquetti
 */
public class Contador02 {
    public static void main(String[] args) {
        int cc = 0;
        while (cc<10){
            cc++;
            if (cc == 5 ||cc == 7 || cc == 9){
                continue;
            }
            System.out.println(cc); 
        }
    }
}
