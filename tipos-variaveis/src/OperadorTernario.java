public class OperadorTernario {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 6;
        
        boolean resultado;
        boolean resultadoTernario = a == b ? true : false;

        if (a == b){
            resultado = true;
        } else {
            resultado = false;
        }

        System.out.println(resultado);
        System.out.println(resultadoTernario);

    }    
}
