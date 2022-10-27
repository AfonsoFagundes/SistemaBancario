import java.util.Scanner;

public class NumeroDeEleitores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int NumeroEleitores, Brancos, Nulos, validos, Porcentagem1, porcentagem2, porcentagem3;
		String Municipio;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite seu muninicipio : ");
		Municipio=ler.next();
		System.out.print("Digite o numero de eleitores : ");
		NumeroEleitores=ler.nextInt();
		System.out.print("Numeros em brancos : ");
		Brancos=ler.nextInt();
		System.out.print("Numeros nulos : ");
		Nulos=ler.nextInt();
		System.out.print("Numeros validos : ");
		validos=ler.nextInt();
		
		Porcentagem1=Brancos*100/NumeroEleitores;
		porcentagem2=Nulos*100/NumeroEleitores;
		porcentagem3=validos*100/NumeroEleitores;
		
		System.out.println("O porcentual de Numeros em bracos é :" + Porcentagem1);
		System.out.println("O porcentual de numeros nulos é : "+ porcentagem2);
		System.out.println("O porcentual de numeros validos é : "+ porcentagem3);
		
		
		
	}

}
