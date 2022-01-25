package banco;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class Banco {
	private @Getter String nome;
	private @Getter List<Conta> contas = new ArrayList<>();

	public void exibirTitularesContas() {
		
		for(Conta contas: contas) {
			System.out.printf("%s%s",contas.getCliente().getNome(), " ---> ");
			System.out.printf("%s\n",contas.toString());
		}
	}
		
	public void inserirConta(Conta conta) {
		contas.add(conta);
	}

	
	public void popularBanco() {
		Cliente clientes[] = new Cliente[10];
		Conta contasCorrente[] = new Conta[10];
		Conta contasPoupanca[] = new Conta[10];
		
		String[] titulares = {"Luiz Felipe Vieira Cordeiro", "Ana Vitória", "José Antunes Mezzanos", "Rodrigo Pisni",
				"Leonardo Cordeiro", "Fernanda Cavalcante", "Rogério Vitorinni", "Victória Rodrigues", 
				"Fernanda Mezzalira Rocha", "Amanda Bianch Goulart"};
		
		
		for(int i = 0; i < clientes.length; i++) {
			clientes[i] = new Cliente(titulares[i]);
			if(i%2 == 0) {
				contasCorrente[i] = new ContaCorrente(clientes[i]);
				inserirConta(contasCorrente[i]);
			}
			else {
				contasPoupanca[i] = new ContaPoupanca(clientes[i]);
				inserirConta(contasPoupanca[i]);
			}
		}
	}
}
