package lab4p2_equipo3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Lab4P2_Equipo3 {

    static Random rng = new Random();
    static Scanner read = new Scanner(System.in);
    static ArrayList<Entrenador> listaE = new ArrayList();

    public static void main(String[] args) {
        //ArrayList caja = new ArrayList();
        
        ArrayList pA = new ArrayList();
        

        int opcion = 0;

        while (opcion != 4) {
            int cont2 = 0;
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
                    Pokemon[] p = new Pokemon[6];
                    ArrayList<Pokemon> caja = new ArrayList();

                    listaE.add(new Entrenador(nombre, edad, dinero, p, caja));

                    break;
                }
                case 2: {

                    break;
                }
                case 3: {
                    if(!listaE.isEmpty()){
                        System.out.println("Ingrese el entrenador que desea ingresar a esta opcion");


                        System.out.println("""
                                           Que desea hacer?
                                           1. Capturar Pokemon
                                           2. Entrenar Pokemon""");
                        int opcionCatch = read.nextInt();

                        switch (opcionCatch) {

                            case 1: {



                                if (cont2 < 6) {
                                    read.nextLine();
                                    System.out.println("Ingresar sus 6 pokemones: ");

                                    System.out.println("Ingrese su especie: ");
                                    String especie = read.nextLine();

                                    int cont = 0;
                                    while (cont < 3) {
                                        System.out.println("""
                                                           Ingrese su tipo de ataque
                                                           1. Fisico/Especial
                                                           2. Estado""");
                                        int opcion3 = read.nextInt();
                                        Movimiento[] moves = new Movimiento[4];
                                        switch (opcion3) {
                                            case 1: {
                                                read.nextLine();
                                                System.out.println("Ingrese un ataque fisico o especial: ");
                                                String ataque = read.nextLine();
                                                int stat = 1 + rng.nextInt(50);
                                                FisicoEspecial move = new FisicoEspecial(stat, ataque);
                                                moves[cont] = move;
                                                break;
                                            }
                                            case 2: {
                                                int opcion4 = 0;

                                                opcion4 = menuEstado();
                                                switch (opcion4) {
                                                    case 1: {

                                                        Estado move = new Estado("Toxic");
                                                        moves[cont] = move;

                                                        break;
                                                    }
                                                    case 2: {

                                                        Estado move = new Estado("Will-O-Wisp");
                                                        moves[cont] = move;

                                                        break;
                                                    }
                                                    case 3: {

                                                        Estado move = new Estado("Thunder Wave");
                                                        moves[cont] = move;

                                                        break;
                                                    }
                                                    case 4: {

                                                        Estado move = new Estado("Hypnosis");
                                                        moves[cont] = move;

                                                        break;
                                                    }
                                                    default: {

                                                        System.out.println("Ingreso un valor no valido");

                                                    }
                                                }//fin switch status moves

                                                break;
                                            }//fin 
                                        }
                                        Pokemon notPikachu = new Pokemon(especie, moves);

                                        cont++;
                                        pA.add(new Pokemon(especie, moves));
                                        cont2++;
                                    }

                                }
                            }
                        
                        break;

                        case 2: {

                        }
                        break;

                    }

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
    
    static void printE(){
        
        String acum = "";
        
        for (Entrenador trainer : listaE) {
            
            acum+= listaE.indexOf(trainer)+"- "+trainer.getNombre()+"\n";
            
        }
        System.out.println(acum);
        
    }

}
