
package lab4p2_equipo3;

public abstract class Movimiento {
    
    private String nombre;

    public Movimiento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract String accion(Pokemon p);
    
}
