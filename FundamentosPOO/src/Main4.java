
public class Main4 {

	public static void subirVolumen(Tv tv) {
		tv.subirVolumen();
		
	}
	
	public static void subirVolumen(int volumen) {
		volumen = volumen + 10;
	}
	
	public static void subirVolumen(Tv tv) {
		tv.subirVolumen();
	}
	
	public static void main(String[] args) {
		//Variables por valor o primitiva int,float,char...
		//Variables por referencia u objeto
		int volumen = 100;
		Tv tv1 = new Tv();
		tv1.encender();
		tv1.subirVolumen();
		tv1.subirVolumen();
		
		subirVolumen(volumen);
		subirVolumen(tv1);
		
		System.out.println(tv1.volumen);
		System.out.println(volumen);
	}
}
