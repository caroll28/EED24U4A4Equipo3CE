import java.util.ArrayList;
import java.util.Scanner;

public class cajeroMain {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int userTemp = 0;
		int positionTemp = 0;
		int passTemp = 0;
		boolean temp = false;
		char menu = ' ';

		ArrayList<Cliente> users = new ArrayList();

		users.add(new Cliente(1, 111));
		users.add(new Cliente(2, 222));
		users.add(new Cliente(3, 333));
		users.add(new Cliente(4, 444));
		users.add(new Cliente(5, 555));

		
		
		System.out.println("*******Bienvenido*******");
		viewUsers(users);
		System.out.println();
		System.out.println();

		comProbar(userTemp, positionTemp, passTemp, users, temp, menu);
		
		
	}

	public static void viewUsers(ArrayList<Cliente> list) {
		System.out.println("Los usuarios disponibles son:");
		for (Cliente cliente : list) {
			System.out.println("ID: " + cliente.getId());
		}
	}
	
	public static void comProbar(Integer userTemp, int positionTemp, int passTemp, ArrayList <Cliente> users, boolean temp, char menu) {
		do {
			System.out.println("Ingrese el Usuario: ");
			userTemp = sc.nextInt();
			positionTemp = userTemp-1;

			System.out.println("Ingrese la Contraseña: ");
			passTemp = sc.nextInt();
			sc.nextLine();
			
			Cliente findUser = new Cliente(userTemp, passTemp);
			if (checkUser(users, findUser)) {
				menuCajero(menu, users, positionTemp);
				
			}
		} while (!temp);
	}

	
	public static boolean checkUser(ArrayList<Cliente> users, Cliente findUsers) {
		boolean condition2 = false;
		for (Cliente cliente : users) {
			if (cliente.equals(findUsers)) {
				condition2 = true;
				break;
			}
		}
		if (!condition2) {
			System.out.println("Credenciales erroneas");
			return false;
		} else {
			System.out.println("Credenciales correctas!!!");
			return true;
		}
	}
	
	public static void menuCajero (char menu, ArrayList<Cliente> users, int positionTemp){
		System.out.println("\n");
		do {
			System.out.println("Indique la Operación a realizar...");
			System.out.println("A. Mostrar saldo actual ");
			System.out.println("B. Ingresar importe");
			System.out.println("C. Retirar importe");
			System.out.println("D. Transferir importe");
			System.out.println("S. Salir");
			String temp = sc.nextLine().toUpperCase();
			if(!temp.isEmpty()){
				menu = temp.charAt(0);
				switch (menu) {
				case 'A':
					viewSaldo(users, positionTemp);
					break;
					
				case 'B':
					System.out.println("Ingresar la cantidad a depositar");
					double deposito = sc.nextDouble();
					depositSaldo(users, positionTemp, deposito);
					break;
					
				case 'C':
					System.out.println("Ingresar la cantidad a depositar");
					double retiro = sc.nextDouble();
					retireSaldo(users, positionTemp, retiro);
					break;
					
				case 'D':
					System.out.println("Indique la cuenta destinataria");
					for (Cliente cliente : users) {
						if(cliente == users.get(positionTemp)) {
							continue;
						}else {
							System.out.println("ID: " + cliente.getId());
						}
					}
					int idDestinatario = sc.nextInt();
					
					System.out.println("Indique el monto de la transferencia");
					double montoTransferencia = sc.nextDouble();
					break;
					
				case 'S':
					System.out.println("Saliendo del Menu...");
					System.out.println("Volviendo al Menú principal");
					break;
					
				default:
					System.out.println("Opción inválida, vuelva a introducir una opción");
				}
			}else {
	            System.out.println("Debe ingresar una opción.");
	        }
		} while (menu != 'S');
	}
	
	public static void viewSaldo(ArrayList<Cliente> users, int positionTemp) {
	    Cliente cliente = users.get(positionTemp);
	    double saldo = cliente.getSaldo(); // Utilizar el método getSaldo() en el objeto cliente
	    System.out.println("Saldo actual del cliente " + (positionTemp+1) + ": " + saldo);
	}
	
	public static void depositSaldo (ArrayList<Cliente> users, int positionTemp, double deposito) {
		Cliente cliente = users.get(positionTemp);
		double saldo = cliente.getSaldo()+deposito;
		cliente.setSaldo(saldo);
		System.out.println("Depósito realizado");
		System.out.println("Saldo actual del cliente "+saldo);
	}
	
	public static void retireSaldo (ArrayList<Cliente> users, int positionTemp, double retiro) {
		Cliente cliente = users.get(positionTemp);
		double saldo = cliente.getSaldo()-retiro;
		cliente.setSaldo(saldo);
		System.out.println("Retiro realizado");
		System.out.println("Saldo actual del cliente "+saldo);
	}
	
	public static void transferSaldo (ArrayList<Cliente> users, int positionTemp,int idDestinatario, double montoTransferencia) {
		Cliente cliente = users.get(positionTemp);
		Cliente cliente2 = users.get(idDestinatario);
		double saldoCliente = cliente.getSaldo()-montoTransferencia;
		double saldoCliente2 = cliente.getSaldo()+montoTransferencia;
		System.out.println("Saldo actual del cliente "+saldoCliente);
	}
}
