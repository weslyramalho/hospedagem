package programa_principal;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("###################################");
		System.out.println("#=========== Hotel Cabum =========#");
		
		int opc;
		do {
			System.out.println("1 - Rservar");
			System.out.println("2 - cadsatrar Hospede");
			System.out.println("0 - sair");

			opc = scanner.nextInt();
		} while (opc != 0 );

	}

}
