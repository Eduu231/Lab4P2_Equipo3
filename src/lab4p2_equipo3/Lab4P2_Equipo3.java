package lab4p2_equipo3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Set;
public class Lab4P2_Equipo3 {
    static Random rng = new Random();
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Entrenador> caja = new ArrayList();
        ArrayList listaE = new ArrayList();
        ArrayList pA = new ArrayList();
        int opcion = 0;

        while (opcion != 4) {

            opcion = menuInicial();

            switch (opcion) {
                case 1: {
                    read.nextLine();
                    System.out.println("Ingrese el nombre: ");
                    String nombre = read.nextLine();
                    System.out.println("Ingrese la edad: ");
                    int edad = read.nextInt();
                    System.out.println("Ingrese el dinero de su cuenta: ");
                    Double dinero = read.nextDouble();
                    read.nextLine();
                    System.out.println("Ingresar sus 6 pokemones: ");
                    int opcion2 = 0;
                    while (opcion2 != 5) {
                        opcion2 = menuPokemon();

                        switch (opcion2) {
                            case 1: {
                                System.out.println("Ingrese su especie: ");
                                String especie = read.nextLine();
                                
                                while (){
                                    System.out.println("Ingrese ataque fisico o de estado: ");
                                    switch(opcion3){
                                        case 1:{
                                            read.nextLine();
                                            System.out.println("Ingrese un ataque fisico o especial: ");
                                            String ataque = read.nextLine();
                                            int stat = 1 + rng.nextInt(50);
                                            break;
                                        }
                                        case 2:{
                                            int opcion4 = 0;
                                            while (opcion4 != 5){
                                                opcion4 = menuEstado();
                                                switch (opcion4){
                                                    case 1:{
                                                     
                                                        
                                                        break;
                                                    }
                                                    case 2:{
                                                        
                                                        
                                                        break;
                                                    }
                                                    case 3:{
                                                        break;
                                                    }
                                                    case 4:{
                                                        break;
                                                    }
                                                    case 5:{
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                            case 2: {
                                break;
                            }
                            case 3: {
                                break;
                            }
                            case 4: {
                                break;
                            }
                            case 5: {
                                break;
                            }
                        }
                    }

                    Pokemon[] p = new Pokemon[6];

                    listaE.add(new Entrenador(nombre, edad, dinero, p, caja));

                    break;
                }
                case 2: {

                    break;
                }
                case 3: {

                    break;
                }
                case 4: {

                    break;
                }
                case 5: {
                    System.out.println("Salir");
                    break;
                }
            }
        }

    }

    private static int menuEstado() {
        int op = 0;

        System.out.println("""
                           1- Toxic
                           2- Will O Wisp
                           3- Thunder Wave
                           4- Hypnosis
                           5- Salir
                           """);

        op = read.nextInt();

        return op;
    }
    private static int menuInicial() {
        int op = 0;

        System.out.println("""
                           1- Registrar Entrenador
                           2- Battle Factory
                           3- Capturar/Entrenar
                           4- Añadir Movimientos
                           5- Salir
                           """);

        op = read.nextInt();

        return op;
    }

    private static void imprA(Pokemon[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + a[i] + "]");
        }
        System.out.println("");
    }

    private static int menuPokemon() {
        int op = 0;

        System.out.println("""
                           1- Agregar Pokemon
                           2- Modificar Pokemon
                           3- Listar Pokemon
                           4- Eliminar Pokemon
                           5- Salir
                           """);

        op = read.nextInt();

        return op;
    }

}
