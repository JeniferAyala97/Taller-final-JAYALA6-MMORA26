package explicaciones;

import java.util.Scanner;

public class Detalle {


    public static void detalleByte() {

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

    }

    public static void detalleShort() {

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
    }

    public static void detalleInt() {

        System.out.println("___________________________________________________");
        System.out.println("-                  3. Int:                        -");
        System.out.println("-                                                 -");
        System.out.println("- El tipo de dato entero más comúnmente usado     -");
        System.out.println("-                                                 -");
        System.out.println("-   Ejemplo:       'int salario = 350000;'        -");
        System.out.println("-                                                 -");
        System.out.println("___________________________________________________");
        System.out.println("Presione enter para volver al menú.................");
    }

    public static void detalleLong () {

        System.out.println("___________________________________________________");
        System.out.println("-                  4. Long:                       -");
        System.out.println("-                                                 -");
        System.out.println("- Utilizado para valores enteros muy grandes      -");
        System.out.println("-                                                 -");
        System.out.println("-   Ejemplo:    'long distancia = 45265444444l;'  -");
        System.out.println("-                                                 -");
        System.out.println("___________________________________________________");
        System.out.println("Presione enter para volver al menú.................");
}
    public static void detalleFloat () {

        System.out.println("___________________________________________________");
        System.out.println("-                  5. Float:                      -");
        System.out.println("-                                                 -");
        System.out.println("- Números en coma flotante de precisión simple.   -");
        System.out.println("-                                                 -");
        System.out.println("-   Ejemplo:    'float precio = 45.236e;'         -");
        System.out.println("-                                                 -");
        System.out.println("___________________________________________________");
        System.out.println("Presione enter para volver al menú.................");

    }

    public static void detalleDouble (){

        System.out.println("___________________________________________________");
        System.out.println("-                  6. Double:                     -");
        System.out.println("-                                                 -");
        System.out.println("- Números en coma flotante en doble precisión     -");
        System.out.println("-                                                 -");
        System.out.println("-   Ejemplo:    'double pi = 3.1415926535;'       -");
        System.out.println("-                                                 -");
        System.out.println("___________________________________________________");
        System.out.println("Presione enter para volver al menú.................");

    }

    public static void detalleChar () {

        System.out.println("___________________________________________________");
        System.out.println("-                  7. Char:                       -");
        System.out.println("-                                                 -");
        System.out.println("- Almacena un solo carácter Unicode               -");
        System.out.println("-                                                 -");
        System.out.println("-   Ejemplo:    'char inicial ='j';'              -");
        System.out.println("-                                                 -");
        System.out.println("___________________________________________________");
        System.out.println("Presione enter para volver al menú.................");

    }

    public static void detalleBoolean (){

        System.out.println("___________________________________________________");
        System.out.println("-                  8. Boolean:                    -");
        System.out.println("-                                                 -");
        System.out.println("- Almacena valores de verdad                      -");
        System.out.println("-                                                 -");
        System.out.println("-   Ejemplo:   'boolean esMayorDeEdad = true;'    -");
        System.out.println("-                                                 -");
        System.out.println("___________________________________________________");
        System.out.println("Presione enter para volver al menú.................");
    }

    public static void detalleAritmeticos () {

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

    }

    public static void detalleRelacionales  () {

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

    }

    public static void detalleLogicos () {

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
    }

    public static void detalleAsignacion () {

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

    }

    public static void detalleIncreDecre () {

        System.out.println("___________________________________________________________");
        System.out.println("-             5. Incremento/Decremento:                   -");
        System.out.println("-                                                         -");
        System.out.println("-  ++: Incrementa el valor del operando en 1              -");
        System.out.println("-      Ejm: int a = 5; a++;                               -");
        System.out.println("-  --: Decrementa el valor del operando en 1              -");
        System.out.println("-      Ejm: int a = 5; a--;                               -");
        System.out.println("___________________________________________________________");
        System.out.println("Presione enter para volver al menú ........................");
    }

    public static void detalleIf () {

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
    }

    public static void detalleElseif () {

        System.out.println("___________________________________________________________");
        System.out.println("-                  2. Else if:                            -");
        System.out.println("-                                                         -");
        System.out.println("-  Es posible que necesitemos crear un condicional        -");
        System.out.println("-  múltiple con más de 2 condiciones                      -");
        System.out.println("___________________________________________________________");
        System.out.println("_                    Ejemplo                              _");
        System.out.println("___________________________________________________________");

    }

    public static void detalleElse () {

        System.out.println("___________________________________________________________");
        System.out.println("-                    3. Else:                             -");
        System.out.println("-                                                         -");
        System.out.println("-  Se puede dar el caso que queramos establecer una       -");
        System.out.println("-  alternativa a una condición, Para eso utilizamos el    -");
        System.out.println("-  if seguido de un else                                  -");
        System.out.println("___________________________________________________________");
        System.out.println("_                    Ejemplo                              _");
        System.out.println("___________________________________________________________");

    }


}