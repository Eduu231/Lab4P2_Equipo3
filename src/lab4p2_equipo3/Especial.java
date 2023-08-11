
package lab4p2_equipo3;

public class Especial extends FisicoEspecial{

    public Especial(int AtkE, int baseAtk, String nombre) {
        super(AtkE, baseAtk, nombre);
    }

    

    @Override
    public String accion(Pokemon p, int move) {
        String dmg = "";
         int atq = ((FisicoEspecial) p.getM()[move]).getBaseAtk();//random1
         int atqE = ((FisicoEspecial) p.getM()[move]).getAtkE();//random2
         
         int atqT = atq + atqE;
         if (atqT == atqE){
             atq = atqE;
             dmg += atq;
         }else{
             dmg += atq;
         }
         return dmg;
    }
    
}
