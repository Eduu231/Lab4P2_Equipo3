
package lab4p2_equipo3;

import java.util.ArrayList;


public class Entrenador {

    private String nombre;
    private int edad;
    private double dinero;
    private Pokemon [] equipo ;
    private ArrayList caja;

    public Entrenador(String nombre, int edad, double dinero, Pokemon [] equipo, ArrayList caja) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.equipo = equipo;
        this.caja = caja;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public Pokemon[] getEquipo() {
        return equipo;
    }

    public void setEquipo(Pokemon[] equipo) {
        this.equipo = equipo;
    }

    public ArrayList getCaja() {
        return caja;
    }

    public void setCaja(ArrayList caja) {
        this.caja = caja;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + ", caja=" + caja + '}';
    }
    
    
    
    
}
