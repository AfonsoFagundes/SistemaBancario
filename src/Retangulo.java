import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int area, base, altura;
		Scanner ler = new Scanner(System.in);
		
		
		System.out.print("Digite a base do retangulo : ");
		base=ler.nextInt();
		System.out.print("Difite a altura : ");
		altura=ler.nextInt();
		
		area=base*altura;
		
		System.out.println("A area do retangulo é " + area);
	}

}
