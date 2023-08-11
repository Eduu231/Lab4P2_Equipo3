
package lab4p2_equipo3;

import java.util.Random;

public class Estado extends Movimiento {

    private int RNGesus;

    public Estado(String nombre) {
        super(nombre);
    }

    public int getRNGesus() {
        return RNGesus;
    }

    public void setRNGesus(int RNGesus) {
        this.RNGesus = RNGesus;
    }
    
    @Override
    public String accion(Pokemon p, int move){
        
        Random rng = new Random();
        p.getM();
        Movimiento m;
        m = p.getM()[move];
        String efecto = "";
        int random = rng.nextInt();
        if(m.getNombre().equalsIgnoreCase("Toxic")){
            
            if(random>= 1 && random <= 75){
                
                efecto = "Envenenado";
                
            }
            
        }
        
        if(m.getNombre().equalsIgnoreCase("Will-O-Wisp")){
            
            if(random>= 1 && random <= 75){
                
                efecto = "Quemado";
                
            }
            
        }
        
        if(m.getNombre().equalsIgnoreCase("Thunder Wave")){
            
            if(random>= 1 && random <= 75){
                
                efecto = "Paralizado";
                
            }
            
        }
        
        if(m.getNombre().equalsIgnoreCase("Hypnosis")){
            
            if(random>= 1 && random <= 75){
                
                efecto = "Dormido";
                
            }
            
        }
        
        return efecto;
        
    }
    
}
