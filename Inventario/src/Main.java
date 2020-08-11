import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	public static void mostar(ArrayList<Libro> li) {
		System.out.println("LIBROS DISPONIBLES EN EL INVENTARIO");
		for (int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
	}
	  public static void buscarcodigo(ArrayList<Libro> li) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("INGRESE EL CODIGO DEL LIBRO QUE DESEA BUSCAR: ");
		int codigoingresado = entrada.nextInt();
		for (int i=0;i<li.size();i++) {
			if (codigoingresado == li.get(i).getCodigo()) {
				System.out.println(li.get(i));	
			}
			
		}
	}
	
       public static void comprarLibro (ArrayList<Libro> li) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("INSERTE EL CODIGO DEL LIBRO QUE DESEA COMPRAR");
		int codigoingresado = entrada.nextInt();
		int cantidad;
		for (int i=0;i<li.size();i++) {
			if (codigoingresado == li.get(i).getCodigo()) {
				cantidad = li.get(i).getCantidadexistente();
				if(cantidad > 1) {
					cantidad -= 1;
					System.out.println("gracias por preferirnos");
					li.get(i).setCantidadexistente(cantidad);
					actualizar(li);
				}else {
					cantidad = 0;
					System.out.println("gracias por preferirnos");
					System.out.println("el libro que ha solicitado se termino");
					li.get(i).setCantidadexistente(cantidad);
					actualizar(li);
				}
			}
		}
	}
		
	public static void actualizar(ArrayList<Libro> li) {
		
		for (int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
	}
		
	public static void librosMasCaros (ArrayList<Libro> li) {
		System.out.println("ANALIZANDO LIBROS MAS COSTOSOS");
	}
	
	
		public static void main(String[] args) {
			
			ArrayList<Libro> libros = new ArrayList<Libro>();
			
			Libro l1 = new Libro(6484, 1, "El principito", "Antoine de Saint-Exupéry", 15.02);
			Libro l2 = new Libro(8796, 2, "Matilda", "Roald Dahl", 20.09);
			Libro l3 = new Libro(5784, 3, "Luces de bohemia","Ramón del Valle-Inclán",30.60);
			Libro l4 = new Libro(2343, 4, "La casa de los espíritus" , "AIsabel Allende",27.89);
			Libro l5 = new Libro(5732, 5, "Las almas muertas" , "Nicolai Gogol",58.04);
			
			
			
			libros.add(l1);
			libros.add(l2);
			libros.add(l3); 
			libros.add(l4);
			libros.add(l5); 
			
			
			
			mostar(libros);
			
			
	}
}