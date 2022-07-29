/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.myproject.vetor01;

import java.util.Arrays;

/**
 *
 * @author everton.riquetti
 */
public class Vetor01 {

    public static void main(String[] args) {
        int n[] = {3,2,7,8,5,4};
        //ordenar vetor
        Arrays.sort(n);
        for (int valor : n){
            System.out.println(valor);
        }
    }
}
