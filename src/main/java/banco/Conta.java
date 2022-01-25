package banco;

import lombok.Getter;

public abstract class Conta implements iConta{
	
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected @Getter int agencia;
	protected @Getter int numero;
	protected @Getter double saldo;
	protected @Getter Cliente cliente;
	


	public Conta(Cliente cliente){
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
		
	}

	@Override
	public void transferir(iConta contaDestino, double valor) {
		// TODO Auto-generated method stub
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular:  %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia:  %d", this.agencia));
		System.out.println(String.format("Numero:  %d", this.numero));
		System.out.println(String.format("Saldo:  %f\n", this.saldo));
		
	}

}
