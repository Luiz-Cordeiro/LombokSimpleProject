package banco;

import lombok.Getter;

public class Cliente {
	private @Getter String nome;
	
	public Cliente(String nome) {
		this.nome = nome;
	}	
}
