import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opciones = 0;
        do {

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
            System.out.println("-             7. Condicionales Ternarias          -");
            System.out.println("-             8. Bucle DO WHILE                   -");
            System.out.println("-             9. Bucle WHILE                      -");
            System.out.println("-             10.Bucle FOR                        -");
            System.out.println("-              0.Salir                            -");
            System.out.println("___________________________________________________");

            Scanner scanner = new Scanner(System.in);

            // variables 1 2 3 4 5 6 7 8 9 10 0

            System.out.print("Seleccione un ítem :");
            int opciones5 = scanner.nextInt();

            switch (opciones5) {

                case 1:
                    System.out.println("___________________________________________________");
                    System.out.println("-       1. Que son los Datos Primitivos           -");
                    System.out.println("___________________________________________________");
                    System.out.println("- Los tipos primitivos en Java incluyen           -");
                    System.out.println("- tipos de datos enteros, de punto flotante,      -");
                    System.out.println("- booleanos y de caracteres, y están diseñados    -");
                    System.out.println("- para contener valores básicos sin ningún método -");
                    System.out.println("- o  comportamiento asociado con ellos:           -");
                    System.out.println("-                                                 -");
                    System.out.println("-                  1. Byte                        -");
                    System.out.println("-                  2. Short                       -");
                    System.out.println("-                  3. Int                         -");
                    System.out.println("-                  4. long                        -");
                    System.out.println("-                  5. Float                       -");
                    System.out.println("-                  6. Bouble                      -");
                    System.out.println("-                  7. Char                        -");
                    System.out.println("-                  8. Boolean                     -");
                    System.out.println("-                  0. Salir                       -");
                    System.out.println("___________________________________________________");
                    //////////  ///
                    System.out.println("Ingrese una opción");
                    int JEN1 = scannerJeni.nextInt();


                    if (JEN1 == 1) {

                        System.out.println("___________________________________________________");
                        System.out.println("-                  1. Byte:                       -");
                        System.out.println("-                                                 -");
                        System.out.println("-   Utilizado para datos pequeños y optimización  -");
                        System.out.println("-   de memoria en arrays grandes                  -");
                        System.out.println("-                                                 -");
                        System.out.println("-   Ejemplo:     'byte edad = 56;'                -");
                        System.out.println("-                                                 -");
                        System.out.println("___________________________________________________");
                        System.out.println("Presione enter para volver al menú.................");

                        scanner.nextLine(); // Captura el salto de línea restante
                        scanner.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    }

                    if (JEN1 == 2) {

                        System.out.println("___________________________________________________");
                        System.out.println("-                  2. Short:                      -");
                        System.out.println("-                                                 -");
                        System.out.println("- Útil para datos numéricos más grandes que byte  -");
                        System.out.println("- pero aún mas pequeños.                          -");
                        System.out.println("-                                                 -");
                        System.out.println("-   Ejemplo:       'short año = 2019;'            -");
                        System.out.println("-                                                 -");
                        System.out.println("___________________________________________________");
                        System.out.println("Presione enter para volver al menú.................");

                        scanner.nextLine(); // Captura el salto de línea restante
                        scanner.nextLine(); // Espera a que el usuario presione Enter
                        break;

                    }

                    if (JEN1 == 3) {

                        System.out.println("___________________________________________________");
                        System.out.println("-                  3. Int:                        -");
                        System.out.println("-                                                 -");
                        System.out.println("- El tipo de dato entero más comúnmente usado     -");
                        System.out.println("-                                                 -");
                        System.out.println("-   Ejemplo:       'int salario = 350000;'        -");
                        System.out.println("-                                                 -");
                        System.out.println("___________________________________________________");
                        System.out.println("Presione enter para volver al menú.................");

                        scanner.nextLine(); // Captura el salto de línea restante
                        scanner.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    }

                    if (JEN1 == 4) {

                        System.out.println("___________________________________________________");
                        System.out.println("-                  4. Long:                       -");
                        System.out.println("-                                                 -");
                        System.out.println("- Utilizado para valores enteros muy grandes      -");
                        System.out.println("-                                                 -");
                        System.out.println("-   Ejemplo:    'long distancia = 45265444444l;'  -");
                        System.out.println("-                                                 -");
                        System.out.println("___________________________________________________");
                        System.out.println("Presione enter para volver al menú.................");

                        scanner.nextLine(); // Captura el salto de línea restante
                        scanner.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    }

                    if (JEN1 == 5) {

                        System.out.println("___________________________________________________");
                        System.out.println("-                  5. float:                      -");
                        System.out.println("-                                                 -");
                        System.out.println("- Números en coma flotante de precisión simple.   -");
                        System.out.println("-                                                 -");
                        System.out.println("-   Ejemplo:    'float precio = 45.236e;'         -");
                        System.out.println("-                                                 -");
                        System.out.println("___________________________________________________");
                        System.out.println("Presione enter para volver al menú.................");

                        scanner.nextLine(); // Captura el salto de línea restante
                        scanner.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    }

                    if (JEN1 == 6) {

                        System.out.println("___________________________________________________");
                        System.out.println("-                  6. Double:                     -");
                        System.out.println("-                                                 -");
                        System.out.println("- Números en coma flotante en doble precisión     -");
                        System.out.println("-                                                 -");
                        System.out.println("-   Ejemplo:    'double pi = 3.1415926535;'       -");
                        System.out.println("-                                                 -");
                        System.out.println("___________________________________________________");
                        System.out.println("Presione enter para volver al menú.................");

                        scanner.nextLine(); // Captura el salto de línea restante
                        scanner.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    }

                    if (JEN1 == 7) {

                        System.out.println("___________________________________________________");
                        System.out.println("-                  7. char:                       -");
                        System.out.println("-                                                 -");
                        System.out.println("- Almacena un solo carácter Unicode               -");
                        System.out.println("-                                                 -");
                        System.out.println("-   Ejemplo:    'char inicial ='j';'              -");
                        System.out.println("-                                                 -");
                        System.out.println("___________________________________________________");
                        System.out.println("Presione enter para volver al menú.................");

                        scanner.nextLine(); // Captura el salto de línea restante
                        scanner.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    }

                    if (JEN1 == 8) {

                        System.out.println("___________________________________________________");
                        System.out.println("-                  8. Boolean:                    -");
                        System.out.println("-                                                 -");
                        System.out.println("- Almacena valores de verdad                      -");
                        System.out.println("-                                                 -");
                        System.out.println("-   Ejemplo:   'boolean esMayorDeEdad = true;'    -");
                        System.out.println("-                                                 -");
                        System.out.println("___________________________________________________");
                        System.out.println("Presione enter para volver al menú.................");

                        scanner.nextLine(); // Captura el salto de línea restante
                        scanner.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    }
                    if (JEN1 == 0) {

                        System.out.println("Salir");
                        break;
                    }

                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;

                case 2:

                    System.out.println("__________________________________________________");
                    System.out.println("-             2.Que son los String               -");
                    System.out.println("__________________________________________________");
                    System.out.println("-Son un objeto que nos permiten almecenar muchos -");
                    System.out.println("-caracteres                                      -");
                    System.out.println("-                                                -");
                    System.out.println("-  Ejemplo:                                      -");
                    System.out.println("-    ° String mensaje = Hola + nombre;           -");
                    System.out.println("-    ° String nombre = Camilo                    -");
                    System.out.println("-    //Resultado: mensaje= 'Hola Camilo'         -");
                    System.out.println("__________________________________________________");

                    System.out.println("Presione Enter para continuar......................");

                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;

                case 3:
                    System.out.println("___________________________________________________");
                    System.out.println("-           3.Que son las constantes              -");
                    System.out.println("___________________________________________________");
                    System.out.println("- Es un valor que no cambia durante la ejecución  -");
                    System.out.println("- del programa, se utilizan para representar      -");
                    System.out.println("- valores fijos y de lectura única lo que ayuda   -");
                    System.out.println("- a que el código sea más legible y menos propenso-");
                    System.out.println("- a errores                                       -");
                    System.out.println("-                                                 -");
                    System.out.println("-    Ejemplo:                                     -");
                    System.out.println("-                                                 -");
                    System.out.println("- 'Public static final int TIEMPO_ESPERA = 50;    -");
                    System.out.println("- 'Public static boolean MODO_DEPURACION = true;  -");
                    System.out.println("___________________________________________________");
                    System.out.println("Presione Enter para continuar......................");

                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;

                case 4:
                    System.out.println("___________________________________________________");
                    System.out.println("-           4. Tipos de Operadores                -");
                    System.out.println("___________________________________________________");
                    System.out.println("-  1. Aritméticos                                 -");
                    System.out.println("-  2. Relacionales                                -");
                    System.out.println("-  3. Logicos                                     -");
                    System.out.println("-  4. Asignación                                  -");
                    System.out.println("-  5. Incremento/Decremento                       -");
                    System.out.println("-  6. Salir                                       -");
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

                    if (JEN2 == 6) {

                        System.out.println("Salir");
                        break;
                    }

                case 5:

                    System.out.println("___________________________________________________");
                    System.out.println("-        5.Condicional IF,ELSE IF,ELSE            -");
                    System.out.println("___________________________________________________");
                    System.out.println("-  1. If                                          -");
                    System.out.println("-  2. Else if                                     -");
                    System.out.println("-  3. Else                                        -");
                    System.out.println("-  4. Salir                                       -");
                    System.out.println("___________________________________________________");

                    System.out.println("Ingrese una opción");
                    int JEN3 = scannerJeni.nextInt();

                    if (JEN3 == 1) {

                        System.out.println("___________________________________________________________");
                        System.out.println("-                       1. if:                            -");
                        System.out.println("-                                                         -");
                        System.out.println("-  se utiliza para evaluar una expresión condicional si   -");
                        System.out.println("-  se cumple la condición (es verdadera)  , ejecutará un  -");
                        System.out.println("-  bloque de código. Si es falsa, es posible ejecutar     -");
                        System.out.println("-  otras sentencias.                                      -");
                        System.out.println("___________________________________________________________");
                        System.out.println("_                    Ejemplo                              _");
                        System.out.println("___________________________________________________________");
                        Scanner numero = new Scanner(System.in);
                        int n, n2;
                        int resultado;

                        do {
                            System.out.println("Escriba un numero mayor a 6:");
                            n = numero.nextInt();
                            if (n < 6) {
                                System.out.println("vuelve a intentarlo");
                            }
                        } while (n <= 6);

                        do {
                            System.out.println("Escriba un numero menor a 6:");
                            n2 = numero.nextInt();
                            if (n2 > 6) {
                                System.out.println("vuelve a intentarlo");
                            }
                        } while (n2 >= 6);

                        resultado = n + n2;
                        System.out.println(resultado);

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
                        int numero1, numero2, numero3;

                        Scanner entrada = new Scanner(System.in);
                        System.out.print("Ingrese un numero: ");
                        numero1 = entrada.nextInt();
                        System.out.print("Ingrese un numero: ");
                        numero2 = entrada.nextInt();
                        System.out.print("Ingrese un numero: ");
                        numero3 = entrada.nextInt();


                        if ((numero1 > numero2) && (numero2 > numero3)) {
                            System.out.println("El orden es: " + numero1 + numero2 + numero3);
                        } else if ((numero1 > numero3) && (numero3 > numero2)) {
                            System.out.println("El orden es: " + numero1 + numero2 + numero3);
                        } else if ((numero2 > numero1) && (numero1 > numero3)) {
                            System.out.println("El orden es: " + numero2 + numero1 + numero3);
                        } else if ((numero2 > numero3) && (numero3 > numero1)) {
                            System.out.println("El orden es: " + numero2 + numero3 + numero1);
                        } else if ((numero3 > numero2) && (numero2 > numero1)) {
                            System.out.println("El orden es: " + numero3 + numero2 + numero1);
                        } else {
                            System.out.println("El orden es: " + numero3 + numero1 + numero2);
                        }

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
                        // Leer los tres valores
                        System.out.print("Ingrese el valor para A: ");
                        double A = scanner.nextDouble();
                        System.out.print("Ingrese el valor para B: ");
                        double B = scanner.nextDouble();
                        System.out.print("Ingrese el valor para C: ");
                        double C = scanner.nextDouble();

                        if (A == B || A == C || B == C)
                            System.out.println("Error: Los valores deben ser distintos.");
                        else {
                            double mayor = A;
                            double menor = A;

                            if (B > mayor) {
                                mayor = B;
                            }
                            if (C > mayor) {
                                mayor = C;
                            }
                            if (B < menor) {
                                menor = B;
                            }
                            if (C < menor) {
                                menor = C;
                            }
                            System.out.println("El valor mayor es: " + mayor);
                            System.out.println("El valor menor es: " + menor);
                        }


                        System.out.println("Presione enter para volver al menú ........................");

                        scanner.nextLine(); // Captura el salto de línea restante
                        scanner.nextLine(); // Espera a que el usuario presione Enter
                        break;
                    }
                    if (JEN3 == 4) {

                        System.out.println("Salir");
                        break;
                    }

                case 6:

                    System.out.println("___________________________________________________");
                    System.out.println("-            6. Condicional SWICTH                -");
                    System.out.println("___________________________________________________");
                    System.out.println("- permite definir casos específicos a realizar    -");
                    System.out.println("- cuando la variable expuesta como condición sea  -");
                    System.out.println("- igual a los valores que se especifican mediante -");
                    System.out.println("- cada case                                       -");
                    System.out.println("___________________________________________________");
                    System.out.println("_                    Ejemplo                      _");
                    System.out.println("___________________________________________________");

                    Scanner scanner1 = new Scanner(System.in);

                    System.out.println("Menu");
                    System.out.println("1-Sumar");
                    System.out.println("2-restar");
                    System.out.println("3-salida");

                    int JEN35 = scanner1.nextInt();
                    if (JEN35 == 1) {
                        System.out.println("1.suma");
                        break;
                    }

                    if (JEN35 == 2) {
                        System.out.println("2.resta");
                        break;
                    }
                    if (JEN35 == 3) {
                        System.out.println("3.salir");
                    }
                    break;


                case 7:

                    System.out.println("___________________________________________________");
                    System.out.println("-         7. Condicionales Ternarias              -");
                    System.out.println("___________________________________________________");
                    System.out.println("- Es una herramienta esencial que permite evaluar -");
                    System.out.println("- una expresión condicional de manera concisa y   -");
                    System.out.println("- efectiva, esta función se compone de tres partes-");
                    System.out.println("- fundamentales: una condición a evaluar, un valor-");
                    System.out.println("- a retornar en caso de que la condición  sea     -");
                    System.out.println("- verdadera y un valor a retornar en caso de que  -");
                    System.out.println("- la condición sea falsa                          -");
                    System.out.println("___________________________________________________");
                    System.out.println("_                    Ejemplo                      _");
                    System.out.println("___________________________________________________");
                    Scanner input = new Scanner(System.in);
                    System.out.println("Ingresa edad:");

                    byte edad = input.nextByte();

                    System.out.println(edad >= 18 ? "Mayor de edad." : "Menor de edad.");

                    System.out.println("Presione enter para volver al menú ................");

                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;

                case 8:

                    System.out.println("____________________________________________________");
                    System.out.println("-              8. Bucle DO WHILE                   -");
                    System.out.println("____________________________________________________");
                    System.out.println("- Es una estructura de control que repite un bloque-");
                    System.out.println("- de código al menos una vez,y luego verifica una  -");
                    System.out.println("- condición para decidir si continuar o salir del  -");
                    System.out.println("- bucle.                                           -");
                    System.out.println("____________________________________________________");
                    System.out.println("_                    Ejemplo                       _");
                    System.out.println("____________________________________________________");

                    Scanner opcion8 = new Scanner(System.in);
                    int numero;

                    do {
                        System.out.println("Ingrese un numero: ");
                        numero = opcion8.nextInt();
                    }
                    while (numero <= 18);

                    System.out.println("Presione enter para volver al menú ................");

                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;

                case 9:

                    System.out.println("____________________________________________________");
                    System.out.println("-              9. Bucle WHILE                      -");
                    System.out.println("____________________________________________________");
                    System.out.println("- Es una estructura de control que repite un bloque-");
                    System.out.println("- de código mientras una condición se evalúe como  -");
                    System.out.println("- verdadera.                                       -");
                    System.out.println("____________________________________________________");
                    System.out.println("_                    Ejemplo                       _");
                    System.out.println("____________________________________________________");
                    int dato = 1;
                    while (dato <= 15) {
                        System.out.print(dato);
                        dato = dato + 1;
                        System.out.println(" - ");
                        dato = dato + 1;

                    }
                    System.out.println("Presione enter para volver al menú ................");
                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;

                case 10:

                    System.out.println("____________________________________________________");
                    System.out.println("-              10. Bucle FOR                       -");
                    System.out.println("____________________________________________________");
                    System.out.println("- Es una estructura de control que permite repetir -");
                    System.out.println("- un bloque de código un número específico de veces-");
                    System.out.println("- Es una de las estructuras de control más         -");
                    System.out.println("- utilizadas y frecuentes..                        -");
                    System.out.println("____________________________________________________");
                    System.out.println("_                    Ejemplo                       _");
                    System.out.println("____________________________________________________");

                    for (int i = 0; i < 3; i++) {
                        int cuentac = 3 - i;
                        for (int j = 0; j < cuentac; j++)
                            System.out.print("°");
                        System.out.println();
                    }
                    System.out.println("Presione enter para volver al menú ................");

                    scanner.nextLine(); // Captura el salto de línea restante
                    scanner.nextLine(); // Espera a que el usuario presione Enter
                    break;

                default:
                    System.out.println("0.salir");

            }
        }
        
        while (opciones!= 11) ;
        System.out.println("0. Salir");


    }


}

