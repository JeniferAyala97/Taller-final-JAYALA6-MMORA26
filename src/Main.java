import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scannerJeni = new Scanner(System.in);

        System.out.println("___________________________________________________");
        System.out.println("-          Menú taller de programacion            -");
        System.out.println("-               Pre Hackaton                      -");
        System.out.println("___________________________________________________");
        System.out.println("-             1. Datos Primitivos                 -");
        System.out.println("-             2. String                           -");
        System.out.println("-             3. Constantes                       -");
        System.out.println("-             4. Tipo de Operadores               -");
        System.out.println("-             5. Condicional IF,ELSE IF,ELSE      -");
        System.out.println("-             6. Condicional SWICTH               -");
        System.out.println("-             7. Condicional Ternaria             -");
        System.out.println("-             8. Bucle DO WHILE                   -");
        System.out.println("-             9. Bucle WHILE                      -");
        System.out.println("-             10.Bucle FOR                        -");
        System.out.println("-              0.Salir                            -");
        System.out.println("___________________________________________________");

        Scanner scanner = new Scanner(System.in);

// variables 1 2 3 4 5 6 7 8 9 10 0

        System.out.print("Seleccione un ítem :");
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
                System.out.println("-  1. Aritméticos                                 -");
                System.out.println("-  2. Relacionales                                -");
                System.out.println("-  3. Logicos                                     -");
                System.out.println("-  4. Asignación                                  -");
                System.out.println("-  5. Incremento/Decremento                       -");
                System.out.println("___________________________________________________");
                //////////  ///
                System.out.println("Ingrese una opción");
                int JEN2 = scannerJeni.nextInt();

                if (JEN2 == 1) {
                    System.out.println("___________________________________________________");
                    System.out.println("-               1 ARITMÉTICOS:                    -");
                    System.out.println("-                                                 -");
                    System.out.println("-   +: suma dos operandos Ejm: int suma =9+5      -");
                    System.out.println("-   -: Resta el segundo operador del primero      -");
                    System.out.println("-           Ejm: int resta =2-6;                  -");
                    System.out.println("-   *: Multiplica dos operadores                  -");
                    System.out.println("-           Ejm: multiplicacion =8+6              -");
                    System.out.println("-   /: Divide el primer operador por el segundo   -");
                    System.out.println("-           Ejm: int division =7/4                -");
                    System.out.println("-   %: Divide el primer operador por el segundo   -");
                    System.out.println("-           Ejm: int division =7/4                -");
                    System.out.println("___________________________________________________");
                    System.out.println("Presione enter para volver al menú.................");

                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;
                }


                if (JEN2 == 2) {
                    System.out.println("________________________________________________________");
                    System.out.println("-                  2 Relacionales:                     -");
                    System.out.println("-                                                      -");
                    System.out.println("-  ==: Comprueba si los valores de dos operadores      -");
                    System.out.println("-      son iguales  Ejm: int suma =  (4==6)            -");
                    System.out.println("-  !=: Comprueba si los valores de dos operadores no   -");
                    System.out.println("-      no son iguales  Ejm: Boolean noEsIgual =(5!=3); -");
                    System.out.println("-  >:  Comprueba si el valor del primer operador es    -");
                    System.out.println("-      mayor que el segundo Ejm: Boolean mayor =(4>3)  -");
                    System.out.println("-  <:  Comprueba si el valor del primer operador es    -");
                    System.out.println("-      menor que el segundo Ejm: Boolean menor =(9>3)  -");
                    System.out.println("-  %:  Divide el primer operador por el segundo        -");
                    System.out.println("-      Ejm: int division =7/4                          -");
                    System.out.println("________________________________________________________");

                    System.out.println("Presione enter para volver al menú .....................");

                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;

                }


                if (JEN2 == 3) {
                    System.out.println("________________________________________________________");
                    System.out.println("-                  3. Logicos:                         -");
                    System.out.println("-                                                      -");
                    System.out.println("-  &&: Devuelve true si ambos operadores son true      -");
                    System.out.println("-      Ejm: Boolean resultado = (8>4 && 1<7)           -");
                    System.out.println("-  ||: Devuelve true si al menos una de ellas es true  -");
                    System.out.println("-      Ejm: Boolean resultado = (8>4 || 1<7)           -");
                    System.out.println("-   !: Invierte el valor de un operando booleano       -");
                    System.out.println("-      Ejm: Boolean resultado = !(8>4);                -");
                    System.out.println("________________________________________________________");

                    System.out.println("Presione enter para volver al menú .....................");

                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;
                }
                if (JEN2 == 4) {

                    System.out.println("____________________________________________________________");
                    System.out.println("-                    4. Asignación:                        -");
                    System.out.println("-                                                          -");
                    System.out.println("-   =: Asigna el valor del operando derecho al             -");
                    System.out.println("-      operador izquiedo                                   -");
                    System.out.println("-      Ejm: int a = 5;                                     -");
                    System.out.println("-  +=: Suma el operando derecho al operando izquierdo      -");
                    System.out.println("-      y asigna el resultado al operador izquierdo         -");
                    System.out.println("-      Ejm: int a = 5; a += 3;                             -");
                    System.out.println("-  -=: Resta el operando derecho del operando izquierdo    -");
                    System.out.println("-      y asigna el resultado al operador izquierdo         -");
                    System.out.println("-      Ejm: int a = 5; a -= 3;                             -");
                    System.out.println("-  *=: Multiplica el operando derecho por el operando      -");
                    System.out.println("-      izquierdo y asigna el resultado al operador         -");
                    System.out.println("-      izquierdo                                           -");
                    System.out.println("-      Ejm: int a = 5; a *= 3;                             -");
                    System.out.println("-  /=: Divide el operando izquierdo por el operando        -");
                    System.out.println("-      derecho y asigna el resultado al operando izquierdo -");
                    System.out.println("-      Ejm: int a = 6; a /= 3;                             -");
                    System.out.println("-  %=: Calcula el módulo del operando izquierdo por el     -");
                    System.out.println("-      operando derecho y asigna el resultado al operador  -");
                    System.out.println("-      izquierdo                                           -");
                    System.out.println("-      Ejm: int a = 5; a %= 3;                             -");
                    System.out.println("____________________________________________________________");


                    System.out.println("Presione enter para volver al menú .........................");

                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;
                }


                if (JEN2 == 5) {

                    System.out.println("___________________________________________________________");
                    System.out.println("-             5. Incremento/Decremento:                   -");
                    System.out.println("-                                                         -");
                    System.out.println("-  ++: Incrementa el valor del operando en 1              -");
                    System.out.println("-      Ejm: int a = 5; a++;                               -");
                    System.out.println("-  --: Decrementa el valor del operando en 1              -");
                    System.out.println("-      Ejm: int a = 5; a--;                               -");
                    System.out.println("___________________________________________________________");
                    System.out.println("Presione enter para volver al menú ........................");

                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;
                }
                
            case 5:

                System.out.println("___________________________________________________");
                System.out.println("-         Condicional IF,ELSE IF,ELSE             -");
                System.out.println("___________________________________________________");
                System.out.println("-  1. IF                                          -");
                System.out.println("-  2. ElSE IF                                     -");
                System.out.println("-  3. ELSE                                        -");
                System.out.println("___________________________________________________");
                //////////  ///
                System.out.println("Ingrese una opción");
                int JEN3 = scannerJeni.nextInt();

                if (JEN3 == 1) {

                    System.out.println("___________________________________________________________");
                    System.out.println("-                       1. if:                            -");
                    System.out.println("-                                                         -");
                    System.out.println("-  Con este se indica en el programa que se tome un       -");
                    System.out.println("-  cambio sólo si se cumple la condición que se           -");
                    System.out.println("___________________________________________________________");
                    System.out.println("_                    Ejemplo                              _");
                    System.out.println("___________________________________________________________");


                    System.out.println("Presione enter para volver al menú ........................");

                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;
                }

                if (JEN3 == 2) {

                    System.out.println("___________________________________________________________");
                    System.out.println("-                  2. Else if:                            -");
                    System.out.println("-                                                         -");
                    System.out.println("-  Es posible que necesitemos crear un condicional        -");
                    System.out.println("-  múltiple con más de 2 condiciones                      -");
                    System.out.println("___________________________________________________________");
                    System.out.println("_                    Ejemplo                              _");
                    System.out.println("___________________________________________________________");


                    System.out.println("Presione enter para volver al menú ........................");

                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;
                }
                if (JEN3 == 3) {

                    System.out.println("___________________________________________________________");
                    System.out.println("-                    3. Else:                             -");
                    System.out.println("-                                                         -");
                    System.out.println("-  Se puede dar el caso que queramos establecer una       -");
                    System.out.println("-  alternativa a una condición, Para eso utilizamos el    -");
                    System.out.println("-  if seguido de un else                                  -");
                    System.out.println("___________________________________________________________");
                    System.out.println("_                    Ejemplo                              _");
                    System.out.println("___________________________________________________________");


                    System.out.println("Presione enter para volver al menú ........................");

                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;
                }

            case 6:
                System.out.println("7. Condicional Ternaria");
                break;
            case 7:
                System.out.println("8. Bucle DO While");
                break;
            case 8:
                System.out.println("9. Bucle While");
                break;
            case 9:
                System.out.println("10. Bucle FOR");
                break;
            default:
                System.out.println("0. Salir");
                break;


        }}}