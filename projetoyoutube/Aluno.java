/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author everton.riquetti
 */
public class Aluno extends Pessoa{
    //Atributos
    private String login;
    private int totAssistido;
    
    public Aluno(String nome, int idade, String sexo, float experiencia, String login){
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totAssistido = 0;
    }
    
    
    //Métodos

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}
