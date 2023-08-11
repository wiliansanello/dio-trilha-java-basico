import java.util.concurrent.ThreadLocalRandom;
public class PagamentoNoCaixa {
    public static void main(String[] args) {

        double balance = 100.0;
        while(balance > 0){
            Double itemValue = randomValue();

            System.out.println("Valor disponível: " + balance);
            System.out.println("Valor do item: " + itemValue);
            if(itemValue > balance) {
                System.out.println("Você não tem saldo o suficiente para continuar comprando");
                break;
            } else {
                System.out.println("Item inserido no carrinho");
            }

            balance = balance - itemValue;
        }
        System.out.println("Valor restante: " + balance);
    }
    private static double randomValue() {
        return ThreadLocalRandom.current().nextDouble(1,50);
    }
}
