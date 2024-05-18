public class Comentarios {

    public static void main(String[] args) {

        // Olá eu sou um comentario de uma linha

        /* Olá,
         * Eu sou um comentario
         * que posso ser mais detalhadod
         * quando necessário
         */ 
    }
    /** 
         * Estas duas estrelinhas acima
         * é para identificar que você
         * pretende elaborar um comentário
         * a nível de documentação.
         * Que incrível !!!
         * @param alguma coisa
         * @return retorna alguma coisa
         * @since 1850(velho pra karai kkk)
         */ 
        // Documentações ficam logo antes de um bloco, e não dentro dele!

    public void metodo(){ 
      
        System.out.println("Isso é um texte de documentação");

        // Usar comentarios não é justificativa para fazer um trabalho porco, e não obdecer as convenções de escrita!
        // ▼
        int r = 0; // resultado
        int par1 = 2, par2 = 5; // parâmetros 1 e 2

        r = par1 + par2; // soma de dois parâmetros
        System.out.println(r);
    }
    
}
