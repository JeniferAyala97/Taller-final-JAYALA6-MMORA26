package ejecucion;

import explicaciones.Detalle;
import menus.MenuPrincipal;
import menus.SubMdos;
import menus.SubMenus;
import programas.Ejercicios;
import utilidades.Validaciones;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opciones = 0;
        do {

            Scanner scannerJeni = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);

            MenuPrincipal.menuPrincipal();

            int opciones5 = scanner.nextInt();


            switch (opciones5) {

                case 1:

                    SubMdos.subMdosDatosPrimitivos ();{

                }

                    int JEN1 = scannerJeni.nextInt();


                    if (JEN1 == 1) {

                        Detalle.detalleByte();{
                        }}

                Validaciones.validacionesScanner();
                        break;


                    if (JEN1 == 2) {

                        Detalle.detalleShort();{}
                        Validaciones.validacionesScanner();
                        break;

                    }

                    if (JEN1 == 3) {

                        Detalle.detalleInt();
                        Validaciones.validacionesScanner();
                        break;
                    }

                    if (JEN1 == 4) {

                        Detalle.detalleLong();
                        Validaciones.validacionesScanner();
                        break;
                    }

                    if (JEN1 == 5) {

                        Detalle.detalleFloat();
                        Validaciones.validacionesScanner();
                        break;
                    }

                    if (JEN1 == 6) {

                        Detalle.detalleDouble();
                        Validaciones.validacionesScanner();
                        break;
                    }

                    if (JEN1 == 7) {

                        Detalle.detalleChar();
                        Validaciones.validacionesScanner();
                        break;
                    }

                    if (JEN1 == 8) {

                        Detalle.detalleBoolean();
                        Validaciones.validacionesScanner();
                        break;
                    }
                    if (JEN1 == 0) {

                        System.out.println("Salir");
                        break;
                    }

                Validaciones.validacionesScanner();

                    break;

                case 2:

                    SubMenus.subMenusString();
                    Validaciones.validacionesScanner();
                    break;

                case 3:

                    SubMenus.subMenusContantes();
                    Validaciones.validacionesScanner();
                    break;

                case 4:

                    SubMdos.subMdosOperadores();

                    int JEN2 = scannerJeni.nextInt();

                    if (JEN2 == 1) {

                        Detalle.detalleAritmeticos();
                        Validaciones.validacionesScanner();
                        break;
                    }


                    if (JEN2 == 2) {

                        Detalle.detalleRelacionales();
                        Validaciones.validacionesScanner();
                        break;

                    }

                    if (JEN2 == 3) {

                        Detalle.detalleLogicos();
                        Validaciones.validacionesScanner();
                        break;
                    }
                    if (JEN2 == 4) {

                        Detalle.detalleAsignacion();
                        Validaciones.validacionesScanner();
                        break;
                    }

                    if (JEN2 == 5) {

                        Detalle.detalleIncreDecre();
                        Validaciones.validacionesScanner();
                        break;
                    }

                    if (JEN2 == 6) {

                        System.out.println("Salir");
                        break;
                    }

                case 5:

                    SubMdos.subMdosCondicionales();

                    int JEN3 = scannerJeni.nextInt();

                    if (JEN3 == 1) {

                        Detalle.detalleIf();
                        Ejercicios.ejerciciosIf();
                        Validaciones.validacionesScanner();
                        break;
                    }

                    if (JEN3 == 2) {

                        Detalle.detalleElseif();
                        Ejercicios.ejercicioElseif();
                        Validaciones.validacionesScanner();
                        break;
                    }
                    if (JEN3 == 3) {

                        Detalle.detalleElse();
                        Ejercicios.ejerciciosElse();
                        Validaciones.validacionesScanner();
                        break;
                    }
                    if (JEN3 == 4) {

                        System.out.println("Salir");
                        break;
                    }

                case 6:

                    SubMenus.subMenusSwicth();
                    Ejercicios.ejerciciosSwit();
                    Validaciones.validacionesScanner();
                    break;


                case 7:

                    SubMenus.subMenusTernarias();
                    Ejercicios.ejerciciosTernarias();

                    break;

                case 8:

                    SubMenus.subMenusDowhile();
                    Ejercicios.ejerciciosDowhile();
                    break;

                case 9:

                    SubMenus.subMenusWhile();
                    Ejercicios.ejerciciosWhile();
                    break;

                case 10:

                    SubMenus.subMenusFor();
                    Ejercicios.ejerciciosFor();
                    break;

                default:
                    System.out.println("0.salir");

            }
        }
        
        while (opciones!= 11) ;
        System.out.println("0. Salir");


    }


}

