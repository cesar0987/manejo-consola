import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        System.out.println("Generador de ID Unico");
        var consola = new Scanner(System.in);
        System.out.print("Cual es tu nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Cual es tu apellido: ");
        var apellido = consola.nextLine();
        System.out.print("Cual es tu año de nacimiento:");
        var añoNacimiento= Integer.parseInt(consola.nextLine());
        var random = new Random();


    }
}
