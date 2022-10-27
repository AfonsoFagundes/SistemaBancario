import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		double altura, area, base;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a altura do triangulo : ");
		altura=ler.nextDouble();
		System.out.print("Digite a area : ");
		area=ler.nextDouble();
		System.out.print("Digite a base : ");
		base=ler.nextDouble();
		
		area=base*altura/2;
		
		System.out.print("\nA Dimenssão do triangulo é :"+area);
		
		ler.close();
				
	}

}
