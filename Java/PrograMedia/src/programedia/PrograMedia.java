package programedia;
 
import java.util.Scanner;

public class PrograMedia
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Tudo bem com voce?\nDigite o seu do por favor. \nNome: ");
        String usuario = in.nextLine();
        System.out.format("Muito obrigado %s pela gentileza." , usuario);
        
        System.out.print("\nDigite o nome do aluno por favor."  + "\n");
        String aluno = in.nextLine();
        
        System.out.format("Agora %s digite as nota do aluno %s", usuario, aluno + "\n" + "Primeira nota:");
        float n1 = in.nextFloat();
        
        System.out.println("Agora digite a Segunda nota:");
        float n2 = in.nextFloat();

        float media = (n1 + n2)/2;
        
        if(media >= 6 )
        {
          System.out.println("Aprovado com a nota " + media);
        }
        
        if(media < 4)
        {
          System.out.println("Reprovado com a nota " + media);
        }
        
        if(media == 5)
        {
          System.out.println("Você esta de EXAME com a nota " + media);
        }
        
        
    }
    
}
