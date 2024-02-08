import java.util.Scanner;

public class cajeroMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String identificador;
		String password= " ";
		
		final int clientes = 5;
		final int contraseña =5;
		
		String [][] Cliente = new String [clientes][contraseña];



		int menu = 0;
		do {
			
			System.out.println("Ingrese su identificador:");
			identificador = sc.nextLine();
			System.out.println("Ingrese su contraseña: ");
			password = sc.nextLine();
			
			System.out.println("Menú");
			System.out.println("1. Comprobar el saldo ");
			System.out.println("2. Ingresar cantidad");
			System.out.println("3. Retirar cantidad ");
			System.out.println("4. Salir del menú");

			switch (menu) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("Número inválido, vuelva a introducir un número");

			}

		} while (menu != 0);

	}

}
