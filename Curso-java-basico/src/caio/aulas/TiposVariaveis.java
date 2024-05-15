package caio.aulas;
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
          System.out.println(salarioMinimo);

        String meuNome = "Caio Nunes Primo"; //texto
          System.out.println(meuNome);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
          System.out.println(numeroCurto2);

        int numero = 1;
         
            numero = 5;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; //variavel está em caixa alta(todo maisculo)
          System.out.println(VALOR_DE_PI);

        //VALOR_DE_PI = 10; (false)
        //"VALOR_DE_PI" não é mais uma variavel, mas uma constante, ou seja, seu valor não muda
    }
    /*short numeroCurto = 1;
      int numeroNormal = numero curto [é possivel, pois int suporta short]
      shot numeroCurto2 = numeroNormal;[apesar de nesse caso suportar, por que o valor é igual a 1, futuramente irá ocorrer um problema, pois uma variavel tipo short não comporta uma tipo int]
     */
}
