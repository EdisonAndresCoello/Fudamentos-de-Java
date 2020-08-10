import jdk.nashorn.internal.ir.GetSplitState;

public class Oficinista extends Empleado {
	
	private int anhosTrabajados;
	
	public Oficinista (String indentificador, double salario) {
		super(identificador, salario);
	}
	
	public int getAnhosTrabajados() {
		return anhosTrabajados;
		
	}
	
	public void setAnhosTrabajados(int anhostrabajados) {
		this.anhosTrabajados = anhostrabajados;
		
	}
	
	@Override
	public double getSalario() {
		int aumento = 0;
		for (int i = 0; i < anhosTrabajados; i++) {
			aumento+=super.getSalario()*0.05;
			
		}
		
		return 
				
	}
}
