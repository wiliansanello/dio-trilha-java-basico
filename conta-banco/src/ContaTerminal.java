import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da conta");
        int numero = sc.nextInt();
        
        System.out.println("Por favor, digite o número da agência");
        String agencia = sc.next();
        
        System.out.println("Por favor, digite seu nome");
        String nomeCliente = sc.next();
        
        System.out.println("Por favor, digite o saldo da sua conta");
        double saldo = sc.nextDouble();

        System.out.println("Olá ".concat(nomeCliente) + 
            "! obrigado por criar uma conta no Iglu Bank, sua agência é " .concat(agencia) +
            ", conta " .concat(String.valueOf(numero)) + " e seu saldo " .concat(String.valueOf(saldo)) +
            " já está disponível! " 
        );
        
        sc.close();
    }
}
