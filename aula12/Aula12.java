/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12;

/**
 *
 * @author everton.riquetti
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero m =new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cobra s = new Cobra();
        
        m.setPeso(35.5f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        c.setPeso(80.5f);
        c.setCorPelo("Marrom");
        c.alimentar();
        c.locomover();
        c.emitirSom();
        
       
        s.setCorEscama("Marrom");
        s.alimentar();
        s.locomover();
        s.emitirSom();
    }
    
}
