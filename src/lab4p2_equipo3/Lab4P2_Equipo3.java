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
                    Entrenador e1, e2;

                    System.out.println("You're a Pokémon trainer, right? So am I <Inicia Batalla>");
                    printE();
                    System.out.println("Seleccione 1 entrenador");
                    int posE1 = read.nextInt();

                    System.out.println("Seleccione 1 entrenador");

                    int posE2 = read.nextInt();
                    if (posE2 > 0 && posE2 < listaE.size()) {

                        e1 = listaE.get(posE1);
                        System.out.println("Eliga el pokemon a batalla: ");
                        //printPokemon(e1, 1);
                        int eleccion = read.nextInt();
                        Pokemon p1 = e1.getEquipo()[eleccion];

                        e2 = listaE.get(posE2);
                        System.out.println("Eliga el pokemon a batalla: ");
                        //printPokemon(e2, 1);
                        int eleccion2 = read.nextInt();
                        Pokemon p2 = e2.getEquipo()[eleccion2];

                        while (p1.getPtsVida() >= 0 || p2.getPtsVida() >= 0) {

                            System.out.println("Entrenador 1 elegir ataque de su pokemon: ");
                            menuAtaq(p1);
                            int ataqueE1 = read.nextInt();
                            System.out.println("Entrenador 2 elegir ataque de su pokemon: ");
                            menuAtaq(p2);
                            int ataqueE2 = read.nextInt();

                            if (p1.getVelocidad() > p2.getVelocidad()) {
                                p1.getM()[ataqueE1].accion(p1, ataqueE1);
                                if (p1.getM()[ataqueE1] instanceof Estado) {
                                    p2.setE(((Estado) p1.getM()[ataqueE1]).accion(p1, ataqueE1));
                                } else if (p1.getM()[ataqueE1] instanceof Fisico) {
                                    if (p1.getPtsAtaq() > p2.getPtsAtaq()) {
                                        p2.setPtsVida(p2.getPtsVida() - Integer.parseInt(((Fisico) p1.getM()[ataqueE1]).accion(p1, ataqueE1)));
                                    } else {
                                        p2.setPtsVida(p2.getPtsVida() - Integer.parseInt(((Fisico) p1.getM()[ataqueE1]).accion(p1, ataqueE1)) / 4);
                                    }
                                }
                                p2.getM()[ataqueE2].accion(p2, ataqueE2);
                                if (p2.getM()[ataqueE2] instanceof Estado) {
                                    p1.setE(((Estado) p2.getM()[ataqueE2]).accion(p2, ataqueE2));
                                } else if (p2.getM()[ataqueE2] instanceof Fisico) {
                                    if (p2.getPtsAtaq() > p1.getPtsAtaq()) {
                                        p1.setPtsVida(p1.getPtsVida() - Integer.parseInt(((Fisico) p2.getM()[ataqueE1]).accion(p2, ataqueE1)));
                                    } else {
                                        p1.setPtsVida(p1.getPtsVida() - Integer.parseInt(((Fisico) p2.getM()[ataqueE2]).accion(p2, ataqueE2)) / 4);
                                    }
                                }
                            } else {
                                p1.getM()[ataqueE1].accion(p1, ataqueE1);
                                if (p1.getM()[ataqueE1] instanceof Estado) {
                                    p2.setE(((Estado) p1.getM()[ataqueE1]).accion(p1, ataqueE1));
                                } else if (p1.getM()[ataqueE1] instanceof Fisico) {
                                    if (p1.getPtsAtaq() > p2.getPtsAtaq()) {
                                        p2.setPtsVida(p2.getPtsVida() - Integer.parseInt(((Fisico) p1.getM()[ataqueE1]).accion(p1, ataqueE1)));
                                    } else {
                                        p2.setPtsVida(p2.getPtsVida() - Integer.parseInt(((Fisico) p1.getM()[ataqueE1]).accion(p1, ataqueE1)) / 4);
                                    }
                                }
                                p2.getM()[ataqueE2].accion(p2, ataqueE2);
                                if (p2.getM()[ataqueE2] instanceof Estado) {
                                    p1.setE(((Estado) p2.getM()[ataqueE2]).accion(p2, ataqueE2));
                                } else if (p2.getM()[ataqueE2] instanceof Fisico) {
                                    if (p2.getPtsAtaq() > p1.getPtsAtaq()) {
                                        p1.setPtsVida(p1.getPtsVida() - Integer.parseInt(((Fisico) p2.getM()[ataqueE1]).accion(p2, ataqueE1)));
                                    } else {
                                        p1.setPtsVida(p1.getPtsVida() - Integer.parseInt(((Fisico) p2.getM()[ataqueE2]).accion(p2, ataqueE2)) / 4);
                                    }
                                }
                            }
                        }
                        if (p1.getPtsVida() > p2.getPtsVida()){
                            System.out.println("Entrenador 1 ha ganado");
                        }else{
                            System.out.println("Entrenador 2 ha ganado");
                        }
                    } else {
                        System.out.println("Indice fuera de rango");

                    }

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

                                Movimiento[] moves = new Movimiento[4];
                                if (cont2 < 6) {
                                    read.nextLine();
                                    System.out.println("Ingresar sus 6 pokemones: ");

                                    System.out.println("Ingrese su especie: ");
                                    String especie = read.nextLine();

                                    int cont = 0;
                                    while (cont < 4) {

                                        System.out.println("Seleccione 4 movimientos");
                                        printMoves();
                                        int opcionMoves = read.nextInt();
                                        moves[cont] = movesA.get(opcionMoves);
                                        cont++;

                                        Pokemon notPikachu = new Pokemon(especie, moves);
                                        listaE.get(trainerC).getEquipo()[cont2] = notPikachu;
                                    }//fin while3

                                    cont++;
                                    pA.add(new Pokemon(especie, moves));
                                    cont2++;
                                }//fin cont 2 if
                            }//fin case 1

                            break;

                            case 2: {

                                System.out.println("Ha ingresado a la opcion de entrenar pokemon");
                                System.out.println("""
                                                   En donde se ubica el pokemon que desea entrenar: 
                                                   1. Equipo
                                                   2. Caja""");
                                int entrenar = read.nextInt();
                                Pokemon x;
                                int option;
                                if (entrenar == 1) {

                                    printPokemon(listaE.get(trainerC), entrenar);
                                    option = read.nextInt();
                                    x = listaE.get(trainerC).getEquipo()[option];

                                } else {

                                    printPokemon(listaE.get(trainerC), entrenar);
                                    option = read.nextInt();
                                    x = listaE.get(trainerC).getCaja().get(option);

                                }

                                int multiplier = 1 + rng.nextInt(1);
                                int expBottle = 100 + rng.nextInt(4899);
                                int expTotal = expBottle * multiplier;
                                x.setPuntosExp(expTotal + x.getPuntosExp());
                                if (expTotal + x.getPuntosExp() >= x.getPuntosNecesarios()) {

                                    x.setNivel(x.getNivel() + 1);

                                } else {
                                    x.setPuntosNecesarios(x.getPuntosNecesarios() - expTotal);
                                }

                                if (entrenar == 1) {

                                    listaE.get(trainerC).getEquipo()[option] = x;

                                } else {

                                    listaE.get(trainerC).getCaja().add(option, x);
                                    listaE.get(trainerC).getCaja().remove(option + 1);

                                }

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
                            System.out.println("""
                                               Ingrese su tipo de ataque:
                                               1- Fisico
                                               2- Especial""");

                            int stat = 1 + rng.nextInt(50);
                            int opcionFE = read.nextInt();
                            read.nextLine();
                            System.out.println("Ingrese el nombre del ataque");
                            String ataque = read.nextLine();
                            switch (opcionFE) {

                                case 1: {

                                    Fisico f = new Fisico(stat, ataque);
                                    movesA.add(f);

                                }
                                break;

                                case 2: {

                                    int specialAtk = 100 + rng.nextInt(400);
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

    private static void menuAtaq(Pokemon p) {
        int op = 0;

        for (int i = 0; i < p.getM().length; i++) {
            System.out.print("[" + p.getM()[i].getNombre() + "]");
        }
        System.out.println("");

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

    static void printMoves() {

        String acum = "";
        for (Movimiento move : movesA) {

            acum += movesA.indexOf(move) + "- " + move.getNombre() + "\n";

        }
        System.out.println(acum);

    }

    static void printPokemon(Entrenador Ash, int opcion) {

        String acum = "";
        if (opcion == 1) {
            for (int i = 0; i < Ash.getEquipo().length; i++) {

                acum += i + "- " + Ash.getEquipo()[i].getEspecie();

            }
        } else {

            for (Pokemon pikachunt : Ash.getCaja()) {

                acum += Ash.getCaja().indexOf(pikachunt) + "- " + pikachunt.getEspecie() + "\n";

            }

        }

        System.out.println(acum);

    }

}
