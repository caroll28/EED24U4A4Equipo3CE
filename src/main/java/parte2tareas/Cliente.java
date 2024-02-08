package parte2tareas;

public class Cliente {
	private int id;
	private int pasword;
	double saldo;
	// private double saldoCuenta;

	/**
	 * @param id
	 * @param pasword
	 */
	public Cliente(int id, int pasword) {
		this.id = id;
		this.pasword = pasword;
	}

	Cliente() {
	}

	public int getPasword() {
		return pasword;
	}

	public void setPasword(int pasword) {
		this.pasword = pasword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	boolean checkUser(Cliente cliente) {

			if (this.id == cliente.id && this.pasword == cliente.pasword) {
				System.out.println("ID Y PASWORD CORRECTO");
				return true;

			} else {
				System.out.println("Error: el usuario no existe");
				return false;
			}
	}
	// Edición del método TransferirImporte (Carolina)

	void restarcantidad(double cantidad) {
		saldo -= cantidad;

	}

	void sumarCantidad(double cantidad) {
		saldo += cantidad;

	}

	public static void transferirImporte(Cliente c1, Cliente c2, double cantidad) {
		c1.restarcantidad(cantidad);
		c2.sumarCantidad(cantidad);

	}

	

//		void depositMoney(double cantidad) {
//			saldoCuenta = saldoCuenta + cantidad;
//
//		}
}

