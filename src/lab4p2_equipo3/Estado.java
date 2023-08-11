
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
        
        return efecto;
        
    }
    
}
