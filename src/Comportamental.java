import java.util.Scanner;

public class Comportamental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 0, sexo = 0, feminino = 0, masculino = 0, outros = 0, pessoas = 0, feels = 0, calma = 0,
				nervosa = 0, id40n = 0, id18c = 0, agressiva = 0;
		Scanner ler = new Scanner(System.in);

		System.out.println("SEJA BEM A VINDO A CLINICA VM HEALTHY");
		System.out.println("\n");

		while (pessoas < 10) {
			System.out.print("Digite sua idade : ");
			idade = ler.nextInt();

			System.out.print("\tDigite seu sexo : 1-feminino, 2-Masculino, 3-Outros : ");
			sexo = ler.nextInt();

			System.out.println("\tEscolha de 1 a 3 de como você se sente  : 1-calmo(a),/t 2-nervoso(a),/ t3-Agressivo(a) ");
			feels = ler.nextInt();

			{

			}

			if (sexo == 1)
				feminino++;
			if (sexo == 2)
				masculino++;
			if (sexo == 3)
				outros++;
			if (feels == 1)
				calma++;
			if (feels == 2)
				nervosa++;
			if (feels == 3)
				agressiva++;
			pessoas++;

			if (idade >= 40 && feels == 2)
				id40n++;
			if (idade <= 18 && feels == 1)
				id18c++;
		}

		System.out.println("O número de pessoas calmas :   " + calma);
		System.out.println("O números de Mulheres nervosas : " + nervosa);
		System.out.println("O número de pessoas calmas que tem uma sexualidade diferente : " + outros);
		System.out.println("O número de homens agressivos : " + agressiva);
		System.out.println("O número de pessoas nervosas com mais de 40 anos : " + id40n);
		System.out.println("O número de pessoas calmas com menos de 18 anos : " + id18c);

	}

}
