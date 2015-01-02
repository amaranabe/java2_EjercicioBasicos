import java.util.Scanner;

class OrdenarNumeros {
	public static void main(String[] args) {
		
		int num1, num2, num3;
		Scanner sc=new Scanner(System.in);

		System.out.println("Introduce un número:");
		num1=sc.nextInt();
		System.out.println("Introduce otro número:");
		num2=sc.nextInt();
		System.out.println("Introduce un tercer número:");
		num3=sc.nextInt();


		System.out.println();
		System.out.println("Los números ordenado de mayor a menor son:");
		System.out.println("==========================================");
		if (num1>num2) 
		{
			if (num1>num3) 
			{
				System.out.println(num1);
				if (num2>num3) 
				{
					System.out.println(num2);
					System.out.println(num3);
				}
				else {
					System.out.println(num3);
					System.out.println(num3);
				}
			}
			else {
				System.out.println(num3);
				System.out.println(num1);
				System.out.println(num2);
			}
			
		}
		else {//num1<num2
			if (num2>num3) {
					System.out.println(num2);
					if (num3>num1) {
						System.out.println(num3);
						System.out.println(num1);
					}
					else {
						System.out.println(num1);
						System.out.println(num3);
					}
			}
			else {//num3>num2>num1
				System.out.println(num3);
				System.out.println(num2);
				System.out.println(num1);
			}
		}
	}
}