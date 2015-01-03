import java.util.Scanner;

class MaquinaBebidas {
	
	public static void menu() {
		System.out.println("Seleccione el número del producto que quiere:");
		System.out.println("================================================");
		System.out.println("1. Coca Cola: 1,75 euro");
		System.out.println("2. Agua:      1 euro");
		System.out.println("3. Zumo:      0,50");
		System.out.println();
		
	}

	public static void monedas () {
		System.out.println();
		System.out.println("Realice el pago, marcando la opción que desee:");
		System.out.println("==============================================");
		System.out.println("1.- 5  céntimos");
		System.out.println("2.- 10 céntimos");
		System.out.println("3.- 20 céntimos");
		System.out.println("4.- 50 céntimos");
		System.out.println("5.-  1 euro");
		System.out.println("6.-  2 euros");
		System.out.println();
	}

	public static void main(String[] args) {
		
		int eleccion;
		int precioproducto;
		int producto1=175;
		int producto2=100;
		int producto3=50;

		Scanner sc=new Scanner(System.in);
		
		//Presentar menu de la maquina
		menu();
		eleccion=sc.nextInt();

		//Comprobar que la opcion es correcta
		while (eleccion!=1 && eleccion!=2 && eleccion!=3) {

			System.out.println("Opccion no válida.\nSeleccione de nuevo el número del producto que quiere:");
			menu();
			eleccion=sc.nextInt();
		}

		//Asignarle un precio al producto elegido

			if (eleccion==1) {
				precioproducto=producto1;
			}
			else if (eleccion==2) {
				precioproducto=producto2;
			}

			else {
				precioproducto=producto3;
			}

		
		int opcion;
		//int [] listamonedas= {5, 10, 20, 50, 100, 200} //pruebo a asignarle valores a las monedas creando un array

		double sumamonedas=0;
		double cambio=0;

		//Otro forma para hacer la equivalencia entre la opcion que elige en el menu y el valor de las monedas
		int moneda;
		int moneda1=5;
		int moneda2=10;
		int moneda3=20;
		int moneda4=50;
		int moneda5=100;
		int moneda6=200;
		
		monedas();
		do {
			opcion=sc.nextInt();
			
			//Comprobamos que las opciones son correctas
			while (opcion!=1 && opcion!=2 &&  opcion!=3 && opcion!=4 && opcion!=5 && opcion!=6) {

			System.out.println("Opccion no válida.\nSeleccione de nuevo el número de la moneda que desea introducir:");
			monedas();
			opcion=sc.nextInt();
			}

			//damos la equivalencia en monedas a la opcion elegida
			if (opcion==1) {
				moneda=moneda1;
			}
			else if (opcion==2) {
				moneda=moneda2;
			}
			else if (opcion==3) {
				moneda=moneda3;

			}
			else if (opcion==4) {
				moneda=moneda4;
			}
			else if (opcion==5) {
				moneda=moneda5;
			}
			else {
				moneda=moneda6;
			}

			sumamonedas=moneda+sumamonedas; //acumulo los valores de moneda
			System.out.println();
			System.out.println("Llevas introducido: "+sumamonedas/100.0 +" euros");
			if (sumamonedas<precioproducto) {
				System.out.println("Continúe.");
				System.out.println();
			}
							
		}
		while (sumamonedas<precioproducto);

		cambio=sumamonedas-precioproducto;
		System.out.println();
		System.out.println("Cambio a devolver: "+cambio/100 +" euros");
	
		//Algoritmo para la devolucion de monedas
		do{
			int numerodemoneda=0;
			int cociente1, cociente2, cociente3, cociente4, cociente5, cociente6;
			
			cociente6=(int)cambio/moneda6;
			cociente5=(int)cambio/moneda5;
			cociente4=(int)cambio/moneda4;
			cociente3=(int)cambio/moneda3;
			cociente2=(int)cambio/moneda2;
			cociente1=(int)cambio/moneda1;
			if (cociente6>0) {
				numerodemoneda=cociente6;
				cambio=cambio%moneda6;
				System.out.println("Te devuelvo "+numerodemoneda +" de: "+moneda6/100 +" euros.");
			}
			else if (cociente5>0) {
				numerodemoneda=cociente5;
				cambio=cambio%moneda5;
				System.out.println("Te devuelvo "+numerodemoneda +" de: "+moneda5/100 +" euro.");
			}
			else if (cociente4>0) {
				numerodemoneda=cociente4;
				cambio=cambio%moneda4;
				System.out.println("Te devuelvo "+numerodemoneda +" de: "+moneda4 +" céntimos.");
			}
			else if (cociente3>0) {
				numerodemoneda=cociente3;
				cambio=cambio%moneda3;
				System.out.println("Te devuelvo "+numerodemoneda +" de: "+moneda3 +" céntimos.");
			}
			else if (cociente2>0) {
				numerodemoneda=cociente2;
				cambio=cambio%moneda2;
				System.out.println("Te devuelvo "+numerodemoneda +" de: "+moneda2 +" céntimos.");
			}
			else {
				numerodemoneda=cociente1;
				cambio=cambio%moneda1;
				System.out.println("Te devuelvo "+numerodemoneda +" de: "+moneda1 +" céntimos.");
			}

		}
		while (cambio!=0);

	}
}