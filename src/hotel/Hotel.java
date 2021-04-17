package hotel;

import quarto.Quarto;
import java.util.Scanner;

/**
 * @author RafaelRodrigues1
 */
public class Hotel {

    public static void status(Quarto[] quarto){
        System.out.println("--------QUARTOS OCUPADOS--------");
        for(Quarto i: quarto){
            if (i!=null){
                System.out.println("Quarto: \t" + i.getNumQuarto());
                System.out.println("Inquilino: \t" + i.getInquilino());
                System.out.println("Email: \t\t" + i.getEmailInq() + "\n");
            }
        }
    }
    
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        Quarto[] quartos = new Quarto[10];
        
        System.out.print("Quantos inquilinos vão entrar? ");
        int n = in.nextInt();
        in.nextLine();
        
        for(int i=0; i<n; i++){
            System.out.println("Inquilino n°" + (i+1));
            System.out.println("Nome: ");
            String nome = in.nextLine();
            System.out.println("Email: ");
            String email = in.nextLine();
            System.out.println("Quarto: ");
            int quarto = in.nextInt();
            in.nextLine();
            quartos[quarto-1] = new Quarto(quarto, nome, email);
        }       
        status(quartos);
    }
}
