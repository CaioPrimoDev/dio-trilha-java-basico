package caio.aulas;

public class AnatomiaClasses {

    public static void main(String [] args) {

      String primeiroNome = "Gleyson"; //variavel
      String segundoNome = "Sampaio"; //variavel
      
      String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
      System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
       return "Resultado do Metodo " + primeiroNome.concat(" ").concat(segundoNome);

    }
    
    }
