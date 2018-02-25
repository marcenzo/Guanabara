 
package br.com.cursodevideo.pooheranca11a;
 
public class Bolsista extends Aluno
{
    private int bolsa;
    
    public void renovarBolsa()
    {
        System.out.println("Aluno[" + this.getNome() + "] renovando bolsa. \n");

    }
    @Override
    public void pagarMensalidade()
    {
        System.out.println("Aluno[" + this.getNome() + "] pagando mensalidade de BOLSISTA");
    }

    public int getBolsa()
    {
        return bolsa;
    }

    public void setBolsa(int bolsa)
    {
        this.bolsa = bolsa;
    }
    
     @Override
    public String detalhes()
    {
        return super.detalhes() + "\tBolsa= " + this.bolsa;
    }
    
    
}
