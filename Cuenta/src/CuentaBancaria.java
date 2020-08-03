public abstract class CuentaBancaria {
	private String propietario;
	public double saldo;
	
	public abstract void depositar (double dinero);
	public abstract void retirar (double dinero);
	
	public String getPropietario() {
		return propietario;
	}
	
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}