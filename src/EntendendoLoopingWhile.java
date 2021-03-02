import java.util.Scanner;

public class EntendendoLoopingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		double media=0;
		int quantidadeAlunos = 0;
		Scanner leitor = new Scanner(System.in);
		
		while(quantidadeAlunos < 5) {
			System.out.println("Informe a idade do " + (quantidadeAlunos+ 1) + "° aluno");
			idade = leitor.nextInt();
			media = media +idade;
			quantidadeAlunos++;
		}
		media = media/5.0;
		
		System.out.println("A medias das idades é" + media);
		
		leitor.close();
	}

}
