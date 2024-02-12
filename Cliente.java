import java.util.Random;

public class Cliente {
	private int id;
	private int pasword;
	double monedero;

	public Cliente(int id, int pasword) {
		this.id = id;
		this.pasword = pasword;
		this.monedero = randomMetod();
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
	
	public double getSaldo() {
		// TODO Auto-generated method stub
		return monedero;
	}
	
	public void setSaldo(double monedero) {
		this.monedero = monedero;
	}
	
	public double dropSaldo(double monedero) {
		return this.monedero = this.monedero-monedero;
	}
	
	
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cliente cliente = (Cliente) obj;
        return id == cliente.id && pasword == cliente.pasword;
    }
	
	public double randomMetod() {
		Random random = new Random();
		return random.nextDouble(19000)+1000;
	}
}
