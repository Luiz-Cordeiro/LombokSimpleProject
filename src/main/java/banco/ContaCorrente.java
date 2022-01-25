package banco;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	public void imprimirExtrato() {
		System.out.println("*****Extrato da conta corrente*****");
		super.imprimirInfosComuns();
	}
	
	public String toString() {
		return "Conta corrente";
	}

}
