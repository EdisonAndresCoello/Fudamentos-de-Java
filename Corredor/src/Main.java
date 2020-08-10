public class Main {

	public static void main(String[] args) {
		Corredor corr1 = new Corredor(20);
	    Corredor corr2 = new Corredor(45);
	       
	       corr1.verificarEnergia();
	       corr1.recargarEnergia(90);
	       corr1.verificarEnergia();
	       corr1.entrenar();
	       corr1.verificarEnergia();
	       
	       corr2.verificarEnergia();
	       corr2.recargarEnergia(90);
	       corr2.verificarEnergia();
	       corr2.entrenar();
	       corr2.verificarEnergia();

	       corr2.verificarEnergia();
	       corr2.recargarEnergia(90);
	       corr2.verificarEnergia();
	       corr2.entrenar();
	       corr2.verificarEnergia();
	       
	}
	
}