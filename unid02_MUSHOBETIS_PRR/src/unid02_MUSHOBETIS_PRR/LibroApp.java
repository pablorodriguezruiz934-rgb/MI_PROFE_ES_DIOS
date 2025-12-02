package unid02_MUSHOBETIS_PRR;

public class LibroApp {
	
		 public static void main(String[] args) {
		 String[] libros = {"El Quijote", "1984", "Odisea"};
		 int[] paginas = {863, 328, 421};
		 int total = 0;
		 for (int i = 0; i <= libros.length-1; i++) {
		 System.out.println("Libro: " + libros[i].length());
		 total += paginas[i];
		 }
		 double promedio = total / libros.length;
		 System.out.println("Promedio de páginas: " + promedio);
		 }
		}

