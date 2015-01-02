import java.util.Scanner;

class Hora {
	public static void main(String[] args) {
		
		int num, hor, min, seg; 
		Scanner sc=new Scanner(System.in);  
         
        System.out.println("Ingrese los segundos: ");  
        num=sc.nextInt();  
        hor=num/3600;  
        min=(num-(3600*hor))/60;  
        seg=num-((hor*3600)+(min*60));  

        System.out.println();
        System.out.print("Hora en formato 24 horas: ");
        System.out.println(hor+":"+min+":"+seg);  

	}
}