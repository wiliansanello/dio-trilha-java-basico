public class SmartTv{
    boolean ligada = false;
    int canal = 2;
    int volume = 25;

    public void setVolume(String opcao){
        if ( opcao == "aumentar"){
            if (volume <= 50){
                volume++;
            }
        } else if ( opcao == "diminuir") {
            if (volume >= 0){
                volume--;
            }
        }        
        System.out.println("Volume : "+volume);
    }

    public int getVolume(){
        return this.volume;
    }

       
    public void setLigada( boolean estaLigada){
        this.ligada = estaLigada;
    }

   public boolean getLigada(){
    return this.ligada;
   }

    public void setCanal(String opcao){
        if (opcao == "proximo"){
            canal++;
        } else if (opcao == "anterior"){
            canal--;
        }
        System.out.println("Você mudou para o canal "+this.canal);
    }  
    
    public int getCanal(){
        return this.canal;
    }

    public void mudarParaCanalDigitado(int canalDigitado){
        canal = canalDigitado;
        System.out.println("Você mudou para o canal " +canal);
    }
}