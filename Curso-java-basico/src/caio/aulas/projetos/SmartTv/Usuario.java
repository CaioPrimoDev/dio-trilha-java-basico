package caio.aulas.projetos.SmartTv;

public class Usuario {

    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(17);

          System.out.println("TV ligada : " + smartTv.ligada); 
          System.out.println("Canal atual : " + smartTv.canal);
          System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();

          System.out.println("Novo status -> TV ligada : " + smartTv.ligada);

    }
    
}