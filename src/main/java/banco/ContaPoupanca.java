package banco;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	public void imprimirExtrato() {
		System.out.println("*****Extrato da conta poupança*****");
		super.imprimirInfosComuns();
	}
	
	public String toString() {
		return "Conta poupança";
	}
	
}
