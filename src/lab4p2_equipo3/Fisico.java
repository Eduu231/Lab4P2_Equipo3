package lab4p2_equipo3;

public class Fisico extends FisicoEspecial {

    public Fisico(int AtkE, int baseAtk, String nombre) {
        super(AtkE, baseAtk, nombre);
    }

   

    

    @Override
    public String accion(Pokemon p, int move) {
        int atq = ((FisicoEspecial) p.getM()[move]).getBaseAtk();
        String dmg = "";
        int dmgInt = atq * 2;
        dmg = Integer.toString(dmgInt);
        return dmg;
    }

}
