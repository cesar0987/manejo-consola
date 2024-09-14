import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("***Sistema de Empleados***");

        var consola=new Scanner(System.in);

        //Nombre Empleado
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado=consola.nextLine();

        //Edad Empleado
        System.out.print("Edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        //Salario del Empleado
        System.out.print("Salarios del empleado: ");
        var salarioEmpleado= Double.parseDouble(consola.nextLine());

        //Es jefe de departamante
        System.out.print("Es jefe de departamento(true/false): ");
        var esJefeDepartamento= Boolean.parseBoolean(consola.nextLine());

        //Imprimir los valores del Empleado
        System.out.println("\nDatos del Empleado");
        System.out.println("\tNombre: "+nombreEmpleado);
        System.out.println("\tEdad: "+edadEmpleado+"años");
        //System.out.println("\tSalario: "+salarioEmpleado);
        System.out.printf("\tSalario: $%.2f%n", salarioEmpleado);
        //%n Agrega un salto de linea(Independientemente en que sistema se encuentre)
        System.out.println("\tEs Jefe De Departamento: "+esJefeDepartamento);
    }
}
