/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject.aulapoo;

/**
 *
 * @author everton.riquetti
 */
public class Caneta {
    //Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada; 
    
    //Métodos
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Não posso rabiscar!");
        } else {
            System.out.println("Estou Rabiscando!");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
       this.tampada = false; 
    }
    
    //Estado
    void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Está tampada? " + this.tampada);
        
    }
}
