

public class SupervisorTecnico extends Empleado{
	
	private int anhosTrabajados;
	
	public SupervisorTecnico(String identifacion, double salario) {
		super(identifacion, salario);
		this.anhosTrabajados = anhosTrabajados;
		
	}
	
	public int getanhosTrabajados() {
		return anhosTrabajados;
	}
	
	public void setAnhosTrabajados(int anhosTrabajados) {
		this.anhosTrabajados = anhosTrabajados;
	}
	
	@Override
	public double getSalario() {
		double salario = super.getSalario();
		double aumento = 0;
		for(int i=0; i<anhosTrabajados; i++) {
			aumento += salario * 0.05;
			
		}
		
		return super.getSalario()+aumento;
	}
	

}
