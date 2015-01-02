import java.util.Scanner;

class ValorAbsoluto {
	public static void main(String[] args) {
		
		double numero;
		double absoluto;
		Scanner sc=new Scanner(System.in);

		System.out.println("Introduce un número entero:");
		numero=sc.nextInt();

		absoluto=Math.abs(numero);
		System.out.println("El valor absoluto de " +numero +" es: "+absoluto);

	}
}