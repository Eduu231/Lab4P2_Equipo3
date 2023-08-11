
package lab4p2_equipo3;

public class Pokemon {
    
    private String especie;
    private int nivel;
    private int puntosExp;
    private int puntosNecesarios;
    private int ptsVida;
    private int ptsAtaq;
    private int defensa;
    private int especial;
    private double velocidad;
    private Estado e;
    private Movimiento [] m;

    public Pokemon(String especie, int nivel, int puntosExp, int puntosNecesarios, int ptsVida, int ptsAtaq, int defensa, int especial, double velocidad, Estado e, Movimiento[] m) {
        this.especie = especie;
        this.nivel = nivel;
        this.puntosExp = puntosExp;
        this.puntosNecesarios = puntosNecesarios;
        this.ptsVida = ptsVida;
        this.ptsAtaq = ptsAtaq;
        this.defensa = defensa;
        this.especial = especial;
        this.velocidad = velocidad;
        this.e = e;
        this.m = m;
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

    public Estado getE() {
        return e;
    }

    public void setE(Estado e) {
        this.e = e;
    }

    public Movimiento[] getM() {
        return m;
    }

    public void setM(Movimiento[] m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "especie=" + especie + ", nivel=" + nivel + ", puntosExp=" + puntosExp + ", puntosNecesarios=" + puntosNecesarios + ", ptsVida=" + ptsVida + ", ptsAtaq=" + ptsAtaq + ", defensa=" + defensa + ", especial=" + especial + ", velocidad=" + velocidad + ", e=" + e + ", m=" + m + '}';
    }

    
    
    
}

