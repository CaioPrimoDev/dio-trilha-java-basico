public class ExemploFor {
	public static void main(String[] args) {
		/*for(int carneirinhos = 1 ; carneirinhos <=8; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}*/

        // Outras estruturas

//estrutura 1
/*for(int carneirinhos = 1 ; carneirinhos <=9; carneirinhos ++) {
    System.out.println(carneirinhos + " - Carneirinho(s)");
}*/

//estrutura 2
//o que importa é somente o bloco condicional
/*int carneirinhos = 1;
for( ; carneirinhos <=10; ) {
    System.out.println(carneirinhos + " - Carneirinho(s)");
    carneirinhos ++;
}*/

//for( somente 1x ; deve ser uma expresão boolean; acontecerá a cada final da execução )


// Também usamos o controle de fluxo for, para interagir sobre arrays e coleções:

String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
// Em arrays, o indice inicia em ZERO

	for (int x = 0; x < alunos.length; x++) {
        // length = "tamanho"
		System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	}
	}
}