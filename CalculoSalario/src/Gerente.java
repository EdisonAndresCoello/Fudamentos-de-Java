
public class Gerente extends SupervisorTecnico {
	
	private double viaticos;
	
	public Gerente(String identificacion, dpuble salario, int anhosTrabajados, double viaticos) {
		super(identificacion, salario, anhosTrabajados);
		this.viaticos = viaticos;
	}
	@Override
	public double getSalario() {
		return super.getSalario() + viaticos;
		
	}
}
	

