/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject.aula03;

/**
 *
 * @author everton.riquetti
 */
public class Caneta {
    //Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada; 
    
    //Métodos
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Não posso rabiscar!");
        } else {
            System.out.println("Estou Rabiscando!");
        }
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
       this.tampada = false; 
    }
    
    //Estado
    public void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Está tampada? " + this.tampada);
        
    }
}
