package Matriz;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos alunos existem na classe?");
		int quantidadeAluno = entrada.nextInt();
		System.out.println("Quantas notas cada aluno tera?");
		int quantidadeNota = entrada.nextInt();
		int total = 0;
		int [][] quantidadeTotal = new int[quantidadeAluno] [quantidadeNota];
		
		for (int a = 0; a < quantidadeTotal.length; a++) {
			for (int n = 0; n < quantidadeTotal[a].length; n++) {
				System.out.printf("Digite a nota %d do aluno %d",n,a);
				quantidadeTotal [a][n] = entrada.nextInt();
				total += quantidadeTotal[a][n];
			}
			
			int media = total / (quantidadeAluno * quantidadeNota);
			System.out.println(media);		
		}
		
		entrada.close();
		
		
	}
	

}
