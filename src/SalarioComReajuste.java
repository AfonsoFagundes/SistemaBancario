import java.util.Scanner;

public class SalarioComReajuste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int salario, conta;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite seu salario para o reajuste : ");
		salario=ler.nextInt();
		
		conta=salario*5/100;
		
		System.out.println("O reajuste foi de 5%. ");
		System.out.println("o seu salario foi para "+(salario+conta));
		
		
	}

}
