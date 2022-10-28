package Bancario;

public class ContaCorrente {

	private String nome;
	private String conta;
	protected double saldo;
	
	

	public void Versaldo() {
		System.out.println("Valor do seu saldo em conta " + this.saldo );
	}

	public void depositar(double d) {

		this.saldo +=d;
	}

	public void sacar(double s) {

		if (s > saldo) {
			System.out.println("Valor não disponivel em conta!!!");
		} else {
			System.out.println("Saque será efetuado");

			this.saldo = this.saldo-s+s*000.5;
			
			System.out.println("Valor sacado " + s);
			
		
		
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}
    public void getConta (String conta) {
    	this.conta = conta;
    }
}
