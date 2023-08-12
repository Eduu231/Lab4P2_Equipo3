
package lab4p2_equipo3;
import java.util.Random;
public class Pokemon {
    static Random rng = new Random();
    private String especie;
    private int nivel;
    private int puntosExp;
    private int puntosNecesarios;
    private int ptsVida;
    private int ptsAtaq;
    private int defensa;
    private int especial;
    private double velocidad;
    private String estado;
    private Movimiento [] m;

    public Pokemon(){
        
    }
    
    public Pokemon(String especie, Movimiento[] m) {
        this.especie = especie;
        this.m = m;
        this.nivel = 1+rng.nextInt(99);
        this.puntosExp = 0;
        this.puntosNecesarios = 1000 +rng.nextInt(4000);
        this.ptsVida = 50 + rng.nextInt(150);
        this.ptsAtaq = rng.nextInt(100);
        this.defensa = rng.nextInt(100);
        this.especial = rng.nextInt(100);
        this.velocidad = rng.nextInt(100);
        this.estado = "";
        
        
    }

    

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosExp() {
        return puntosExp;
    }

    public void setPuntosExp(int puntosExp) {
        this.puntosExp = puntosExp;
    }

    public int getPuntosNecesarios() {
        return puntosNecesarios;
    }

    public void setPuntosNecesarios(int puntosNecesarios) {
        this.puntosNecesarios = puntosNecesarios;
    }

    public int getPtsVida() {
        return ptsVida;
    }

    public void setPtsVida(int ptsVida) {
        this.ptsVida = ptsVida;
    }

    public int getPtsAtaq() {
        return ptsAtaq;
    }

    public void setPtsAtaq(int ptsAtaq) {
        this.ptsAtaq = ptsAtaq;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getEspecial() {
        return especial;
    }

    public void setEspecial(int especial) {
        this.especial = especial;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getE() {
        return estado;
    }

    public void setE(String e) {
        this.estado= e;
    }

    public Movimiento[] getM() {
        return m;
    }

    public void setM(Movimiento[] m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "Pokemon" + "\n" +"especie: " + especie + "\n" +"nivel: " + nivel + "\n" +"puntosExp: " + puntosExp + "\n" +"puntosNecesarios: " + puntosNecesarios + "\n" +"ptsVida: " + ptsVida + "\n" +"ptsAtaq: " + ptsAtaq + "\n" +"defensa: " + defensa + "\n" + "especial: " + especial + "\n" +"velocidad: " + velocidad + "\n" +"e: " + estado + "\n" +"m: " + m + "\n" ;
    }

    
    
    
}

