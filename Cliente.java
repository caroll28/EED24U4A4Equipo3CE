import prueba.Cliente;

public class Cliente {
	private int id;
	private int pasword;
	//private double saldoCuenta;

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

//	void depositMoney(double cantidad) {
//		saldoCuenta = saldoCuenta + cantidad;
//
//	}
}
