import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//***Exemplo 1***
		
		//Scanner sc = new Scanner(System.in);
		
		//String x;
		//x = sc.next();
		//System.out.println("Voce digitou: " + x);
		
		
		//sc.close();
		//*******************************************
		
		//***Exemplo 2***
		
		//Scanner sc = new Scanner(System.in);
		
		//int x;
		//x = sc.nextInt();
		//System.out.println("Voce digitou: " + x);

		
		//sc.close();
		//*******************************************
		
		//***Exemplo 3***
		
		//Locale.setDefault(Locale.US);
		
		//Scanner sc = new Scanner(System.in);
		
		//double x;
		//x = sc.nextDouble();
		//System.out.println("Voce digitou: " + x);
		
		
		//sc.close();
		//*******************************************
		
		//***Exemplo 4***
		
		//Scanner sc = new Scanner(System.in);
		
		//char x;
		//x = sc.next().charAt(0);
		//System.out.println("Voce digitou: " + x);
		
		//sc.close();
		
		//*******************************************
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
