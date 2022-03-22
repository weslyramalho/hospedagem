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
		
		List<Hospede> hospedes = new ArrayList<Hospede>();
		
		Reserva reserva = new Reserva();
		
	  
		
			

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("###################################");
		System.out.println("#=========== Hotel Cabum =========#");
		int opc= 0;
		while(opc != 3 ) {
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Reservar vaga");
			System.out.println("2-Fechar conta");;
			System.out.println("3- sair");


			
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
					int idade = scanner.nextInt();
					
					Hospede hospede = new Hospede(codigo, nome, endereco, idade);
					hospedes.add(hospede);
				}
				System.out.println("Qual o numero da suite ");
				int numero = scanner.nextInt();
				System.out.println("qual o tipo da suite: ");
				String tipo =scanner.next();
				System.out.println("Qual a capacidade da suite: ");
				int capacidade = scanner.nextInt();
				System.out.println("Valor da diaria: ");
				double valorDiaria = scanner.nextDouble();
				
				Suite suite = new Suite(numero, tipo, capacidade, valorDiaria);
				
				System.out.println("Quantos dias prentende ficar Hospedado? ");
				int quantidadeDias = scanner.nextInt();
				
				reserva = new Reserva(suite, quantidadePessoas, quantidadeDias, hospedes);
				break;
			}
			case 2: {
				double total = 0;
				System.out.println("**** Total diarias ****");
				System.out.println("numero " + reserva.getSuite());
				System.out.println("Quntedade de pessoas: " + reserva.getQuantidadePessoas());
				System.out.println("Foram "+ reserva.getQuantidadeDias() + " diarias");
				System.out.println("O valor total a pagar é: " + reserva.calcularDiaria(total));
				
			}
			default:
				System.out.println("Valor invalido");
				break;
			}

		}

	}


}
