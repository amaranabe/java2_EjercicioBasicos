import java.util.Scanner;

class ContadorConsonantes {
	public static void main(String[] args) {
		
		//Declaro variables
		String palabra;
		Scanner sc= new Scanner(System.in);
		int contador=0;

		//Solicito datos
		System.out.println("Introduce una palabra que acabe en punto:");
		palabra=sc.next();

        int ultimo;
        ultimo=palabra.length()-1;

        while (palabra.charAt(ultimo)!='.') {
			System.out.println("Esta palabra no termina en punto. Vuelve a introducirla:");
			palabra=sc.next();
			ultimo=palabra.length()-1;
		}

		//Planteo algoritmo
		int i;
		for (i=0; i<palabra.length(); i++){
			if(palabra.charAt(i)!='a' && palabra.charAt(i)!='e' && palabra.charAt(i)!='i' && palabra.charAt(i)!='o' && palabra.charAt(i)!='u' && palabra.charAt(i)!='.') {
				contador++;
			}
		}
		//Imprimo la solucion
		System.out.println("Esta palabra tiene: " +contador +" consonantes");

		
	}
}
