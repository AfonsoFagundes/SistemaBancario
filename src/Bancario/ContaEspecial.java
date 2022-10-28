package Bancario;

public class ContaEspecial extends ContaCorrente {

	@Override
	public void sacar(double s ) {
		if (s > saldo) {
			System.out.println("Valor não disponivel em conta");
		} else {
			System.out.println("Saque será efetuado");

			this.saldo = (this.saldo -s+s*000.1);
		}
	}

}
