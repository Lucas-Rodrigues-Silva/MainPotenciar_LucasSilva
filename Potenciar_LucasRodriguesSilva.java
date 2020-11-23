package potenciar_lucasrodriguessilva;
import java.util.Scanner;
/**
 *
 * @author Menino Moleque Luquinha
 */
public class Potenciar_LucasRodriguesSilva {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double Num, Res;
        int i;
        
        System.out.print("Digite um número: ");
        
        Num = entrada.nextInt();
        
        System.out.println("Aqui estão as potências do número até 15: ");
        
        for(i = 1;i <= 15 ; i++){
            
            Res = Math.pow(Num,i);
            
            System.out.println(" "+ Res + " ");
            
        }
        
    }
    
}
