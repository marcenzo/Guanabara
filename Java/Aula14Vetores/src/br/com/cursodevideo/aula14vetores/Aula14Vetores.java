/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursodevideo.aula14vetores;

/**
 *
 * @author Apple
 */
public class Aula14Vetores
{ 
    public static void main(String[] args)
    {
        String [] mes = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov", "Dez" };
           int [] dia = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int i=0; i<mes.length; i++)
        {
            System.out.println("O mes " + mes[i] + "  tem " + dia[i]+ "dias no mes");
        }
    }
    
}
