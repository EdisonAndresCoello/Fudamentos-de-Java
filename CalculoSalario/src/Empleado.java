
public class Empleado {
	private String identificador;
	private double salario;
	
	public Empleado(String identifacador, double salario) {
		super();
		this.identificador = identifacador;
		this.salario = salario;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	public String getIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void getSalario(double salario) {
		this.salario = salario;
	}


}
