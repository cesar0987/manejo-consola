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
        var añoNacimiento= consola.nextLine();
        var random = new Random();
        var numeroAleatorio=random.nextInt(9999);

        var numeroId=nombre.substring(0,2).toUpperCase()+apellido.substring(0,2).toUpperCase()+añoNacimiento.substring(2,4)+numeroAleatorio;
        System.out.printf("Hola %s \n\tTu nuevo numero de identificacion(ID) generado por el sistema es:\n\t %s",nombre,numeroId);



    }
}
