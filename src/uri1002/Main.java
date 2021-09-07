package uri1002;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double n= 3.14159;
		double raio= sc.nextDouble();
		double area;
		
		area= n*(Math.pow(raio, 2));
		
		System.out.printf("A= %.4f\n", area);
		
		
		sc.close();

	}

}
