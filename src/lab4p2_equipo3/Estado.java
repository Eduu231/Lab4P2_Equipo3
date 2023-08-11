
package lab4p2_equipo3;

import java.util.Random;

public class Estado extends Movimiento {
    
    
    
    private int RNGesus;

    public Estado(int RNGesus, String nombre) {
        super(nombre);
        this.RNGesus = RNGesus;
    }

    public int getRNGesus() {
        return RNGesus;
    }

    public void setRNGesus(int RNGesus) {
        this.RNGesus = RNGesus;
    }
    
    @Override
    public String accion(Pokemon p, Estado e){
        
        Random rng = new Random();
        String efecto = "";
        if(e.getNombre().equalsIgnoreCase("Toxic")){
            
            
            
        }
        
        return efecto;
        
    }
    
}
