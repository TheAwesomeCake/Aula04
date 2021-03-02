import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?*/
       
		int idade;
		double media=0;
		int quantidadeAlunos = 0;
		int totalAlunos = 0;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Coloque a quantidade de alunos");
		quantidadeAlunos = in.nextInt();
		
		while (totalAlunos < quantidadeAlunos) {
			System.out.println("Informe a idade do " + (totalAlunos+ 1) + "° aluno");
			idade = in.nextInt();
			media = media + idade;
			totalAlunos++;
		}
		media = media/(double) 2.0;
		
		System.out.println("A média de alunos é " + media);
		
		in.close();
	}

}
