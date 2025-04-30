package tratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		

		
		try {
			System.out.println("Digite um número: ");
			int numero = sc.nextInt();
			System.out.println("O número digitado foi: " + numero);
		}catch (InputMismatchException e){
			e.printStackTrace();
			System.out.println("Valor inválido, informe um número.");
		}
		int arr[] = new int[5];
		System.out.println(arr[3]);
		
		sc.close();
	}

}
