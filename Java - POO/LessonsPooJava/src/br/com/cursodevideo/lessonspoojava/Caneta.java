
package br.com.cursodevideo.lessonspoojava;
 
public class Caneta
{
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status()
    {
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Esta tampada ? " + this.tampada);
    }
    public void escrever()
    {
        System.out.println("");
    }
    
    public void rabiscar()
    {
        if (this.tampada == true)
        {
            System.out.println("Erro! Nao posso rabiscar");
        }else{
            System.out.println("Opa! Ja estou rabiscando");
        }  
    }
    
    public void pintar()
    {
        System.out.println("");
    }   
     
    public void tampar()
    {
        this.tampada = true;
        //System.out.println("Caneta tampada");
    }  
      
    public void destampar()
    {
        this.tampada = false;
        //System.out.println("Caneta destampada");
    }     
      
      
      
    
    
            
            
    
}
