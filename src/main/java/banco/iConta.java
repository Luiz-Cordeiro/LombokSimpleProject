package banco;

public interface iConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(iConta contaDestino, double valor);
	
	void imprimirExtrato();

}
