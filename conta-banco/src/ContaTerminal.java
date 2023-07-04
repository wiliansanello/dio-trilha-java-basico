import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da conta");
        numero = sc.nextInt();
        
        System.out.println("Por favor, digite o número da agência");
        agencia = sc.next();
        
        System.out.println("Por favor, digite seu nome");
        nomeCliente = sc.next();
        
        System.out.println("Por favor, digite o saldo da sua conta");
        saldo = sc.nextDouble();

        System.out.println("Olá ".concat(nomeCliente) + 
            "! obrigado por criar uma conta no Iglu Bank, sua agência é " .concat(agencia) +
            ", conta " .concat(String.valueOf(numero)) + "e seu saldo " .concat(String.valueOf(saldo)) +
            " já está disponível! " 
        );
        
        sc.close();
    }
}
