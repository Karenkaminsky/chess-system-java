package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt(); //Lendo um número inteiro n, que representa o tamanho do vetor.
		double[] vect = new double[n];
		
		//criando os vetores usando o laço for;
		for(int i=0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = sc.nextDouble(); //Armazena no vetor na posição correspondente o número decimal.
		}
		
		//Declaro e inicio a variável sum para armazenar a soma dos números
		double sum = 0.0;
		for(int i=0; i<n; i++) { //O laço percorre cada posição do vetor e adiciona seu valor à variável sum.
			sum += vect[i];
			
		}
		
		//Calcula a média dos números dividindo a soma total pelo número de elementos no vetor.
		double avg = sum / n;
		
		System.out.printf("Average height: %.2f%n", avg);
		

		sc.close();
	}

}
