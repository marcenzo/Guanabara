/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursodevideo.aula14vetoresb;
 
import java.util.Arrays;

public class Aula14VetoresB
{ 
    public static void main(String[] args)
    {
        int [] vet = {11, 2, 53, 14, 95,10, 64};
       // Arrays.sort(n);          
        for (int v : vet)
        {
            System.out.println("valor e: " + v); 
        }
        System.out.println(" ");
        int p = Arrays.binarySearch(vet, 14);
        System.out.println("valor na posicao: " + p);
    }
    
}
