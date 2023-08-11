
package lab4p2_equipo3;

public class Especial extends FisicoEspecial{

    public Especial(int AtkE, int baseAtk, String nombre) {
        super(AtkE, baseAtk, nombre);
    }

    

    @Override
    public String accion(Pokemon p, int move) {
         int atq = ((FisicoEspecial) p.getM()[move]).getBaseAtk();
         int atqE = ((FisicoEspecial) p.getM()[move]).getAtkE();
         
         int atqT = 
    }
    
}
