import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("__________________________________________________");
        System.out.println("-          Menú taller de programacion           -");
        System.out.println("-               Pre Hackaton                     -");
        System.out.println("__________________________________________________");
        System.out.println("-             1. Datos Primitivos                -");
        System.out.println("-             2. String                          -");
        System.out.println("-             3. Constantes                      -");
        System.out.println("-             4. Tipo de Operadores              -");
        System.out.println("-             5. Condicional IF,ELSE IF,ELSE     -");
        System.out.println("-             6. Condicional SWICTH              -");
        System.out.println("-             7. Condicional Ternaria            -");
        System.out.println("-             8. Bucle DO WHILE                  -");
        System.out.println("-             9. Bucle WHILE                     -");
        System.out.println("-             10.Bucle FOR                       -");
        System.out.println("-              0.Salir                           -");
        System.out.println("__________________________________________________");

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

                System.out.println("__________________________________________________");
                System.out.println("-                Que son los String              -");
                System.out.println("__________________________________________________");
                System.out.println("-Son un objeto que nos permiten almecenar muchos -");
                System.out.println("-caracteres                                      -");
                System.out.println("-                                                -");
                System.out.println("-  Ejemplo:                                      -");
                System.out.println("-    ° String mensaje = Hola Amigos              -");
                System.out.println("-    ° String nombre = Camilo                    -");
                System.out.println("__________________________________________________");

                System.out.println("Presione Enter para continuar......................");

                scanner.nextLine(); // Captura el salto de línea restante
                scanner.nextLine(); // Espera a que el usuario presione Enter
                break;

            case 3:
                System.out.println("___________________________________________________");
                System.out.println("-            Que son las constantes               -");
                System.out.println("___________________________________________________");
                System.out.println("- Es un valor que no cambia durante la ejecución  -");
                System.out.println("- del programa, se utilizan para representar      -");
                System.out.println("- valores fijos y de lectura única lo que ayuda   -");
                System.out.println("- a que el código sea más legible y menos propenso-");
                System.out.println("- a errores                                       -");
                System.out.println("-                                                 -");
                System.out.println("-    Ejemplo:                                     -");
                System.out.println("-                                                 -");
                System.out.println("___________________________________________________");
                System.out.println("Presione Enter para continuar......................");

                scanner.nextLine(); // Captura el salto de línea restante
                scanner.nextLine(); // Espera a que el usuario presione Enter
                break;

            case 4:

                System.out.println("___________________________________________________");
                System.out.println("-              Tipos de Operadores                -");
                System.out.println("___________________________________________________");
                System.out.println("-  A. Aritméticos                                 -");
                System.out.println("-  B. Relacionales                                -");
                System.out.println("-  C. Logicos                                     -");
                System.out.println("-  D. Asignación                                  -");
                System.out.println("-  E. Incremento/Decremento                       -");
                System.out.println("___________________________________________________");

                System.out.println("Presione Enter para continuar......................");
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