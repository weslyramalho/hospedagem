package programa_principal;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;
import javax.management.openmbean.OpenMBeanConstructorInfo;

import entities.Hospede;
import entities.Reserva;
import entities.Suite;


public class Main {

	public static void main(String[] args) {
		
		Hospede h1 = new Hospede(1, "Alberto", "São pAULO", 30);
		Hospede h2 = new Hospede(2, "ANA", "Maranhão", 20);
		Hospede h3 = new Hospede(3, "Maria", "Para", 100);
		Hospede h4 = new Hospede(4, "Bia", "Aracaju", 90);
		
		Suite s1 = new Suite(1, "Casal", 2, 250.50);
		Suite s2 = new Suite(2, "Solteiro", 1, 150.50);
		Suite s3 = new Suite(3, "Mista", 4, 400.00);
		
	


		private List<Hospede> hospedes = new ArrayList<>();
		
			

		Reserva reserva = new Reserva();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("###################################");
		System.out.println("#=========== Hotel Cabum =========#");
		int opc= 0;
		while(opc != 2 ) {
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Reservar vaga");
			System.out.println("2- sair");
			
			opc = scanner.nextInt();
			
			switch (opc) {
			case 1: {
				System.out.println("Quantas pessoas ficarão hospedadas?");
				int quantidadePessoas = scanner.nextInt();
				for (int i = 1; i <= quantidadePessoas; i++) {
					System.out.println("Codigo do hospede: ");
					int codigo = scanner.nextInt();
					System.out.println("Nome: ");
					String nome = scanner.next();
					System.out.println("Endereço: ");
					String endereco = scanner.next();
					System.out.println("idade: ");
					int idade =  scanner.nextInt();
					
					Hospede hospedes = new Hospede(codigo, nome, endereco, idade);
					r
					
					
					
				}
				System.out.println("Qual a suite? ");
				Suite suite = s1;
				System.out.println("Quantos dias prentende ficar Hospedado? ");
				int quantidadeDias = scanner.nextInt();
				break;
			}
			default:
				System.out.println("Valor invalido");
				break;
			}

		}

	}


}
