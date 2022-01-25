package banco;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Conta>contasDisponiveis = new ArrayList<>();
		Banco banco = new Banco();
		
		banco.popularBanco();
		contasDisponiveis = banco.getContas();
		
		Conta ContaDestino = contasDisponiveis.get(0);
		Conta ContaRemetente = contasDisponiveis.get(7);
		
		ContaRemetente.depositar(10000.00);
		ContaRemetente.imprimirExtrato();
		ContaDestino.imprimirExtrato();
		ContaRemetente.transferir(ContaDestino, 1500.00);
		ContaRemetente.imprimirExtrato();
		ContaDestino.imprimirExtrato();
		
	}

}
