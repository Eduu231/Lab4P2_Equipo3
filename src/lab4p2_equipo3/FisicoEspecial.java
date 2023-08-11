
package lab4p2_equipo3;

public class FisicoEspecial extends Movimiento{
    
    private int baseAtk;

    public FisicoEspecial(int baseAtk, String nombre) {
        super(nombre);
        this.baseAtk = baseAtk;
    }

    public int getBaseAtk() {
        return baseAtk;
    }

    public void setBaseAtk(int baseAtk) {
        this.baseAtk = baseAtk;
    }
    
    @Override
    public String accion(Pokemon p , int move){
        
        String dmg = "";
        Movimiento m = p.getM()[move];
        int atq = ((FisicoEspecial)m).getBaseAtk();
        int dmgInt = atq * 2;
        dmg = Integer.toString(dmgInt);
        return dmg;
    }
    
}
