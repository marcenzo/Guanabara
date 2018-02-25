package br.com.cursodevideo.contabanco;

public class TestContaBanco
{ 
    public static void main(String[] args)
    {
        
        Conta c1 = new Conta();
              c1.setNumconta(1111);
              c1.setDono("Enzo");
              c1.getSaldo();
              c1.getStatus();
              c1.abrirConta("cc");
              c1.depositar(300);
              c1.sacar(200);
              c1.sacar(150);
              c1.FecharConta();
              
              c1.Init(); 
              
        Conta c2 = new Conta();
              c2.setDono("Maisa");
              c2.setNumconta(2222);
              //"c2.setTipo("cp");
              c2.abrirConta("cp");
              c2.depositar(500);
              c2.sacar(400);
              c2.Init();
         
                
              
              
              
              
        
        
  
    }
}
