import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //Leer distintos tipos de datos
        //Leer tipo entero
        var consola= new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad=consola.nextInt();
        System.out.println("edad = " + edad);
        //Leer tipo double
        System.out.print("Ingresa tu altura: ");
        var altura=consola.nextDouble();
        System.out.println("altura = " + altura);
        //Consumimos el caracter de salto de linea
        consola.nextLine();
        //Leer un tipo string
        System.out.print("Ingresa tu nombre: ");
        var nombre=consola.nextLine();
        System.out.println("nombre = " + nombre);
        //Conversion de datos
        System.out.print("Proporciona un valor entero:");
       // var enteroString=consola.nextLine();
        //var entero= Integer.parseInt(enteroString);
        var entero =Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);
        //Tipo Flotatnte
        System.out.print("Proporciona un valor tipo flotante:");
        var flotante=Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);
        // Regresa un valor tipo double Double.parseDouble()
        //Regresa valor tipo booleano
    }
}
