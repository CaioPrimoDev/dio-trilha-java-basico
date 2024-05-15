package caio.aulas;

public class OperadoresVS {

    public static void main(String[] args) {
        //String nomeCompleto = "LINGUAGEM" + "JAVA";
        //System.out.println(nomeCompleto);
      /*   String concatenacao = "?";
    
    
               concatenacao = 1 + 1 + 1 + "1";
                 System.out.println(concatenacao);
    
               concatenacao = 1 + "1" + 1 + 1;
                 System.out.println(concatenacao);
               
               concatenacao = 1 + "1" + 1 + "1";
                 System.out.println(concatenacao);
               
               concatenacao = "1" + (1 + 1 + 1);
                 System.out.println(concatenacao); */   
        
          int numero = 5; // 5 = +5
    
          /* numero = numero + 1;     
             =
             numero++;
           */
    
          numero = - numero;
          // numero = numero * -1;
            System.out.println(numero); // 5 = -(+5)
    
          numero = numero * -1; // 5 = -(-5)
    
          System.out.println(numero ++); //o valor não se altera, pois a adição só ocorrerá na proxima linha
            System.out.println(numero); // valor alterado para (numero + 1);
              System.out.println(++ numero); // valor foi alterado antes de ser impresso;
    
          System.out.println(numero --); // o valor não se altera na impressão, pois a subtração só ocorrerá na proxima linha
            System.out.println(numero);  // o valor foi alterado para (numero - 1)
              System.out.println(-- numero); // o valor foi alterado antes de ser impresso
    
          boolean variavel = true;
            variavel = !variavel;

            System.out.println(variavel);

        int a, b;
        a = 5;
        b = 6;

       /*  String resultado = "";

          if(a == b)
             resultado = "verdadeiro";
          else
             resultado = "falso";*/

    //<Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false> 
    // isso é uma expressão boleana, ou seja, sempre é importante saber se a saida é "true" ou "false"
    
        String resultado = a==b ? "verdadeiro" : "falso";
        int resultadoI = a==b ? 1 : 2;

        System.out.println(resultado);
        System.out.println(resultadoI);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
            System.out.println("numero1 é igual a numero2? " + simNao);

            simNao = numero1 != numero2;
            System.out.println("numero1 é diferente de numero2? " + simNao);

            simNao = numero1 > numero2;
            System.out.println("numero1 é maior que numero2? " + simNao);

            simNao = numero1 < numero2;
            System.out.println("numero1 é menor que numero2? " + simNao);

            String nomeUm = "CAIO";
            String nomeDois = new String("CAIO");
            System.out.println(nomeUm.equals(nomeDois));
             // usamos "equals" para comparar objetos ou textos(pois ele compara o conteudo do objeto/texto), e usamos "==" para comparar valores unitarios

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && (condicao2 == false)) {
            System.out.println("As duas condições são verdadeiras");
        } else 
             System.out.println("FIM");

             if(condicao1 || condicao2) {
                System.out.println("Uma das condições é verdadeira");
            } else 
                 System.out.println("FIM");
    }
    
}
 