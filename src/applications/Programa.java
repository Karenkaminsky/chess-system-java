package applications;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Programa {

	public static void main(String[] args) {
		//stack -Use para variáveis locais e execução de metodos
		//heap - Use para armazenar objs ou dados que precisam durar além do escopo de um metodo
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n]; //Estanciando adicionando como variável o vetor
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);

		}
		
		double sum = 0.0;
			for(int i=0; i<vect.length; i++) {
				sum += vect[i].getPrice();
			}
			
			double avg = sum / vect.length;
			
			System.out.printf("AVERAGE PRICE = %.2%n", avg);
		
		sc.close();

	}

}
