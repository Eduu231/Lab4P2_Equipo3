
package lab4p2_equipo3;

public abstract class FisicoEspecial extends Movimiento{
    
    private int baseAtk;
    private int AtkE;

    public FisicoEspecial(int baseAtk, String nombre) {
        super(nombre);
        this.baseAtk = baseAtk;
    }

   
    public FisicoEspecial(int AtkE, int baseAtk, String nombre) {
        super(nombre);
        this.baseAtk = baseAtk;
        this.AtkE = AtkE;
    }

    public int getBaseAtk() {
        return baseAtk;
    }

    public void setBaseAtk(int baseAtk) {
        this.baseAtk = baseAtk;
    }

    public int getAtkE() {
        return AtkE;
    }

    public void setAtkE(int AtkE) {
        this.AtkE = AtkE;
    }
    
    
    
    public abstract String accion(Pokemon p , int move);
        
//        String dmg = "";
//        Movimiento m = p.getM()[move];
//        int atq = ((FisicoEspecial)m).getBaseAtk();
//        int dmgInt = atq * 2;
//        dmg = Integer.toString(dmgInt);
//        return dmg;
    
    
}
