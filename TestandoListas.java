import java.util.ArrayList;

/**
 *
 * @author everton.riquetti
 */
public class TestandoListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String aula1 = "Modelando a classe aula";
        String aula2 = "Conhecendo mais lista";
        String aula3 = "Trabalhando com cursos e Sets";
        
        //Adicionando elementos na lista
        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        
        //for para percorrer a lista
        for (String aula : aulas){
            System.out.println("Aula: " + aula);
        }
        
        /*Remover elementos 
        *aulas.remove(0);
        *System.out.println(aulas);
        */
        
        /*Acessar elemntos (usando método get)
        *String primeiraAula = aulas.get(0);
        *System.out.println("A primeira aula é " + primeiraAula);
        */
        
        /*Percorrer usando o size
        *for (int i = 0; i < aulas.size(); i++) {
        *System.out.println("aula : " + aulas.get(i));
        *}
        */
        
        /* ForEach do Java 8 (lambda)
        *aulas.forEach(aula -> {
        *System.out.println("Percorrendo:");
        *System.out.println("Aula " + aula);
        *});
        */
        
        /*Ordenar lista
        *import java.util.Collections;
        *Collections.sort(aulas);
        *System.out.println("Depois de ordenado:");
        *System.out.println(aulas);
        *
        */
        
    }
}
