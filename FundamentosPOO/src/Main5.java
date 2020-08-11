


//clases.
//variables de istancia -> objeto -> instancia -> varibles por referencia.
//herencia,polimorfismo,abstraccion,encapsulamiento.
//variables de clases -> veriables y metodos estaticos.
//variables primitivas int, float...
// 

public class Main5 {
	
	void sumarContadorMain() {
		CuentaCorriente.contador +=100;
		
	}
	
	static void sumarCotadorMain1() {
	CuentaCorriente.contador +=100;
	}
	public static void main(String[] args) {
		CuentaCorriente.contador = 100;
		//CuentaCorriente.saldo = 100;
		
		Main5 main = new Main5();
		main.sumarContadorMain();
		
		Main5.sumarCotadorMain1();
		sumarCotadorMain1();
		
		
		
		
		
	}

}
