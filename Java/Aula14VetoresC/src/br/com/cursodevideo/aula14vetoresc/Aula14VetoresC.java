/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursodevideo.aula14vetoresc;
 
import java.util.Arrays;

public class Aula14VetoresC
{ 
    public static void main(String[] args)
    {
        int [] v = new int[10];
        Arrays.fill(v, 0);
        
        for (int i : v)
        {
            System.out.println("valor e: " + i);
        }
    }
    
}
