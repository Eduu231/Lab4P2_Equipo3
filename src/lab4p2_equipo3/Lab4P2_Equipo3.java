package lab4p2_equipo3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Lab4P2_Equipo3 {

    static Random rng = new Random();
    static Scanner read = new Scanner(System.in);
    static ArrayList<Entrenador> listaE = new ArrayList();
    static ArrayList<Movimiento> movesA = new ArrayList();

    public static void main(String[] args) {
        //ArrayList caja = new ArrayList();

        ArrayList pA = new ArrayList();

        int opcion = 0;

        while (opcion != 5) {
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

                    System.out.println("You're a Pokémon trainer, right? So am I <Inicia Batalla>");

                    break;
                }
                case 3: {
                    if (!listaE.isEmpty()) {
                        System.out.println("Ingrese el entrenador que desea ingresar a esta opcion");
                        printE();
                        int trainerC = read.nextInt();
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
                                    Movimiento[] moves = new Movimiento [4];
                                    while (cont < 4) {
                                        
                                        System.out.println("Seleccione 4 movimientos");
                                        printMoves();
                                        int opcionMoves = read.nextInt();
                                        moves[cont] = movesA.get(opcionMoves);
                                        
                                        
                                    }//fin while3
                                    Pokemon notPikachu = new Pokemon(especie, moves);
                                    listaE.get(trainerC).getEquipo()[cont] = notPikachu;
                                    cont++;
                                    pA.add(new Pokemon(especie, moves));
                                    cont2++;
                                }//fin cont 2 if
                            }//fin case 1

                            break;

                            case 2: {

                            }
                            break;

                        }//fin opcion catch (switch)

                    }//fin if empty
                }//fin case 3
                case 4: {

                    System.out.println("""
                                                           Ingrese su tipo de ataque
                                                           1. Fisico/Especial
                                                           2. Estado""");
                    int opcion3 = read.nextInt();
                    Movimiento[] moves = new Movimiento[4];
                    switch (opcion3) {
                        case 1: {
                            read.nextLine();
                            System.out.println("""
                                               Ingrese su tipo de ataque:
                                               1- Fisico
                                               2- Especial""");
                            String ataque = read.nextLine();
                            int stat = 1 + rng.nextInt(50);
                            int opcionFE = read.nextInt();
                            switch(opcionFE){
                                
                                case 1 : {
                                    
                                    Fisico f = new Fisico(stat , ataque);
                                    movesA.add(f);
                                    
                                    
                                }
                                break;
                                
                                case 2 : {
                                    
                                    int specialAtk =100 + rng.nextInt(400);
                                    Especial e = new Especial(specialAtk, stat, ataque);
                                    
                                }//fin case 2
                                break;
                                
                            }
                            
                            break;
                        }
                        case 2: {
                            int opcion4 = 0;

                            opcion4 = menuEstado();
                            switch (opcion4) {
                                case 1: {

                                    Estado move = new Estado("Toxic");
                                    movesA.add(move);

                                    break;
                                }
                                case 2: {

                                    Estado move = new Estado("Will-O-Wisp");
                                    movesA.add(move);

                                    break;
                                }
                                case 3: {

                                    Estado move = new Estado("Thunder Wave");
                                    movesA.add(move);

                                    break;
                                }
                                case 4: {

                                    Estado move = new Estado("Hypnosis");
                                    movesA.add(move);

                                    break;
                                }
                                default: {

                                    System.out.println("Ingreso un valor no valido");

                                }
                            }//fin switch status moves

                            break;
                        }//fin case special moves
                    }//fin switch opcion 3
                    
                }
                
                break;
                
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

    static void printE() {

        String acum = "";

        for (Entrenador trainer : listaE) {

            acum += listaE.indexOf(trainer) + "- " + trainer.getNombre() + "\n";

        }
        System.out.println(acum);

    }
    static void printMoves(){
        
        String acum = "";
        for (Movimiento move : movesA) {
            
            acum+=movesA.indexOf(move)+"- "+move.getNombre()+"\n";
            
        }
        System.out.println(acum);
        
    }

}
