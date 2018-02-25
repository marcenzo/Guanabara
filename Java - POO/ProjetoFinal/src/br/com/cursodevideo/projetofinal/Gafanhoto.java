/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursodevideo.projetofinal;

/**
 *
 * @author Apple
 */
public class Gafanhoto extends Pessoa
{
    private String login;
    private int toAssistindo;

    public Gafanhoto(String nome, String sexo, String experiencia, int idade, String login, int toAssistindo)
    {
        super(nome, sexo, experiencia, idade);
        this.toAssistindo = 0;
        this.login = login;
    }
 
    public void viuMaisUm()
    {
     this.setToAssistindo(this.getToAssistindo() + 1);
    }

    @Override
    protected void ganharExp()
    {
        
    }

    public String getLogin()
    {
        return login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public int getToAssistindo()
    {
        return toAssistindo;
    }

    public void setToAssistindo(int toAssistindo)
    {
        this.toAssistindo = toAssistindo;
    
    }
    
    @Override
    public String toString()
    {
        return super.toString() +  "\tLogin=  " + login + "\ttoAssistindo= " + toAssistindo + "\n";
    }
}
