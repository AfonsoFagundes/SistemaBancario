import java.util.Scanner;

public class DiasMesAnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mes, dias, anos, idade, conta1, conta2, conta3;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite sua idade :");
		idade=ler.nextInt();
		
		conta1=idade*365;
		mes=(conta1/30);
		anos=conta1/365;
		
		System.out.println("anos="+anos);
		System.out.println("|meses"+mes);
		System.out.println("|total de dias="+conta1);
	}

}
