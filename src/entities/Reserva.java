package entities;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
	private Suite suite;
	private int quantidadePessoas;
	private int quantidadeDias;
	private List<Hospede> hospedes = new ArrayList<Hospede>();
	
	public Reserva() {
		
	}

	public Reserva(Suite suite, int quantidadePessoas, int quantidadeDias) {
		this.suite = suite;
		this.quantidadePessoas = quantidadePessoas;
		this.quantidadeDias = quantidadeDias;
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
	
	
	
	
	

}
