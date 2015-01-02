import java.util.Scanner;

class Divisores {
	public static void main(String[] args) {
		
		int numero;
		Scanner sc=new Scanner(System.in);

		System.out.println("Introduce un número:");
		numero=sc.nextInt();

		int div;
		System.out.println();
		System.out.println("Divisores de "+numero+":");
		for (div=1; div<=numero; div++) {
			if(numero%div==0){
				System.out.println(+div);
			}
		}
	}
}