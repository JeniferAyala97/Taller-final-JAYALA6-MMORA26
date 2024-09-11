import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("___________________________________________");
        System.out.println("-       Menú taller de programacion       -");
        System.out.println("-               Pre Hackaton              -");
        System.out.println("-_________________________________________-");
        System.out.println("-        1. Datos Primitivos              -");
        System.out.println("-        2. String                        -");
        System.out.println("-        3. Constantes                    -");
        System.out.println("-        4. Tipo de Operadores            -");
        System.out.println("-        5. Condicional IF,ELSE IF,ELSE   -");
        System.out.println("-        6. Condicional SWICTH            -");
        System.out.println("-        7. Condicional Ternaria          -");
        System.out.println("-        8. Bucle DO WHILE                -");
        System.out.println("-        9. Bucle WHILE                   -");
        System.out.println("-        10.Bucle FOR                     -");
        System.out.println("-        0. Salir                         -");
        System.out.println("-_________________________________________-");

        Scanner scanner = new Scanner(System.in);

// variables 1 2 3 4 5 6 7 8 9 10 0

        System.out.print("Ingrese Opcion:");
        int opciones = scanner.nextInt();

        // Determinar la categoria usando un switch
        switch (opciones) {
            case 1:
                System.out.println("___________________________________________________");
                System.out.println("-       Que son los Datos Primitivos              -");
                System.out.println("___________________________________________________");
                System.out.println("- Los tipos primitivos en Java incluyen           -");
                System.out.println("- tipos de datos enteros, de punto flotante,      -");
                System.out.println("- booleanos y de caracteres, y están diseñados    -");
                System.out.println("- para contener valores básicos sin ningún método -");
                System.out.println("- o  comportamiento asociado con ellos            -");
                System.out.println("___________________________________________________");



                System.out.println("Presione Enter para continuar......................");

                scanner.nextLine(); // Captura el salto de línea restante
                scanner.nextLine(); // Espera a que el usuario presione Enter
                break;

            case 2:

                System.out.println("2. Que son los String");
                System.out.println("2. Que son los String");
                System.out.println("2. Que son los String");
                System.out.println("2. Que son los String");
                System.out.println("2. Que son los String");

                System.out.println("Presione Enter para continuar......................");

                scanner.nextLine(); // Captura el salto de línea restante
                scanner.nextLine(); // Espera a que el usuario presione Enter
                break;

            case 3:
                System.out.println("3.Que son las Constantes");
                break;
            case 4:
                System.out.println("4. Que tipos de Operadores hay");
                break;
            case 5:
                System.out.println("5. Condicionales IF,ELSE IF, ELSE");
                break;
            case 6:
                System.out.println("6. Condicional Switch");
                break;
            case 7:
                System.out.println("7. Condicional Ternaria");
                break;
            case 8:
                System.out.println("8. Bucle DO While");
                break;
            case 9:
                System.out.println("9. Bucle While");
                break;
            case 10:
                System.out.println("10. Bucle FOR");
                break;
            default:
                System.out.println("0. Salir");
                break;


        }}}