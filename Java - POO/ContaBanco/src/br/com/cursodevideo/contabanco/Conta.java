package br.com.cursodevideo.contabanco;
 
public class Conta  
{
    public int numConta;
    protected String tipo;
    private String dono;
    private boolean status;
    private float saldo;
    
    public Conta()
    {
        this.saldo = 0;
        this.status = false;
    }
    
    public void Init()
    {
          System.out.println("----------------------------------------------------------");
          System.out.println("Output:\n\n[Conta]\nStatus [" + this.getStatus()   + "]" + 
                                                "\nNumConta [" + this.getNumconta() + "]" +
                                                    "\nTipo [" + this.getTipo()     + "]" +
                                                    "\nDono [" + this.getDono()     + "]" + 
                                                   "\nSaldo [" + this.getSaldo()    + "]" ); 
    }
             
    public void abrirConta(String t)
    {
        this.setTipo(t);
        this.setStatus(true);
        
        if(t == "cc")
        {
            this.setSaldo(50); 
        }
        else if(t == "cp")
        {
            this.setSaldo(150);
        }
            System.out.println("Conta aberta com SUCESSO");
    }
    
    public void FecharConta()
    {
        if(this.getSaldo() > 0)
        {
            System.out.println("Conta com valor a ser SACADO");
        }
        else if(this.getSaldo() < 0)
        {
            System.out.println("Conta NEGATIVA procure seu gerente");
        }else{
            this.setStatus(false);
            System.out.println("Conta FECHADA com SUCESSO");

        }
    }
     
    public void depositar(float valorDepositado)
    {
        if(this.getStatus())
        {
            this.setSaldo(getSaldo() + valorDepositado); 
            System.out.println("Deposito realizado como SUCESSO, na conta de " + this.getDono());
        } else {
            System.out.println("Opa! Parece que sua conta esta INATIVA, procure seu gerente");
        }
    }
      
    public void sacar(float valorSacar)
    {
        if(this.getStatus()) 
        {
            if(this.getSaldo() >= valorSacar)
            {
                this.setSaldo(this.getSaldo() - valorSacar);
                System.out.println("SAQUE realizado com SUCESSO na conta do cliente " + this.getDono());
            }
        } else {
              System.out.println("Opa! NAO sera possivel realizar seu SAQUE.");
        }
    } 
      
    public void pagarMensal()
    {
        float mensalidade = 0;
        //{
            if(this.getTipo() == "cc")
            {
                mensalidade = 12;
                //this.setSaldo(this.getSaldo() - mensalidade);
            }else if(this.getTipo() == "cp")
            {
                mensalidade = 20;
                //this.setSaldo(this.getSaldo() - mensalidade);
            }
            if(this.getStatus())
            {
                this.setSaldo(this.getSaldo() - mensalidade);
                System.out.println("Oba! mensalidade paga com SUCESSO por " + this.getDono());
            } else {
                System.out.println("Opa! não foi possivel pagar a mensalidade, conta INATIVA");

            }
         
    }
    
    int getNumconta()
    {
         return this.numConta;
    }
    
    void setNumconta(int c)
    {
        this.numConta = c;
    }
    
    String getTipo()
    {
        return this.tipo;
    }
    
    void setTipo(String t)
    {
        this.tipo = t;
    }
    
    String getDono()
    {
        return this.dono;
    }
    
    void setDono(String d)
    {
        this.dono = d;
    }
    
    float getSaldo()
    {
        return this.saldo;
    }
    
    void setSaldo(float s)
    {
        this.saldo = s;
    }
    
    boolean getStatus()
    {
        return this.status;
    }
    
    void setStatus(boolean st)
    {
        this.status = st;
    }
}

 
 