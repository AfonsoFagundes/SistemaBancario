import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um para saber se é par ou impar : ");
		n1=ler.nextInt();
		
		
		 
		if (n1%2==0)
			System.out.print("\nNúmero par" + n1);
			
		else
				System.out.print("\nnumero impar" + n1);
	}

}
