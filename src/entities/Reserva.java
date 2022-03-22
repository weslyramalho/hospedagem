package entities;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
	private Suite suite;
	private int quantidadePessoas;
	private int quantidadeDias;
	private List<Hospede> hospedes = new ArrayList<>();
	
	public Reserva() {
		
	}

	public Reserva(Suite suite, int quantidadePessoas, int quantidadeDias, List<Hospede> hospedes) {
		this.suite = suite;
		this.quantidadePessoas = quantidadePessoas;
		this.quantidadeDias = quantidadeDias;
		this.hospedes = hospedes;
	}



	public Suite getSuite() {
		return suite;
	}

	public void setSuite(Suite suite) {
		this.suite = suite;
	}

	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}

	public int getQuantidadeDias() {
		return quantidadeDias;
	}

	public void setQuantidadeDias(int quantidadeDias) {
		this.quantidadeDias = quantidadeDias;
	}

	public List<Hospede> getHospedes() {
		return hospedes;
	}

	public void setHospedes(List<Hospede> hospedes) {
		this.hospedes = hospedes;
	}
	
	public boolean verificarCapacidade() {
		if(suite.getCapacidade() >= quantidadePessoas) {
			System.out.println("Hospedagem permitida");
			return true;
		}else {
			System.out.println("ops! Você tentou Hospedar a cima da capacidade maxima");
			return false;
		}
	}
	
	public double calcularDiaria(double total) {
		if(quantidadeDias > 7) {
			total=suite.getValorDiaria() * quantidadeDias;
			double desconto = total * 0.10;
			total = total - desconto;
		}else {
			total = suite.getValorDiaria() * quantidadeDias;
		}
		return total;
	}
	
	
	

}
