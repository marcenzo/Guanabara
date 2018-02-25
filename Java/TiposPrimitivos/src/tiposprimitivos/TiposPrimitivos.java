package tiposprimitivos;
 
import java.time.LocalDate;
import java.util.Scanner;

public class TiposPrimitivos {
 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Tudo bem com voce?\nDigite o seu do por favor.");
        String usuario = teclado.nextLine();
        System.out.format("Muito obrigado %s pela gentileza." , usuario);
       
        System.out.print("\nDigite o nome do aluno por favor."  + "\n");
        String aluno = teclado.nextLine();

        System.out.format("Agora %s digite a nota do aluno %s", usuario, aluno + "\n");
        float nota = teclado.nextFloat();
       
        System.out.format("Sr ou Sra, %s a nota do aluno %s é %.1f: ", usuario, aluno, nota);

        LocalDate hoje = LocalDate.now();
        System.out.println("A data de hoje é:" + hoje);
 
    }
    
}
