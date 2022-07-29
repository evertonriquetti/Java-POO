/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.myproject.aula05_contabanco;

/**
 *
 * @author everton.riquetti
 */
public class Aula05_ContaBanco {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Caio");
        p1.abrirConta("CC");
        p1.estadoAtual();
    }
}
