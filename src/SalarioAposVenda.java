import java.util.Scanner;

public class SalarioAposVenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Float porcentagem, conta;
		int salario, carros;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite seu salario fixo : ");
		salario=ler.nextInt();
		System.out.print("Quantos carro você vendeu :  ");
		carros=ler.nextInt();
		System.out.print("Digite sua Porcentagem por carros vendidos : ");
		porcentagem=ler.nextFloat();
		
		conta=carros*porcentagem;
		conta=conta+salario;
		
		System.out.println("O seu salario fixo mais sua porcentagem por venda é " + conta + "R$" + "Reais");
	}

}
