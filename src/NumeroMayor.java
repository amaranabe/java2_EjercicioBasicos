import java.util.Scanner;

class NumeroMayor {
	public static void main(String[] args) {
		
		int num1;
		int num2;
		Scanner sc=new Scanner(System.in);

		System.out.println("Introduce un número:");
		num1=sc.nextInt();
		System.out.println("Introduce otro número:");
		num2=sc.nextInt();

		if (num1>num2) {
			System.out.print("Ordenados de mayor a menor son: "+num1+" y "+num2);
		}
		else {
			System.out.print("Ordenados de mayor a menor son: "+num2+" y "+num1);
		}
	}
}