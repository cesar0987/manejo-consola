import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("***Recetas de Cocina");
        var consola = new Scanner(System.in);

        //Nombre de la receta
        System.out.print("Ingrese el nombre: ");
        var recetaNombre=consola.nextLine();

        //Ingredientes de la receta
        System.out.print("Ingrese los ingredientes: ");
        var recetaIngredientes = consola.nextLine();

        //Tiempo de preparacion(min)
        System.out.print("Ingresa el tiempo de preparacion(min): ");
        var recetaTiempo = Integer.parseInt(consola.nextLine());

        //Dificultad de la receta
        System.out.print("Ingrese dificultad: ");
        var recetaDificultad = consola.nextLine();

        //Imprimiendo receta
        System.out.println("----Receta de Cocina----");
        System.out.println("Nombre de receta: " +recetaNombre);
        System.out.println("Ingredientes: "+recetaIngredientes);
        System.out.println("Tiempo de preparacion: "+recetaTiempo+" minutos");
        System.out.println("Dificultad: "+recetaDificultad);
    }
}
