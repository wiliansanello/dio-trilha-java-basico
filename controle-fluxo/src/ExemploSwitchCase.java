import java.util.Scanner;
public class ExemploSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma raça de cachorro para saber seu porte: ");
        String breed = sc.next();

        switch(breed){
            case "Fila": {
                System.out.println("Porte grande");
                break;
            }
            case "Pitbull": {
                System.out.println("Porte médio");
                break;
            }
            case "Chihuahua": {
                System.out.println("Porte pequeno");
                break;
            }
            case "Pinscher": {
                System.out.println("Porte mini");
                break;
            }
            default: {
                System.out.println("Raça de cachorro não localizada!");
            }
        }
    }
}
