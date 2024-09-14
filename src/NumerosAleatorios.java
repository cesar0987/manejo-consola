import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("***Numeros Aleatorios***");
        var random = new Random();

        //Genera numero aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        //Generar numero aleatorio entre 1 y 10
        numeroAleatorio = random.nextInt(10)+1;
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        //Generar numero flotante entre  0.0 y 1.0
        var flotanteAleatorio=random.nextFloat(1);
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);
        //Simular el lanzamiento de un dado
        var dado =random.nextInt(6)+1;
        System.out.println("Resultado de lanzar el dado: " + dado);
    }
}
