public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 8;

        String resultado = nota >=7 ? "Aprovado" :
                            nota <7 && nota >=5 ? "Em recuperação" :
                            "Reprovado";
        /*if(nota >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");*/

        System.out.println(resultado);
    }
}
