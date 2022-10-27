import java.util.Scanner;

public class ValorCarroDeFabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int valor, conta, conta2, conta3;
		double consumidor, impostos;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor do carro : ");
		valor=ler.nextInt();
		
		
		System.out.print("Digite a porcentagem do consumidor : ");
		consumidor=ler.nextDouble();
		System.out.print("Digite a porcentagem do imposto : ");
		impostos=ler.nextDouble();
		
		conta=valor*28/72;
		conta2=conta*48/52;
		
		
		
		
		System.out.println("A porcentagem do consumidor é de" + conta);
		System.out.println("A porcentagem do imposto é de " + conta2);
		System.out.println("O valor de fabrica do carro é ");
		
		
		
		
		
		
		
		
		
		
		
	}

}
