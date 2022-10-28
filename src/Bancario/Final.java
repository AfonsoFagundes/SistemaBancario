package Bancario;

import java.util.Scanner;

public class Final {

	public static void main(String[] args) {
		ContaCorrente corrente = new ContaCorrente();
		ContaEspecial especial = new ContaEspecial();
		Poupança poupa = new Poupança();
		Scanner sc = new Scanner(System.in);
        
		System.out.println("\nDADOS DA CONTA CORRENTE!!!");
		System.out.println();
		corrente.setNome("\n: Mike Aparecido Morgan");
		corrente.setConta("\n: 17921-21");
		System.out.println("\nNome" + corrente.getNome());
		System.out.println("\n Qual valor deseja depositar ?");
		corrente.depositar(sc.nextDouble());
		corrente.Versaldo();
		System.out.println("\nQual valor deseja sacar ? ");
		corrente.sacar(sc.nextDouble());
		corrente.Versaldo();
		System.out.println("\nSAQUE REALIZADO!!!");
		System.out.println();
		
		//

		System.out.println("\nDADOS DA CONTA ESPECIAL!!!");
		especial.setNome("\n: Dior Bryan Zild");
		especial.setConta("1721-14");
		System.out.println("\n: Nome "+ especial.getNome());
		System.out.println("\nQual valor deseja depositar ? ");
		especial.depositar(sc.nextDouble());
		especial.Versaldo();
		System.out.println("\nQual valor deseja sacar ? ");
		especial.sacar(sc.nextDouble());
		especial.Versaldo();
		System.out.println("\nSAQUE REALIZADO COM SUCESSO!!!");
		System.out.println();
		
		
		
		////
		
		System.out.println("\nDADOS DA CONTA POUPANÇA!!!");
		poupa.setNome("\n: Leo Oliveira Santos");
		poupa.setConta("17458-10");
		System.out.println("\nNome" + poupa.getNome());
		System.out.println("\nQual valor deseja depositar ? ");
		poupa.depositar(sc.nextDouble());
		poupa.Versaldo();
		System.out.println("\nQual valor deseja sacar ? ");
		poupa.sacar(sc.nextDouble());
		poupa.Versaldo();
		System.out.println("\nSAQUE REALIZADO COM SUCESSO!!!");
		

		

	}

}
