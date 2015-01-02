import java.util.Scanner;

class ContadorAes {
	public static void main(String[] args) {
		
		//Declaro variables
		String palabra;
		Scanner sc= new Scanner(System.in);
		int contador=0;

		//Solicito datos
		System.out.println("Introduce una palabra");
		palabra=sc.next();

		//Planteo algoritmo
		int i;
		for (i=0; i<palabra.length(); i++){
			if(palabra.charAt(i)=='a') {
				contador++;
			}
		}
		//Imprimo la solucion
		System.out.println("Esta palabra tiene: " +contador +" aes");

		
	}
}
