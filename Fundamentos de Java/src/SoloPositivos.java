import java.util.Scanner;

public class SoloPositivos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
	int i=0;
	while(i<5) {
		//i++;
		System.out.println("Leer numero (" + i + "): ");
		int numero = in.nextInt();
		if(numero>0)
			System.out.println("Numero: " + numero);
		i++;
	}

		/*
		for(int i = 0; i<5; i++) {
			System.out.println("Leer numero (" + i + "): ");
			int numero = in.nextInt();
			if(numero>0)
				System.out.println("Numero: " + numero);
		}
		*/
	}
	
}