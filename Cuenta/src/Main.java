public class Main {
	public static void main(String args[]) {
		CuentaCorriente cc = new CuentaCorriente();
		CuentaAhorro ca = new CuentaAhorro();
		
		cc.depositar(1000);
		System.out.println(cc.getSaldo());
		ca.depositar(1000);
		System.out.println(ca.getSaldo());
	}
}