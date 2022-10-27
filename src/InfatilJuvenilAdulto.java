import java.util.Scanner;

public class InfatilJuvenilAdulto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int idade;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade=ler.nextInt();
		
	    if (idade<=10 && idade<=14)
	    	System.out.println("Infantil");
	    if (idade>=15 && idade<=17)
	        System.out.println("juvenil");
	    if (idade>=18)
	    	System.out.println("adulto");
		
	}

}
