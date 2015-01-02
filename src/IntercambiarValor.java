import java.util.Scanner;

class IntercambiarValor {
	public static void main(String[] args) {
		int A;
		int B;
		int m;
		Scanner sc=new Scanner(System.in);

		System.out.print("Da un valor a A:");
		A=sc.nextInt();
		System.out.print("Da un valor a B:");
		B=sc.nextInt();

		//Antes
		System.out.println();
		System.out.println("El valor de A es: "+A);
		System.out.println("El valor de B es: "+B);

		//Algoritmo
		m=B; //Guardo el valor de B antes de machacarlo
		B=A;
		A=m;

		//Después
		System.out.println();
		System.out.println("El valor de A es: "+A);
		System.out.println("El valor de B es: "+B);

	}
}