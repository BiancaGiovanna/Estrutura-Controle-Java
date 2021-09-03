package estruturaControle;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double somaDasNotas = 0;
		double nota = 0;

		
		
		for (int i = 0; i <4; i++) {
			System.out.print("Digite a nota:");
			nota = sc.nextDouble();
			somaDasNotas += nota;
			
		}
		sc.close();
		System.out.printf("A média é  %.2f", somaDasNotas / 3);
	}

}
