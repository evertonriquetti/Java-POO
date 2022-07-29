/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author everton.riquetti
 */
public class ListaObjeto implements Comparable<ListaObjeto>{
    private String titulo;
    private int tempo;
    
    public ListaObjeto(String titulo, int tempo){
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "[ListaObjeto: " + this.titulo + ", " + this.tempo + " minutos]";
    }
    
    @Override
    public int compareTo(ListaObjeto outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }
    
}
