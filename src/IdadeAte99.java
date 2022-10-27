import java.util.Scanner;

public class IdadeAte99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		int idade = 0, idade50 = 0, idade21 = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println(" Digite a Idade  : ");
		System.out.println("(para encerrar digite 99 )");
		idade =ler.nextInt();
		
		while (idade != 99) {
			System.out.println("\n Digite a Idade  : ");
			if (idade <= 21)
				idade21++;
			if (idade >= 50)
				idade50++;
			System.out.println("\n(para encerrar digite 99 )");
			idade = ler.nextInt();
		}
		System.out.println("O total de pessoas com menos de 21 anos é de : " + idade21);
		System.out.println("O totoal de pessoas com mais de 50 anos é de : " + idade50);
		
		ler.close();

	}

}
