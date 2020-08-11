public class Main {

	public static void main(String[] args) {

		Libros lbr1 = new Libros("LAS ALMAS MUERTAS", 47);
		Libros lbr2 = new Libros("LA CASA DE LOS ESPIRITUS", 38);
		
		Cd Cd1 = new Cd("LINKIN PARKriste", 17);
		Cd Cd2 = new Cd("MICHAEL JACKSON", 35);

		System.out.println("****LIBROS****");
		System.out.println("USTED TIENE QUE CANCELAR POR EL LIBRO DE LAS ALMAS MUERTAS: " + lbr1.getValor1() +  "$");
		System.out.println("USTED TIENE QUE CANCELAR POR EL LIBRO LA CASA DE LOS ESPIRITUS: " + lbr2.getValor1() +  "$"); 
		
		System.out.println("*****CD******                                                ");
		
		System.out.println("EL VALOR DEL CD DE LINKIN PARK ES :" +  Cd1.getValorcd1() +  "$");
		System.out.println("EL VALOR DEL CD DE MICHAEL JACKSON : "  + Cd2.getValorcd1() +  "$");
	}

}