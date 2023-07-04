import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        Scanner sc = new Scanner(System.in);

        boolean tvLigada = smartTv.getLigada();
        
        String estadoTv = tvLigada?  "ligada" : "desligada";
        String sinalParaMudarEstadoTv = "";

        System.out.println("Olá! Sua TV está "+ estadoTv);

        if(!tvLigada){
            System.out.println("Deseja ligar a TV agora? (S/N): ");
            sinalParaMudarEstadoTv = sc.next();
        }

        if (sinalParaMudarEstadoTv.equals("S")){
            smartTv.setLigada(true);
            System.out.println("Agora a TV está ligada");
            System.out.println("O canal atual é o "+smartTv.getCanal()+" e o volume é "+smartTv.getVolume());
        } 
        sc.close();
        
    }
}
