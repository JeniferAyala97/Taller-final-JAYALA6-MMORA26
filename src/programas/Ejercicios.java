package programas;

import java.util.Scanner;

public class Ejercicios {

    private static Scanner scanner;

    public static void ejerciciosIf () {

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
    }

    public static void ejercicioElseif () {

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
    }

    public static void ejerciciosElse () {

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

    }

    public static void ejerciciosSwit () {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1-Sumar");
        System.out.println("2-restar");
        System.out.println("3-salida");

        int JEN35 = scanner1.nextInt();
        if (JEN35 == 1) {
            System.out.println("1.suma");
        }

        if (JEN35 == 2) {
            System.out.println("2.resta");
        }
        if (JEN35 == 3) {
            System.out.println("3.salir");
        }
    }

    public static void ejerciciosTernarias () {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa edad:");

        byte edad = input.nextByte();

        System.out.println(edad >= 18 ? "Mayor de edad." : "Menor de edad.");

        System.out.println("Presione enter para volver al menú ................");
        scanner.nextLine(); // Captura el salto de línea restante
        scanner.nextLine(); // Espera a que el usuario presione Enter

    }

    public static void ejerciciosDowhile () {

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

    }

    public static void ejerciciosWhile () {

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
    }

    public static void ejerciciosFor () {

        for (int i = 0; i < 3; i++) {
            int cuentac = 3 - i;
            for (int j = 0; j < cuentac; j++)
                System.out.print("°");
            System.out.println();
        }
        System.out.println("Presione enter para volver al menú ................");

        scanner.nextLine(); // Captura el salto de línea restante
        scanner.nextLine(); // Espera a que el usuario presione Enter

    }


}
