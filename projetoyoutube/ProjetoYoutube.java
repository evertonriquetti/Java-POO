/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author everton.riquetti
 */
public class ProjetoYoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa Principal
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 6 de POO");
        v[2] = new Video("Aula 11 de POO");
        
        Aluno a[] = new Aluno[2];
        a[0] = new Aluno("Caio", 5, "M", 1.0f, "caio");
        a[1] = new Aluno("Everton", 38, "M", 1.0f, "everton");
        
        Visualizacao vis = new Visualizacao(a[0],v[2]);
        System.out.println(vis.toString());
    }
    
}
