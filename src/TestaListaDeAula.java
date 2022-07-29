
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author everton.riquetti
 */
public class TestaListaDeAula {
    public static void main(String[] args) {
        ListaObjeto a1 = new ListaObjeto("Revisitando as ArrayLists", 21);
        ListaObjeto a2 = new ListaObjeto("Listas de objetos ", 20);
        ListaObjeto a3 = new ListaObjeto("Relacionamento de listas e objetos", 15);
        
        ArrayList<ListaObjeto> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        
        //antes de ordenar
        System.out.println(aulas);
        
        Collections.sort(aulas);
        
        //depois de ordenar
        System.out.println(aulas);
        
        Collections.sort(aulas, Comparator.comparing(ListaObjeto::getTempo));
        
        System.out.println(aulas);
        
        aulas.sort(Comparator.comparing(ListaObjeto::getTempo));
        
        System.out.println(aulas);
        
        
    }
}
