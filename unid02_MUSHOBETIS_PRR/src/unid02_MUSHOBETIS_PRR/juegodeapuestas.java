package unid02_MUSHOBETIS_PRR;

import java.util.Random;
import java.util.Scanner;
public class juegodeapuestas {
 public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);
 Random random = new Random();
 int saldo = 100; // saldo inicial
 System.out.println("=== Juego de Apuestas ===");
 System.out.println("Saldo inicial: " + saldo);
 while (saldo > 0) {
 System.out.print("\nIngresa tu apuesta (0 para salir): ");
 int apuesta = scanner.nextInt();
 if (apuesta == 0) {
 System.out.println("Has salido del juego.");
 break;
 }
 if (apuesta > saldo) {
 System.out.println("No puedes apostar más de tu saldo.");
 continue;
 }
 }
 scanner.close();
 
 }

}
