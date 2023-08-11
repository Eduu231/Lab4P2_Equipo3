
package lab4p2_equipo3;

import java.util.Scanner;


public class Lab4P2_Equipo3 {

    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        
    int opcion = 0;
    
    while (opcion !=4){
        
        opcion = menuInicial();
        
        switch(opcion){
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
                System.out.println("Salir");
                break;
            }
        }
    }
        
        
        
    }
    private static int menuInicial(){
        int op = 0;
        
        System.out.println("""
                           1- Registrar Entrenador
                           2- Battle Factory
                           3- Capturar/Entrenar
                           4- Salir
                           """);
        
        op = read.nextInt();
        
        return op;
    }
    
}
